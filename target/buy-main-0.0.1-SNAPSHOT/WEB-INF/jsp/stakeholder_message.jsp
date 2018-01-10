<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>干系人信息</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<%@ include file="header.jsp"%>
</head>
<body>
	<%@ include file="navbar.jsp"%>
	<!----------------------------------------- 内容 -------------------------->



	<div id="content" class="span10">
		<div class="row-fluid sortable">

			<div class="box span12">
				<div class="box-header well" data-original-title>
					<h2>项目组干系人</h2>
				</div>
				<div class="box-content">
					<div style="float: right;">
						<a href="findAll.html?user_type=0">添加项目组干系人</a>
					</div>
					<table class="table table-striped table-bordered ">
						<thead>
							<tr>
								<th>姓名</th>
								<th>部门</th>
								<th>角色</th>
								<th>责任描述</th>
								<th>手机号码</th>
								<th>座机号码</th>
								<th>电子邮箱</th>
								<th>QQ</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${requestScope.memberList }" var="memberList">
								<tr>
									<td>${memberList.employee_Name }</td>
									<td>${memberList.department_name}</td>
									<td>${memberList.role_Name }</td>
									<td>${memberList.duty }</td>
									<td>${memberList.employee_Phone }</td>
									<td><c:if test="${empty memberList.employee_Telephone }">没有座机电话</c:if>${memberList.employee_Telephone }</td>
									<td><a href="">${memberList.employee_Email }</a></td>
									<td><a href="#">${memberList.employee_Qq }</a></td>
									<td><a class="del"
										href="deleteMemberOrClient.html?phone=${memberList.employee_Phone }&userType=0">删除</a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
			<div class="row-fluid sortable">
			<div class="box span12">
				<div class="box-header well" data-original-title>
					<h2>客户</h2>
				</div>
				<div class="box-content">
					<div style="float: right;">
						<a href="findAll.html?user_type=1">添加客户</a>
					</div>
					<table class="table table-striped table-bordered  ">
						<thead>
							<tr>
								<th>姓名</th>
								<th>项目编号</th>
								<th>客户公司</th>
								<th>责任描述</th>
								<th>手机号码</th>
								<th>座机号码</th>
								<th>电子邮箱</th>
								<th>QQ</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${requestScope.clientList }" var="clientList">
								<tr>
									<td>${clientList.client_Name }</td>
									<td>${clientList.project_id }</td>
									<td>${clientList.client_Company}</td>
									<td>${clientList.duty }</td>
									<td>${clientList.client_Phone }</td>
									<td><c:if test="${empty clientList.client_Telephone }">没有座机电话</c:if>${clientList.client_Telephone }</td>
									<td>${clientList.client_email }</td>
									<td>${clientList.client_Qq }</td>
									<td><a
										href="deleteMemberOrClient.html?phone=${clientList.client_Phone }&userType=1"
										class="del">删除</a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>

		</div>
	</div>

	</div>
	</div>
	</div>
	<script type="text/javascript">
		$(function() {
			$("a.del").click(function() {
				var is = confirm("确认删除吗？");
				return is;
			});

		});
	</script>
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