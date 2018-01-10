<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>账号申请人详细信息</title>
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
					<h2>添加项目组干系人</h2>
				</div>
				<div class="box-content">
					<form action="changePassword.html?type=2&user_id=${requestScope.viewapply.user_Id}" method="post">
						<table class="table table-striped table-bordered">
							<tr>
								<th width="30%">申请人姓名:</th>
								<td>${requestScope.viewapply.client_Name }</td>
							</tr>
							<tr>
								<th width="30%">申请人邮箱:</th>
								<td>${requestScope.viewapply.client_Email }</td>
							</tr>
							<tr>
								<th width="30%">申请人公司：</th>
								<td>${requestScope.viewapply.client_Company }</td>
							</tr>
							<tr>
								<th width="30%">当前状态：</th>
								<td><c:choose>
										<c:when test="${requestScope.viewapply.pass_status==0 }">
											<span class="label label-warning">待查看</span>
										</c:when>
										<c:when test="${requestScope.viewapply.pass_status==1 }">
											<span class="label label-success">成功</span>
										</c:when>
										<c:otherwise>
											<span class="label label-important">退回</span>
										</c:otherwise>
									</c:choose></td>
							</tr>
							<tr>
								<th width="30%">申请时间:</th>
								<td>${requestScope.viewapply.application_time }</td>
							</tr>
							<tr>
								<th width="30%">申请原因：</th>
								<td>${requestScope.viewapply.reason }</td>
							</tr>
							<c:choose>
								<c:when test="${requestScope.passstatus }">
									<c:choose>
										<c:when test="${requestScope.viewapply.pass_status==0 }">
											<td colspan="4">
												<div style="float: right;">
													<a
														href="checkAccount.html?method=back&client_id=${requestScope.viewapply.client_Id }&user_id=${requestScope.viewapply.user_Id}"
														class="btn btn-default" id="check">退回</a> <a
														href="checkAccount.html?method=pass&client_id=${requestScope.viewapply.client_Id }&user_id=${requestScope.viewapply.user_Id}"
														class="btn btn-default">审核通过</a>
												</div>
											</td>
										</c:when>
										<c:when test="${requestScope.viewapply.pass_status==1 }">
											<tr>
												<td colspan="4">
													<div style="float: right;">
														<a
															href="checkAccount.html?method=back&client_id=${requestScope.viewapply.client_Id }&user_id=${requestScope.viewapply.user_Id}"
															class="btn btn-default" id="check">退回</a>
													</div>
												</td>
											</tr>
										</c:when>
										<c:otherwise>
											<tr>
												<td colspan="4">
													<div style="float: right;">
														<a
															href="checkAccount.html?method=pass&client_id=${requestScope.viewapply.client_Id }&user_id=${requestScope.viewapply.user_Id}"
															class="btn btn-default">通过审核</a>
													</div>
												</td>
											</tr>
										</c:otherwise>
									</c:choose>
								</c:when>
								<c:otherwise>
									<tr>
										<th width="30%">更新密码：</th>
										<td><input type="text" name="newpwd" placeholder="输入新密码"></td>
									</tr>
									<tr>
										<td colspan="4">
											<div style="float: right;">
												<button type="submit" class="btn btn-default">提交新密码</button>
											</div>
										</td>
									</tr>
								</c:otherwise>
							</c:choose>
						</table>
					</form>
				</div>
			</div>
		</div>
		<hr style="color: #003399; margin-top: 200px;">
		<div class="navbar">
			<div class="navbar-inner">
				<div class="container-fluid">
					<p>&copy;第四小组</p>
				</div>
			</div>
		</div>
</body>

</html>