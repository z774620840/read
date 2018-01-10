<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>编辑干系人</title>
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
					<h2>编辑项目干系人</h2>
				</div>
				<div class="box-content">

					<table class="table table-striped table-bordered">
						<tr>
							<th>项目名称:</th>
							<td width="30%"><input type="text"
								style="width: 100%; height: 100%;"></td>
							<th>干系人名称:</th>
							<td width="30%"><select>
									<option value="volvo">甲方干系人</option>
									<option value="saab">乙方干系人</option>
							</select></td>
						</tr>
						<tr>
							<th>角色:</th>
							<td colspan="3" width="30%"><select>
									<option value="q">项目经理</option>
									<option value="">项目组成员</option>
									<option value="">业务人员</option>
									<option value="">部门经理</option>
									<option value="">项目组管理层</option>
									<option value="">财务合同管理员</option>
							</select></td>
						</tr>
						<tr>
							<th>姓名：</th>
							<td width="30%"><select>
									<option value="q">张三</option>
									<option value="">李四</option>
									<option value="">王二麻子</option>
									<option value="">李勇</option>
									<option value="">钮家伦</option>
									<option value="">李诗怡</option>
							</select></td>
							<th>电子邮箱:</th>
							<td width="30%"><input type="text"
								style="width: 100%; height: 100%;"></td>
						</tr>
						<tr>
							<th>手机号码:</th>
							<td width="30%"><input type="text"
								style="width: 100%; height: 100%;"></td>
							<th>固话号码:</th>
							<td width="30%"><input type="text"
								style="width: 100%; height: 100%;"></td>
						</tr>
						<tr>
							<th>责任描述:</th>
							<td width="30%"><input type="text"
								style="width: 100%; height: 100%;"></td>
						</tr>
						<tr>
							<td colspan="4">
								<div style="float: right;">
									<button type="submit" class="btn btn-default">确定</button>
									<button type="submit" class="btn btn-default">关闭</button>
								</div>
							</td>
						</tr>
					</table>
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