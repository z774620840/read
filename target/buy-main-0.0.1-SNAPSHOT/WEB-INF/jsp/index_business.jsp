<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>业务人员首页</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<%@ include file="header.jsp"%>
</head>
<body>
	<%@ include file="navbar.jsp"%>
<!----------------------------------------- 内容 -------------------------->
<div id="content" class="span10">
	<div class="row-fluid sortable">
		<div class="box span12" style="height: 300px;">
			<div class="box-header well" data-original-title>
				<h2>立项列表</h2>
			</div>

			<div class="box-content">
				<form class="form-inline">
					<div class="form-group">
						<label for="exampleInputName2">项目名称：</label> <input type="text"
							class="form-control" id="exampleInputName2" style="width: 100px;"
							placeholder="项目名称">
						<button type="submit" class="btn btn-default">查询</button>
					</div>
				</form>
				<table class="table table-striped table-bordered ">
					<thead>
						<tr>
							<th>项目名称</th>
							<th>所属名称</th>
							<th>项目经理</th>
							<th>立项状态</th>
							<th>预立项时间</th>
							<th>业务工作量</th>
							<th>项目金额</th>
							<th>修改</th>
							<th>项目终止</th>
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

							<td colspan="5" style="text-align: center;">合计</td>
							<td>预立项状态</td>
							<td>预立项状态</td>

							<td colspan="2">预立项状态</td>
						</tr>
					</tbody>
				</table>
				<div class="pagination pagination-centered">1111111</div>
			</div>
		</div>
		<div class="row-fluid sortable">
			<div class="box span12">
				<div class="box-header well">
					<h2>
						<i class="icon-th"></i> 个人事项
					</h2>
					<div class="box-icon">
						<a href="#" class="btn btn-minimize btn-round"><i
							class="icon-chevron-up"></i></a> <a href="#"
							class="btn btn-close btn-round"><i class="icon-remove"></i></a>
					</div>
				</div>
				<div class="box-content">
					<ul class="nav nav-tabs" id="myTab">
						<li class="active"><a href="#apply">待办事项</a></li>
						<li><a href="#approval">已办事项</a></li>
						<li><a href="#manage">待阅事项</a></li>
						<li><a href="#change">已阅事项</a></li>
					</ul>


					<div id="myTabContent" class="tab-content">
						<div class="tab-pane active" id="apply">
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
										<td>David R111</td>
										<td>2012/01/01</td>
										<td>Member</td>
										<td class="center"><span class="label label-success">Active</span></td>
										<td class="center"><span class="label label-success">Active</span></td>
										<td>Member</td>
									</tr>
								</tbody>
							</table>
						</div>
						<div class="tab-pane" id="approval">
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
										<td>David R2222</td>
										<td>2012/01/01</td>
										<td>Member</td>
										<td class="center"><span class="label label-success">Active</span></td>
										<td class="center"><span class="label label-success">Active</span></td>
										<td>Member</td>

									</tr>

								</tbody>
							</table>
						</div>
						<div class="tab-pane" id="manage">
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
										<td>David R3333</td>
										<td>2012/01/01</td>
										<td>Member</td>
										<td class="center"><span class="label label-success">Active</span></td>
										<td class="center"><span class="label label-success">Active</span></td>
										<td>Member</td>
									</tr>
								</tbody>
							</table>
						</div>
						<div class="tab-pane" id="change">
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
										<td>David R4444</td>
										<td>2012/01/01</td>
										<td>Member</td>
										<td class="center"><span class="label label-success">Active</span></td>
										<td class="center"><span class="label label-success">Active</span></td>
										<td>Member</td>

									</tr>

								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!--/span-->
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