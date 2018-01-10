<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>立项申请</title>
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
							<h2>填写申请立项信息</h2>
							<div class="box-icon">
								<a href="#" class="btn btn-minimize btn-round"><i
									class="icon-chevron-up"></i></a> <a href="#"
									class="btn btn-close btn-round"><i class="icon-remove"></i></a>
							</div>
						</div>
						<div class="box-content">
							<form action="addProjectConstruct.html" method="post">
								<table class="table table-striped table-bordered">
									<tr>
										<th>项目名称:</th>
										<td width="30%"><input type="text" name="project_name"
											style="width: 100%; height: 100%;"></td>
									</tr>
									<tr>
										<th>客户公司名称:</th>
										<td colspan="3" width="30%"><input type="text"
											name="company" style="width: 100%; height: 100%;"></td>
									</tr>
									<tr>
										<th>所属行业:</th>
										<td width="30%"><input type="text" name="vacation"
											style="width: 100%; height: 100%;"></td>
										<th>解决方案方向:</th>
										<td width="30%"><input type="text" name="solution"
											style="width: 100%; height: 100%;"></td>
									</tr>
									<tr>
										<th>业务人员:</th>
										<td width="30%"><input type="text" name="business"
											style="width: 100%; height: 100%;"
											value="${sessionScope.name} " readonly="true"></td>
									</tr>
									<tr>
										<td colspan="4">
											<div style="float: right;">
												<button type="submit" class="btn btn-default">提交申请</button>
											</div>
										</td>
									</tr>

								</table>
							</form>
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