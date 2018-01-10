<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>账号管理</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<%@ include file="header.jsp"%>
</head>
<body>
	<%@ include file="navbar.jsp"%>
	<!----------------------------------------- 内容 -------------------------->
	<div id="content" class="span10">
		<div class="row-fluid sortable">
			<div class="box span12">
				<div class="box-header well">
					<h2>
						<i class="icon-th"></i> 账号管理
					</h2>
					<div class="box-icon">
						<a href="#" class="btn btn-minimize btn-round"><i
							class="icon-chevron-up"></i></a> <a href="#"
							class="btn btn-close btn-round"><i class="icon-remove"></i></a>
					</div>
				</div>
				<div class="box-content">
					<ul class="nav nav-tabs" id="myTab">

						<li>账号审批(部门经理)</li>

					</ul>

					<div class="tab-pane" id="approval">
						<h3>账号审批</h3>
						<div class="box-content">
							<table
								class="table table-striped table-bordered ">
								<thead>
									<tr>
										<th>姓名</th>
										<th>提交时间</th>
										<th>所属公司</th>
										<th>邮箱</th>
										<th>状态</th>
										<th>操作</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${requestScope.accountApplyList }"
										var="accountApplyList">
										<tr>
											<td>${accountApplyList.client_Name }</td>
											<td class="center">${accountApplyList.application_time }</td>
											<td class="center">${accountApplyList.client_Company }</td>
											<td class="center">${accountApplyList.client_Email}</td>
											<td class="center"><c:choose>
													<c:when test="${accountApplyList.pass_status==0 }">
														<span class="label label-warning">待查看</span>

													</c:when>
													<c:when test="${accountApplyList.pass_status==1 }">
														<span class="label label-success">成功</span>
													</c:when>
													<c:otherwise>
														<span class="label label-important">退回</span>
													</c:otherwise>
												</c:choose></td>
											<td class="center"><a class="btn btn-success" href="detailAccountMessage.html?passstatus=${true }&client_id=${accountApplyList.client_Id }">
													<i class="icon-zoom-in icon-white"></i> 查看
											</a> </td>
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