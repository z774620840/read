<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>项目统一视图</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<%@ include file="header.jsp"%>
<script src="${pageContext.request.contextPath}/js/bootstrap-paginator.js"></script>
<script type="text/javascript">
	function getResult(p) {
		var result = "";
		$.ajax({
			type : "POST", //请求方式  
			url : "getWeeklyReport.html", //请求路径  
			async : false, //同步方式 
			data : {
				"page":p,"pid":"${requestScope.project.project_Id }"
			}, //传参  
			dataType : 'json', //返回值类型  
			success : function(page) {
				$("#weeklyReport tbody").children().remove();
				var weeklyReportList = page.obj;
				if (weeklyReportList != null) {
					for (i in weeklyReportList) {
						var plan_Time = weeklyReportList[i].plan_Time;
						var actual_Time = weeklyReportList[i].actual_Time;
						var weekly_Report_Name = weeklyReportList[i].weekly_Report_Name;
						var progress_Status = weeklyReportList[i].progress_Status;
						var progress = weeklyReportList[i].progress;
						var issend_Email = weeklyReportList[i].issend_Email;
						var weekly_Report_Id = weeklyReportList[i].weekly_Report_Id;
						var progress_Status_Str;
						if (progress_Status == 0) {
							progress_Status_Str = "<span class='label label-success'>正常</span>";
						} else if (progress_Status == 1) {
							progress_Status_Str = "<span class='label label-info'>异常</span>";
						} else if (progress_Status == 2) {
							progress_Status_Str = "<span class='label label-warning'>危险</span>";
						}
						var progress_Str = "<div class='progress progress-striped progress-success active'>"
								+ "<div class='bar' style='width:"
								+ progress
								+ "%;'>"
								+ progress
								+ "%</div></div>";
						var issend_Email_Str = issend_Email==true?"已发送":"未发送"; 
						$("#weeklyReport tbody").append(
								"<tr>" + "<td>"+plan_Time+"</td>"
										+ "<td>" + actual_Time + "</td>"
										+ "<td><a href ='view_project_weekly.html?wid="+weekly_Report_Id+"'>" + weekly_Report_Name + "</td>"
										+ "<td>" + progress_Str + "</td>"
										+ "<td>" + progress_Status_Str+ "</td>"
										+ "<td>" + issend_Email_Str+ "</td></tr>");
					}
				}
				result = page;
			},
			error : function() {

			}

		});
		return result;
	}

	$(function() {
		//根据角色显示按钮
		if("${sessionScope.role.role_Name}"!="项目经理"){
			$("#edit_overview").remove();
			$("#save_overview").remove();
			$("#add_milestone").remove();
			$("#milestone_list tr td:last-child").remove();
			$("#milestone_list tr th:last-child").remove();
			$("#add_weeklyreport").remove();
		}
		$("#edit_overview").click(function(){
			if($("#save_overview").attr("disabled")){
				$("#overview input").removeAttr("disabled");
				$("#save_overview").removeAttr("disabled");
			}else{
				$("#overview input").attr("disabled","disabled");
				$("#save_overview").attr('disabled',true);
			}
		});
		$("#edit_workload").click(function(){
			if($("#save_workload").attr("disabled")){
				$("#workload input").removeAttr("disabled");
				$("#save_workload").removeAttr("disabled");
			}else{
				$("#workload input").attr("disabled","disabled");
				$("#save_workload").attr('disabled',true);
			}
		});
		$("#edit_memberworkload").click(function(){
			if($("#save_memberworkload").attr("disabled")){
				$("#memberworkload input").removeAttr("disabled");
				$("#save_memberworkload").removeAttr("disabled");
			}else{
				$("#memberworkload input").attr("disabled","disabled");
				$("#save_memberworkload").attr('disabled',true);
			}
		});
		//分页
		var result = getResult(1);
		var PageNum = 5;
		$('#pageLimit')
				.bootstrapPaginator(
						{
							currentPage : result.currentPage,
							totalPages : result.totalPage,
							size : "normal",
							bootstrapMajorVersion : 3,
							numberOfPages : PageNum,
							shouldShowPage : true,
							itemTexts : function(type, page, current) {
								$("#pageLimit").find("li")
										.removeClass("active");
								$("#pageLimit").find("li").eq(
										(current - 1) % PageNum + 2).addClass(
										"active");
								if (current == 1) {
									$("#pageLimit li:first").addClass("active");
								}
								switch (type) {
								case "first":
									return "首页";
								case "prev":
									return "上一页";
								case "next":
									return "下一页";
								case "last":
									return "末页";
								case "page":
									return page;
								}//默认显示的是第一页。
							},
							onPageClicked : function(event, originalEvent,
									type, page) {//给每个页眉绑定一个事件，其实就是ajax请求，其中page变量为当前点击的页上的数字。
								result = getResult(page);
							}
						});

	});

	
