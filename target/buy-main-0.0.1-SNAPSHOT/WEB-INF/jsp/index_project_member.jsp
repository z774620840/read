<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>项目组成员首页</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<%@ include file="header.jsp"%>
</head>
<body>
<%@ include file="navbar.jsp"%>

<!----------------------------------------- 内容 -------------------------->
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
							class="form-control" id="exampleInputName2" style="width: 100px;">
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
							class="form-control" style="width: 100px;" id="exampleInputName2">
					</div>
					<div class="form-group" style="float: left;">
						<label for="exampleInputName2">业务人员:</label> <input type="text"
							class="form-control" style="width: 100px;" id="exampleInputName2">
					</div>
					<button type="submit" class="btn btn-default">查询</button>
				</form>
				<table class="table table-striped table-bordered">
					<thead>
						<tr>
							<th>项目名称</th>
							<th>客户公司名称</th>
							<th>承建部门</th>
							<th>项目经理</th>

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
							<td>
								<div class="progress">
									<div class="progress-bar" role="progressbar" aria-valuenow="60"
										aria-valuemin="0" aria-valuemax="100" style="width: 60%;">
										<span class="sr-only">60% Complete</span>
									</div>
								</div>
							</td>
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