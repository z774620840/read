<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>部门经理首页</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<%@ include file="header.jsp"%>
</head>
<body>
	<%@ include file="navbar.jsp"%>
<!----------------------------------------- 内容 -------------------------->
<div id="content" class="span10">

	<div>
		<ul class="breadcrumb">
			<li><a href="#">首页</a> <span class="divider">/</span></li>
			<li><a href="#">立项列表</a></li>
		</ul>
	</div>
	<div class="row-fluid sortable">
		<div class="box span8" style="height: 300px;">
			<div class="box-header well" data-original-title>
				<h2>部门项目工作量情况</h2>
			</div>
			<div class="box-content">
				<table class="table table-striped table-bordered ">
					<thead>
						<tr>
							<th>项目编号</th>
							<th>项目名称</th>
							<th>考核工作量</th>
							<th>实际工作量</th>
							<th>工作量比例</th>
							<th>按资源投入估算可投入天数</th>
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
						</tr>
						<tr>
							<td colspan="6" style="text-align: center;">合计</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>

		<div class="row-fluid sortable">
			<div class="box span4" style="width: 370px; height: 300px;">
				<div class="box-header well" data-original-title>
					<h2>异常项目进度</h2>
				</div>
				<div class="box-content">
					<table class="table table-striped table-bordered ">
						<thead>
							<tr>
								<th>项目编号</th>
								<th>项目名称</th>
								<th>进度</th>
								<th>进度状态</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>预立项状态</td>
								<td>2012/01/01</td>
								<td>预立项状态</td>
								<th>进度状态</th>
							</tr>
							<tr>
								<td>预立项状态</td>
							</tr>
						</tbody>
					</table>
					<div class="pagination pagination-centered">111111</div>
				</div>
			</div>
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