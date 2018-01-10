<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>客户方领导首页</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<%@ include file="header.jsp"%>
</head>
<body>
	<%@ include file="navbar.jsp"%>
<!----------------------------------------- 内容 -------------------------->
<div class="container-fluid">
	<div class="row-fluid">

		<div class="span2 main-menu-span">
			<div class="well nav-collapse sidebar-nav">
				<ul class="nav nav-tabs nav-stacked main-menu">
					<li class="nav-header hidden-tablet">项目管理</li>
					<li><a class="ajax-link" href="project_list.html"><i
							class="icon-list"></i><span class="hidden-tablet"> 项目列表</span></a></li>
					<li><a class="ajax-link" href="project_unified_view.html"><i
							class=" icon-tag"></i><span class="hidden-tablet"> 建设进度</span></a></li>
					<li><a class="ajax-link" href="stakeholder_message.html"><i
							class=" icon-tag"></i><span class="hidden-tablet"> 干系人</span></a></li>
					<li><a class="ajax-link" href="workload.html"><i
							class=" icon-tag"></i><span class="hidden-tablet"> 工作量</span></a></li>
					<li class="nav-header hidden-tablet">立项管理</li>
					<li><a class="ajax-link" href="business_personnel_index.html"><i
							class="icon-list"></i><span class="hidden-tablet"> 立项列表</span></a></li>
					<li class="nav-header hidden-tablet">邮件管理</li>
					<li><a class="ajax-link" href="send_email.html"><i
							class="icon-list"></i><span class="hidden-tablet"> 邮件发送</span></a></li>
					<li><a class="ajax-link" href="email_history.html"><i
							class="icon-list"></i><span class="hidden-tablet"> 邮件历史</span></a></li>
				</ul>
			</div>
		</div>
		<noscript>
			<div class="alert alert-block span10">
				<h4 class="alert-heading">Warning!</h4>
				<p>
					You need to have <a href="http://en.wikipedia.org/wiki/JavaScript"
						target="_blank">JavaScript</a> enabled to use this site.
				</p>
			</div>
		</noscript>

		<div id="content" class="span10">
			<!-- content starts -->
			<div class="row-fluid sortable">
				<div class="box span12">
					<div class="box-header well" data-original-title>
						<h2>项目列表</h2>

					</div>
					<div class="box-content">
						<form class="form-inline">
							<div class="form-group" style="float: left;">
								<label for="exampleInputName2">项目名称：</label> <input type="text"
									class="form-control" id="exampleInputName2"
									style="width: 100px;">
							</div>
							<div class="form-group" style="float: left;">
								<div class="dropdown">
									<label for="exampleInputName2">项目状态：</label> <select
										style="width: 100px;">
										<option value="volvo">项目实施</option>
										<option value="saab">项目停滞</option>
										<option value="opel">项目异常</option>
										<option value="audi">项目完成</option>
									</select>
								</div>
							</div>
							<div class="form-group" style="float: left;">
								<label for="exampleInputName2">项目经理:</label> <input type="text"
									class="form-control" style="width: 100px;"
									id="exampleInputName2">
							</div>
							<div class="form-group" style="float: left;">
								<label for="exampleInputName2">业务人员:</label> <input type="text"
									class="form-control" style="width: 100px;"
									id="exampleInputName2">
							</div>
							<button type="submit" class="btn btn-default">查询</button>
						</form>
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
									<th>项目名称</th>
									<th>客户公司名称</th>
									<th>承建部门</th>
									<th>项目经理</th>
									<th>业务人员</th>
									<th>项目状态</th>
									<th>项目进度</th>
									<th>项目状态</th>
									<th>查看选项</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>广东移动三期</td>
									<td class="center">广东移动通讯有限公司</td>
									<td class="center">应用协作中心部</td>
									<td class="center">xx</td>
									<td class="center">ly</td>
									<td class="center"><span class="label label-success">进行中</span>
									</td>
									<td>
										<div class="progress">
											<div class="progress-bar" role="progressbar"
												aria-valuenow="60" aria-valuemin="0" aria-valuemax="100"
												style="width: 60%;">
												<span class="sr-only">60% Complete</span>
											</div>
										</div>
									</td>
									<td class="right"><img src="/img/icon/ok.png"></td>
									<td class="center"><a class="btn btn-success" href="#">
											<i class="icon-zoom-in icon-white"></i> 查看
									</a></td>
								</tr>

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
					<a href="#" class="btn" data-dismiss="modal">Close</a> <a href="#"
						class="btn btn-primary">Save changes</a>
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