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
<body>
	<%@ include file="navbar.jsp"%>
	<!----------------------------------------- 内容 -------------------------->
				<div id="content" class="span10">
					<!-- content starts -->

					<div>
						<ul class="breadcrumb">
							<li>
								<a href="#">首页</a> <span class="divider">/</span>
							</li>
							<li>
								<a href="#">项目列表</a>
							</li>
						</ul>
					</div>

					<div class="row-fluid sortable">

						<div class="box span12">
							<div class="box-header well" data-original-title>
								<label for="exampleInputName2">邮件发送历史</label>
							</div>
							<div class="box-content">								
								
								<!--<form class="form-inline">
									<div class="form-group">
										<label for="exampleInputName2">项目名称</label>
										<input type="text" class="form-control" id="exampleInputName2">
									</div>
									<div class="form-group">
										<div class="dropdown">
											<label for="exampleInputName2">项目状态</label>
											<select>
													<option value="volvo">项目实施</option>
													<option value="saab">项目停滞</option>
													<option value="opel">项目异常</option>
													<option value="audi">项目完成</option>
											</select>
										</div>
									</div>
									<div class="form-group">
										<label for="exampleInputName2">项目经理</label>
										<input type="text" class="form-control" id="exampleInputName2">
									</div>
									<div class="form-group">
										<label for="exampleInputName2">业务人员</label>
										<input type="text" class="form-control" id="exampleInputName2">
									</div>
									<input type="submit" value="查询">
								</form>-->
								<table class="table table-striped table-bordered">
									<thead>
										<tr>
											<th>收件人</th>
											<th>标题</th>
											<th>发送人</th>
											<th>发送时间</th>										
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${requestScope.list }" var="List">
								<tr>
									<td>${List.sender_id }</td>
									<td>${List.title}</td>
									<td>${List.receiver }</td>
									<td>${List.send_date }</td>									
								</tr>
							</c:forEach>

									</tbody>
								</table>
							</div>
						</div>
						<!--/span-->

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
							<a href="#" class="btn" data-dismiss="modal">Close</a>
							<a href="#" class="btn btn-primary">Save changes</a>
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