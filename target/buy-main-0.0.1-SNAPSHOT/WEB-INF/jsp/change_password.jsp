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
								<li>密码修改(用户)</li>
							</ul>
							<form action="changePassword.html?type=1" method="post">
								<div class="tab-pane" id="change">
									<h3>密码修改</h3>
									<span>请输入原密码:</span> 
									<input type="password" name="oldpwd">
									<br> 
									<span>请输入新密码:</span> 
									<input type="password"name="newpwd"> 
									<br> <span>请再次输入新密码:</span> 
									<input type="password" name="confirmpwd"> 
									<br>
									<button type="submit" class="btn btn-small btn-primary">保存修改</button>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!--/.fluid-container-->

	<!-- external javascript
	================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
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