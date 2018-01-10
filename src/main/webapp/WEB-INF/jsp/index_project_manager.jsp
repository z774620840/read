<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>项目经理首页</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<%@ include file="header.jsp"%>
</head>
<script src="${pageContext.request.contextPath}/js/bootstrap-paginator.js"></script>
<script type="text/javascript">
	$(function() {
		var result = getResultForWorkload(1);
		result = getPageForWorkload(result);
	});
    //工作量列表
	function getResultForWorkload(p) {
		var result = "";
		$.ajax({
			type : "POST", //请求方式  
			url : "getWorkloadList.html", //请求路径  
			async : false, //同步方式 
			data : {
				"page" : p
			}, //传参  
			dataType : 'json', //返回值类型  
			success : function(page) {
				$("#workload tbody").children().remove();
				var workloadList = page.obj;
				if (workloadList != null) {
					for (i in workloadList) {
						var progress = workloadList[i].project_Progress;
						var progress_Str = "<div class='progress progress-striped progress-success active'>"
								+ "<div class='bar' style='width:"
								+ progress
								+ "%;'>"
								+ progress
								+ "%</div></div>";
						var progress_Status = workloadList[i].progress_Status;
						var progress_Status_Str;
						if (progress_Status == 0) {
							progress_Status_Str = "<span class='label label-success'>正常</span>";
						} else if (progress_Status == 1) {
							progress_Status_Str = "<span class='label label-info'>异常</span>";
						} else if (progress_Status == 2) {
							progress_Status_Str = "<span class='label label-warning'>危险</span>";
						}
						$("#workload tbody").append(
								"<tr>" + "<td>" + workloadList[i].project_Id + "</td>"
										+ "<td><a href ='project_unified_view.html?pid="+workloadList[i].project_Id+"'>" + workloadList[i].project_Name+"</a></td>"
										+ "<td>" +workloadList[i].assess_Workload+ "</td>"
										+ "<td>" +workloadList[i].actual_Workload + "</td>"
										+ "<td>" +workloadList[i].workload_Proportion + "</td>"
										+ "<td>" +workloadList[i].days + "</td>"
										+ "<td>" +workloadList[i].weekly_Workload +"</td>"
										+ "<td>" +progress_Str + "</td>"
										+ "<td>" +progress_Status_Str 
										+ "</td></tr>");
					}
				}
				result = page;
			},
			error : function() {

			}

		});
		return result;
	}

	
	//工作量列表
	function getPageForWorkload(result){
		var PageNum = 5;
		$('#pageLimitForWorkload')
		.bootstrapPaginator(
				{
					currentPage : result.currentPage==0?1:result.currentPage,
					totalPages : result.totalPage==0?1:result.totalPage,
					size : "normal",
					bootstrapMajorVersion : 3,
					numberOfPages : PageNum,
					shouldShowPage : true,
					itemTexts : function(type, page, current) {
						$("#pageLimitForWorkload").find("li").removeClass("active");
						$("#pageLimitForWorkload").find("li").eq((current - 1) % PageNum + 2).addClass("active");
						if (current == 1) {
							$("#pageLimitForWorkload li:first").addClass("active");
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
						result = getResultForWorkload(page);
					}
				});
		return result;
	}
</script>
<body>
<%@ include file="navbar.jsp"%>

<!----------------------------------------- 内容 -------------------------->
<div id="content" class="span10">
	<div class="row-fluid sortable">
		<div class="box span12">
			<div class="box-header well" data-original-title>
				<h2>项目汇总</h2>
			</div>

			<div class="box-content">
				<table class="table table-striped table-bordered " id="workload"> 
					<thead>
						<tr>
							<th>项目编号</th>
							<th>项目名称</th>
							<th>考核工作量（人日）</th>
							<th>实际工作量（人日）</th>
							<th>工作量比例</th>
							<th>按资源计划估算可投入天数</th>
							<th>本周发生工作量</th>
							<th>进度</th>
							<th>进度状态</th>
						</tr>
					</thead>
					<tbody>
					</tbody>
				</table>
				
			<!-- 分页按钮 -->
			<div class="pagination pagination-centered">
				<div align="center">
					<nav aria-label="Page navigation">
						<ul class="pagination" id="pageLimitForWorkload">
						</ul>
					</nav>
				</div>
			</div>
			</div>
		</div>
<!-- 个人事项 -->
		<div class="row-fluid sortable">
			<div class="box span12">
				<ul class="nav nav-tabs">
					<li role="presentation" class="active"><a href="#">待办事项</a>
					<li role="presentation"><a href="#">已办事项</a>
					<li role="presentation"><a href="#">待阅事项</a>
					<li role="presentation"><a href="#">已阅事项</a>
				</ul>
				<div class="box-content">
					<table class="table table-striped table-bordered ">
						<thead>
							<tr>
								<th>标题</th>
								<th>当前环节</th>
								<th>发送人</th>
								<th>发送人</th>
								<th>代办类型</th>
								<th>接受时间</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>David R</td>
								<td>2012/01/01</td>
								<td>Member</td>
								<td class="center"><span class="label label-success">Active</span></td>
								<td class="center"><span class="label label-success">Active</span></td>
								<td>Member</td>

							</tr>

						</tbody>
					</table>
					<div class="pagination pagination-centered">
						<ul>
							<li><a href="#">Prev</a></li>
							<li class="active"><a href="#">1</a></li>
							<li><a href="#">2</a></li>
							<li><a href="#">3</a></li>
							<li><a href="#">4</a></li>
							<li><a href="#">Next</a></li>
						</ul>
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