</script>
</head>
<body>
	<%@ include file="navbar.jsp"%>
	<!----------------------------------------- 内容 -------------------------->

	<div id="content" class="span10">
		<div class="box span12" style="height: 50px; border-radius: 5px;">
			<div style="height: 50px; float: left;">
				<img src="img/ajax-loaders/ajax-loader-1.gif">
			</div>
			<div style="float: left;">
				<h5 style="float: left;">项目名称：</h5>
				<div style="float: left;">${requestScope.project.project_Name }</div>
				<div style="clear: both;"></div>
				<h5 style="float: left;">项目经理：</h5>
				<div style="float: left;">${requestScope.project.pm }</div>
			</div>
		</div>
		<div class="row-fluid sortable">
			<div class="box span12">

				<div class="box-header well" data-original-title>
					<h2>项目详情</h2>
				</div>

				<div class="box-content">
				<div class="box-content">
					<ul class="nav nav-tabs" id="myTab">
						<li class="active"><a href="#progress">项目进度</a></li>
						<li><a href="#overview">项目概况</a></li>
						<li><a href="#workload">项目工作量</a></li>
						<li><a href="#memberworkload">个人工作量</a></li>
					</ul>
					<div id="myTabContent" class="tab-content">
						<div class="tab-pane active" id="progress">
							<table class="table">
								<tr >
									<td width="15%" style="text-align:right;">周报所属次数:</td>
									<td>${requestScope.weeklyReport.week }</td>
								</tr>
								<tr>
									<td style="text-align:right;">进度状态</td>
									<td>
									<c:if test="${requestScope.project.project_Status ==0}"><span class='label label-success'>正常</span></c:if>
									<c:if test="${requestScope.project.project_Status ==1}"><span class='label label-info'>异常</span></c:if>
									<c:if test="${requestScope.project.project_Status ==2}"><span class='label label-warning'>危险</span></c:if>
									</td>
								</tr>
								<tr >
									<td style="text-align:right;">总体进度</td>
									<td>
										<div class="progress progress-striped progress-success active">
											<div class="bar" style="width: ${requestScope.project.project_Progress }%;">${requestScope.project.project_Progress }%</div>
										</div>
									</td>
								</tr>
								<tr >
									<td style="text-align:right;">进度说明</td>
									<td>${requestScope.weeklyReport.progress_Remark }</td>
								</tr>
								<tr >
									<td style="text-align:right;">当前里程碑</td>
									<td>${requestScope.mileStone.milestone_Name }</td>
								</tr>
								<tr >
									<td style="text-align:right;">周报附件</td>
									<td>
										<c:if test="${empty requestScope.weeklyReport.weekly_Report_Accessory}">无</c:if>
										<c:if test="${not empty requestScope.weeklyReport.weekly_Report_Accessory}">
											<a href="${requestScope.weeklyReport.weekly_Report_Accessory}">${requestScope.weeklyReport.weekly_Report_Accessory }</a>
										</c:if>
								</tr>
		
							</table>
						</div>
						<div class="tab-pane" id="overview">
						<form action="editProject.html" method="post">
							<table class="table table-striped table-bordered " >
								<tr >
									<td width="15%" style="text-align:right;">业务价值</td>
									<td><input disabled="disabled" type="text" id="value" name= "value" value="${requestScope.project.value}"></td>
								</tr>
								<tr>
									<td style="text-align:right;">重点技术</td>
									<td><input disabled="disabled" type="text" id="technology" name= "technology" value="${requestScope.project.technology}"></td>
								</tr>
								<tr>
									<td style="text-align:right;">开发模式</td>
									<td><input disabled="disabled" type="text" id="mode" name= "mode" value="${requestScope.project.mode}"></td>
								</tr>
								<tr>
									<td style="text-align:right;">团队学习机会</td>
									<td><input disabled="disabled" type="text" id="learning_Opportunity" name= "learning_Opportunity" value="${requestScope.project.learning_Opportunity}"></td>
								</tr>
								<tr>
									<td style="text-align:right;">开发难度</td>
									<td><input disabled="disabled" type="text" id="difficulty" name= "difficulty" value="${requestScope.project.difficulty}"></td>
								</tr>
								<tr>
									<td style="text-align:right;">难度说明</td>
									<td><input disabled="disabled" type="text" id="difficulty_remark" name= "difficulty_remark" value="${requestScope.project.difficulty_remark}"></td>
								</tr>
								<tr>
									<td style="text-align:right;">配置服务器类型</td>
									<td><input disabled="disabled" type="text" id="config_server_type" name= "config_server_type" value="${requestScope.project.config_server_type}"></td>
								</tr>
								<tr>
									<td style="text-align:right;">配置服务器上映射路径</td>
									<td><input disabled="disabled" type="text" id="config_server_path" name= "config_server_path" value="${requestScope.project.config_server_path}"></td>
								</tr>
							</table>
							<input type="hidden" name="project_id" value = "${requestScope.project.project_Id}">				
						<button style="position: relative;left: 160px;" id="save_overview" type="submit" class="btn btn-warning" disabled="disabled">保存</button>	
						</form>
						
						<button style="position: relative;top:-46px;left: 100px;" id="edit_overview" class="btn btn-info">修改</button>
						
							
						
						</div>
						<div class="tab-pane" id="workload">
							<form action="editWorkload.html" method="post">
							<table class="table table-striped table-bordered " >
								<tr >
									<td width="15%" style="text-align:right;">考核工作量(人日)</td>
									<td><input disabled="disabled" type="number" min="0" id="assess_workload" name= "assess_workload" value="${requestScope.workload.assess_Workload}"></td>
								</tr>
								<tr>
									<td style="text-align:right;">实际工作量(人日)</td>
									<td><input disabled="disabled" type="number" min="0" id="actual_workload" name= "actual_workload" value="${requestScope.workload.actual_Workload}"></td>
								</tr>
								<tr>
									<td style="text-align:right;">工作量比例(%)</td>
									<td><input disabled="disabled" type="number" min="0" max="100" id="workload_proportion" name= "workload_proportion" value="${requestScope.workload.workload_Proportion}"></td>
								</tr>
								<tr>
									<td style="text-align:right;">按资源计划估算可投入天数</td>
									<td><input disabled="disabled" type="number" min="0" id="days" name= "days" value="${requestScope.workload.days}"></td>
								</tr>
								<tr>
									<td style="text-align:right;">本周发生工作量(人日)</td>
									<td><input disabled="disabled" type="number" min="0" id="weekly_workload" name= "weekly_workload" value="${requestScope.workload.weekly_Workload}"></td>
								</tr>
								</table>
							<input type="hidden" name="project_id" value = "${requestScope.project.project_Id}">				
						<button style="position: relative;left: 160px;" id="save_workload" type="submit" class="btn btn-warning" disabled="disabled">保存</button>	
						</form >
						
						<button style="position: relative;top:-46px;left: 100px;" id="edit_workload" class="btn btn-info">修改</button>
						</div>
						
						<div class="tab-pane" id="memberworkload">
							<form action="memberWorkload.html" method="post">
							<table class="table table-striped table-bordered " >
								<tr >
									<td width="15%" style="text-align:right;">个人工作量(人日)</td>
									<td><input disabled="disabled" type="number" min="0" id="member_workload" name= "member_workload" value="${requestScope.memberworkload.project_Member_Workload}"></td>
								</tr>
								</table>
							<input type="hidden" name="project_Id" value = "${requestScope.project.project_Id}">
							<input type="hidden"  name="user_Id" value = "${sessionScope.user_Id}">					
						<button style="position: relative;left: 160px;" id="save_memberworkload" type="submit" class="btn btn-warning" disabled="disabled">保存</button>	
						</form>
						<button style="position: relative;top:-46px;left: 100px;" id="edit_memberworkload" class="btn btn-info">修改</button>
						</div>				
					</div>
				</div>
				</div>
			</div>
		</div>
		<div class="box span4" style="width: 415px; margin-left: 0px;">
			<div class="box-header well" data-original-title>
				<h2>里程碑列表</h2>
			</div>
			<div class="box-content">
				<div style="float: right;" id="add_milestone">
					<a href="addMilestone.html?pid=${requestScope.project.project_Id}">添加里程碑</a>
				</div>
				<table class="table table-striped table-bordered " id="milestone_list">
					<thead>
						<tr>
							<th>里程碑名称</th>
							<th>计划交付时间</th>
							<th>实际交付时间</th>
							<th>当前状态</th>
							<th>编辑</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${mileStoneList }" var="milestone">
							<tr>
								<td>${milestone.milestone_Name }</td>
								<td>${milestone.plan_Delivery_Time }</td>
								<td>${milestone.actual_Delivery_Time }</td>
								<td><c:choose>
										<c:when test="${milestone.milestone_Status==0 }">未开始</c:when>
										<c:when test="${milestone.milestone_Status==1 }">实施中</c:when>
										<c:when test="${milestone.milestone_Status==2 }">正常完成</c:when>
										<c:when test="${milestone.milestone_Status==3 }">延期完成</c:when>
									</c:choose></td>
								<td><a href="edit_milestone.html?mid=${milestone.milestone_Id}&pid=${requestScope.project.project_Id}">编辑</a></td>
								
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
		<div class="row-fluid sortable">
			<div class="box span8" style="width: 600px; margin-left: 15px;">
				<div class="box-header well" data-original-title>
					<h2>项目周报列表</h2>
				</div>
				<div class="box-content">
					<div style="float: right;" id="add_weeklyreport">
						<a href="addWeeklyReport.html?pid=${requestScope.project.project_Id}">提交项目周报</a>
					</div>
					<table class="table table-striped table-bordered " id= "weeklyReport">
						<thead>
							<tr>
								<th>周报计划提交时间</th>
								<th>周报实际提交时间</th>
								<th>周报名称</th>
								<th>进度状态</th>
								<th>项目进度</th>
								<th>邮件发送</th>
							</tr>
						</thead>
						<tbody>
						<c:forEach items="${requestScope.reportList }" var="report">
								<tr>
									<td>${report.plan_Time }</td>
									<td>${report.actual_Time }</td>
									<td><a href="view_project_weekly.html?wid=${report.weekly_Report_Id}">${report.weekly_Report_Name }</a>a</td>
									<td>${report.progress }%</td>
									<c:choose>
										<c:when test="${report.progress_Status=='0' }">
											<td>正常</td>
										</c:when>
										<c:when test="${report.progress_Status=='1' }">
											<td>异常</td>
										</c:when>
										<c:when test="${report.progress_Status=='2' }">
											<td>危险</td>
										</c:when>
									</c:choose>

									<c:choose>
										<c:when test="${report.issend_Email=='false' }">
											<td>未发送</td>
										</c:when>
										<c:when test="${report.issend_Email=='true' }">
											<td>已发送</td>
										</c:when>
									</c:choose>
								</tr>
							</c:forEach>
						</tbody>
					</table>
					<div class="pagination pagination-centered">
						<div align="center">
							<nav aria-label="Page navigation">
								<ul class="pagination" id="pageLimit">
								</ul>
							</nav>
						</div>
					</div>
				</div>
			</div>

		</div>
	</div>
	</div>
	</div>
	<hr style="color: #003399;">
	<div class="navbar">
		<div class="navbar-inner">
			<div class="container-fluid">
				<p>&copy;第四小组</p>
			</div>
		</div>
	</div>

</body>

</html>