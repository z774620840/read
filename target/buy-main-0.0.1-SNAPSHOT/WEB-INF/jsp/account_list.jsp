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
						<li>用户信息修改(管理员)</li>
					</ul>
					<div class="tab-pane" id="manage">
						<h3>用户信息修改</h3>

						<div class="box-content">
							<table class="table table-striped table-bordered">
								<thead>
									<tr>
										<th>姓名</th>
										<th>账号</th>
										<th>所属公司</th>
										<th>状态</th>
										<th>操作</th>
									</tr>
								</thead>
								<tbody>
									<c:choose>
										<c:when test="${not empty  requestScope.accountApplyList }">
											<c:forEach items="${requestScope.accountApplyList }"
												var="accountList">
												<tr>

													<td>${accountList.client_Name}</td>
													<td class="center">${accountList.username }</td>
													<td class="center">${accountList.client_Company}</td>
													<td class="center"><c:choose>
															<c:when test="${accountList.pass_status==0 }">
																<span class="label label-warning">待查看</span>

															</c:when>
															<c:when test="${accountList.pass_status==1 }">
																<span class="label label-success">成功</span>
															</c:when>
															<c:otherwise>
																<span class="label label-important">退回</span>
															</c:otherwise>
														</c:choose></td>
													<td class="center"><a class="btn btn-success"
														href="detailAccountMessage.html?passstatus=${false }&client_id=${accountList.client_Id }">
															<i class="icon-zoom-in icon-white"></i> 查看
													</a> <c:choose>
															<c:when test="${accountList.isForbidden == false }">
																<a class="btn btn-info"
																	href="updateAccount.html?method=updataUserForbiddenByUserId&isforbidden=1&user_id=${accountList.user_Id }">
																	<i class="icon-edit icon-white"></i> 禁用
																</a>
															</c:when>
															<c:otherwise>
																<a class="btn btn-info"
																	href="updateAccount.html?method=updataUserForbiddenByUserId&isforbidden=0&user_id=${accountList.user_Id }">
																	<i class="icon-edit icon-white"></i> 启用
																</a>
															</c:otherwise>
														</c:choose><a class="btn btn-danger"
														href="updateAccount.html?method=udataUserNameByUserId&user_id=${accountList.user_Id }">
															<i class="icon-trash icon-white"></i> 删除
													</a></td>
												</tr>
											</c:forEach>
										</c:when>
										<c:otherwise>
											<tr>
												<td colspan="5" class="center">没有你要的数据</td>
											</tr>
										</c:otherwise>
									</c:choose>
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