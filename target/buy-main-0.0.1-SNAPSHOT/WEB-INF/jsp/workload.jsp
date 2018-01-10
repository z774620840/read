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
				<div class="row-fluid sortable">
					<div class="box span12">
						<div class="box-header well" data-original-title>
							<h2>部门项目工作量情况</h2>
							<div class="box-icon">
								<a href="#" class="btn btn-minimize btn-round"><i
									class="icon-chevron-up"></i></a> <a href="#"
									class="btn btn-close btn-round"><i class="icon-remove"></i></a>
							</div>
						</div>
						<div class="box-content">
							<table class="table table-striped table-bordered ">
								<thead>
									<tr>
										<th>项目名称</th>
										<th>客户公司名称</th>
										<th>承建部门</th>
										<th>项目经理</th>
										<th>业务人员</th>
										<th>项目状态</th>
										<th>项目进度</th>
										<th>进度状态</th>
										<th>查看</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>预立项状态</td>
										<td>2012/01/01</td>
										<td>预立项状态</td>
										<td>预立项状态</td>
										<td>预立项状态</td>
										<td>预立项状态</td>
										<td>预立项状态</td>
										<td>预立项状态</td>
										<td>预立项状态</td>
									</tr>
									<tr>
										<td colspan="9">更多</td>
									</tr>
								</tbody>
							</table>
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