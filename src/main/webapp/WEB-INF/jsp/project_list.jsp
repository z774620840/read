<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>项目管理系统首页</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<%@ include file="header.jsp"%>
</head>
<script src="${pageContext.request.contextPath}/js/bootstrap-paginator.js"></script>
<script type="text/javascript">
	function getResult(p) {
		var result = "";
		$.ajax({
			type : "POST", //请求方式  
			url : "getProjectList.html", //请求路径  
			async : false, //同步方式 
			data : {
				"page" : p
			}, //传参  
			dataType : 'json', //返回值类型  
			success : function(page) {
				$("tbody").children().remove();
				var projectList = page.obj;
				if (projectList != null) {
					for (i in projectList) {
						var pname = projectList[i].project_Name;
						var company = projectList[i].company;
						var department = projectList[i].department;
						var pm = projectList[i].pm;
						var business = projectList[i].business;
						var project_Status = projectList[i].project_Status;
						var project_Status_Str;
						if (project_Status == 0) {
							project_Status_Str = "项目实施中";
						} else if (project_Status == 1) {
							project_Status_Str = "项目已初验";
						} else if (project_Status == 2) {
							project_Status_Str = "项目已终验";
						}
						var progress_Status = projectList[i].progress_Status;
						var progress_Status_Str;
						if (progress_Status == 0) {
							progress_Status_Str = "<span class='label label-success'>正常</span>";
						} else if (progress_Status == 1) {
							progress_Status_Str = "<span class='label label-info'>异常</span>";
						} else if (progress_Status == 2) {
							progress_Status_Str = "<span class='label label-warning'>危险</span>";
						}
						var progress = projectList[i].progress;
						var progress_Str = "<div class='progress progress-striped progress-success active'>"
								+ "<div class='bar' style='width:"
								+ progress
								+ "%;'>"
								+ progress
								+ "%</div></div>";
						var pid = projectList[i].project_Id;
						var check_Str = "<a href='project_unified_view.html?pid="
								+ pid
								+ "'>"
								+ "<span title='查看项目' class='icon32 icon-orange icon-book'></span>"
								+ "</a>"
						$("tbody").append(
								"<tr>" + "<td>" + pname + "</td>"
										+ "<td>" + company + "</td>"
										+ "<td>" + department + "</td>"
										+ "<td>" + pm + "</td>"
										+ "<td>" + business + "</td>"
										+ "<td>" + project_Status_Str
										+ "</td>" + "<td>"
										+ progress_Status_Str + "</td>"
										+ "<td>" + progress_Str
										+ "</td>" + "<td>" + check_Str
										+ "</td>" + "</tr>");
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
<body>
	<%@ include file="navbar.jsp"%>
	<!----------------------------------------- 内容 -------------------------->
	<div id="content" class="span10">
		<!-- content starts -->
		<div class="row-fluid sortable">
			<div class="box span12">
				<div class="box-header well" data-original-title>
					<h2>项目列表</h2>
				</div>
				<div class="box-content">
					<form class="form-inline">
						<div class="form-group" style="float: left;">
							<label for="exampleInputName2">项目名称：</label> <input type="text"
								class="form-control" id="exampleInputName2"
								style="width: 100px;">
						</div>
						<div class="form-group" style="float: left;">
							<div class="dropdown">
								<label for="exampleInputName2">进度状态：</label> <select
									style="width: 100px;">
									<option value="0">正常</option>
									<option value="1">异常</option>
									<option value="2">危险</option>
								</select>
							</div>
						</div>
						<div class="form-group" style="float: left;">
							<label for="exampleInputName2">项目经理:</label> <input type="text"
								class="form-control" style="width: 100px;"
								id="exampleInputName2">
						</div>
						<div class="form-group" style="float: left;">
							<label for="exampleInputName2">业务人员:</label> <input type="text"
								class="form-control" style="width: 100px;"
								id="exampleInputName2">
						</div>
						<button type="submit" class="btn btn-default">查询</button>
					</form>
					<table class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>项目名称</th>
								<th>客户公司名称</th>
								<th>承建部门</th>
								<th>项目经理</th>
								<th>业务人员</th>
								<th>项目状态</th>
								<th>进度状态</th>
								<th>项目进度</th>
								<th>查看选项</th>
							</tr>
						</thead>
						<tbody>
							
						</tbody>
					</table>
				</div>
			</div>
			<!--/span-->
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
	<!--/row-->

	<hr>

	<div class="modal hide fade" id="myModal">
		<div class="modal-header">
			<button type="button" class="close" data-dismiss="modal">×</button>
			<h3>Settings</h3>
		</div>
		<div class="modal-body">
			<p>Here settings can be configured...</p>
		</div>
		<div class="modal-footer">
			<a href="#" class="btn" data-dismiss="modal">Close</a> <a href="#"
				class="btn btn-primary">Save changes</a>
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