<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>添加联系人</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<%@ include file="header.jsp"%>
</head>
<body>
	<%@ include file="navbar.jsp"%>
	<!----------------------------------------- 内容 -------------------------->
	<div id="content" class="span10">
		<!-- content starts -->


		<c:if test="${sessionScope.user_type==0}">
			<div class="row-fluid sortable">

				<div class="box span12">
					<div class="box-header well" data-original-title>
						<h2>添加项目组干系人</h2>
					</div>
					<div class="box-content">
						<!-- <form action="addProjectMemOrClient.html?user_type=0" method="post" onsubmit="isExistName()"> -->
						<table class="table table-striped table-bordered">
							<tr>
								<th>项目名称:</th>
								<td width="30%">ABCDE20171011</td>
								<th>干系人类型:</th>
								<td width="30%">项目组干系人</td>
							</tr>
							<tr>
								<th>角色:</th>
								<td width="30%"><input type="text" name="role" id="role"
									value="" style="width: 100%; height: 100%;" readonly></td>
								<th>部门:</th>
								<td width="30%"><input type="text" name="departmentname"
									id="departmentname" value="" style="width: 100%; height: 100%;"
									readonly></td>
							</tr>

							<tr>
								<th>姓名：</th>
								<td width="30%" colspan="3"><select name="username"
									id="name">
										<option selected value="">请选择</option>
										<c:forEach items="${requestScope.userListMember }"
											var="userMember">
											<option value="${userMember.user_Id }">${userMember.employee_Name}</option>
										</c:forEach>
								</select></td>
							</tr>
							<tr>
								<th>性别：</th>
								<td width="30%"><input type="text" name="gender"
									id="gender" style="width: 100%; height: 100%;" value=""
									readonly></td>

								<th>电子邮箱:</th>
								<td width="30%"><input type="text" name="email" id="email"
									style="width: 100%; height: 100%;" value="" readonly></td>
							</tr>
							<tr>
								<th>手机号码:</th>
								<td width="30%"><input type="text" name="phone" id="phone"
									style="width: 100%; height: 100%;" readonly></td>
								<th>固话号码:</th>
								<td width="30%"><input type="text" name="telphone"
									id="telphone" style="width: 100%; height: 100%;" readonly></td>
							</tr>
							<tr>
								<th>QQ</th>
								<td width="30%"><input type="text" name="qq" id="qq"
									style="width: 100%; height: 100%;" readonly="true"></td>
								<th>责任描述:</th>
								<td width="30%"><input type="text" name="duty" id="duty"
									style="width: 100%; height: 100%;"></td>
							</tr>
							<tr>
								<td colspan="4">
									<div style="float: right;">
										<button class="btn btn-default" id="check">提交</button>
										<!-- <button type="submit" class="btn btn-default">提交</button> -->
									</div>
								</td>
							</tr>
						</table>
						<!-- </form> -->
						<script type="text/javascript">
						$(function(){
							$("#check").click(function(){
								
								var dataT = $("#name").val();
								var duty = $("#duty").val();
								if(dataT == ""){
									alert("请选择项目组干系人姓名");
									return;
								}
								if(duty == ""){
									alert("项目责任很重要！请认真填写！");
									return;
								}
								$.ajax({
									type:"post", 
									url:"addProjectMemOrClient.html", 
									dataType:"text", 
									data:{"user_id":dataT,"user_type":0,"duty":duty},
									success:function(returnData) 
									{ 
										alert(returnData);
										if(returnData=="项目组干系人已经存在！无法继续添加！"){
											return;
										}
										window.location.href="projectMemberList.html";
									}, 
								});
							});
						});
						
							$(function() {
								$("#name").change(function() {
										var user_id = $(this).children('option:selected').val();
										jQuery.ajax({
											type : "post",
											url : "findUerById.html",
											dataType : "text",
											data:{"user_id":user_id,"user_type":${sessionScope.user_type}},
											success : function(
													mem) {
												var dataObj = eval("("
														+ mem
														+ ")")
												var department_name = dataObj.department_name;
												var employee_Email = dataObj.employee_Email;
												var employee_Phone = dataObj.employee_Phone;
												var employee_Telephone = dataObj.employee_Telephone;
												var employee_Qq = dataObj.employee_Qq;
												var role_Name = dataObj.role_Name;
												var employee_Gender = dataObj.employee_Gender;
												$("#email")
														.val(
																employee_Email);
												$("#gender")
														.val(
																employee_Gender);
												$("#role")
														.val(
																role_Name);
												$("#departmentname")
														.val(
																department_name);
												$("#phone")
														.val(
																employee_Phone);
												if (employee_Telephone == ""
														|| employee_Telephone == null) {
													$(
															"#telphone")
															.val(
																	"没有固定电话");
												} else {
													$(
															"#telphone")
															.val(
																	employee_Telephone);
												}
												$("#qq")
														.val(
																employee_Qq);
											}
										});
									});

							});
						</script>
					</div>
				</div>
			</div>
		</c:if>
		<c:if test="${sessionScope.user_type==1}">
			<div class="row-fluid sortable">

				<div class="box span12">
					<div class="box-header well" data-original-title>
						<h2>添加客户干系人</h2>
					</div>
					<div class="box-content">
						<table class="table table-striped table-bordered">
							<tr>
								<th>项目名称:</th>
								<td width="30%">ABCDE20171011</td>
								<th>干系人类型:</th>
								<td width="30%">项目组干系人</td>
							</tr>
							<tr>
								<th>姓名：</th>
								<td width="30%"><select name="username" id="name">
										<option selected value="">请选择</option>
										<c:forEach items="${requestScope.userListClient }"
											var="userClient">
											<option value="${userClient.user_Id }">${userClient.client_Name}</option>
										</c:forEach>
								</select></td>
								<th>公司:</th>
								<td width="30%"><input type="text" name="company"
									id="company" value="" style="width: 100%; height: 100%;"
									readonly></td>
							</tr>
							<tr>
								<th>性别：</th>
								<td width="30%"><input type="text" name="gender"
									id="gender" style="width: 100%; height: 100%;" value=""
									readonly></td>

								<th>电子邮箱:</th>
								<td width="30%"><input type="text" name="email" id="email"
									style="width: 100%; height: 100%;" value="" readonly></td>
							</tr>
							<tr>
								<th>手机号码:</th>
								<td width="30%"><input type="text" name="phone" id="phone"
									style="width: 100%; height: 100%;" readonly></td>
								<th>固话号码:</th>
								<td width="30%"><input type="text" name="telphone"
									id="telphone" style="width: 100%; height: 100%;" readonly></td>
							</tr>
							<tr>
								<th>QQ</th>
								<td width="30%"><input type="text" name="qq" id="qq"
									style="width: 100%; height: 100%;" readonly></td>
								<th>责任描述:</th>
								<td width="30%"><input type="text" name="duty" id="duty"
									style="width: 100%; height: 100%;"></td>
							</tr>
							<tr>
								<td colspan="4">
									<div style="float: right;">
										<button id="sub" class="btn btn-default">提交</button>
									</div>
								</td>
							</tr>
						</table>
						<script type="text/javascript">
						$(function(){
							$("#sub").click(function(){
								var dataT = $("#name").val();
								var duty = $("#duty").val();
								if(dataT == ""){
									alert("请选择项目组干系人姓名");
									return;
								}
								if(duty == ""){
									alert("项目责任很重要！请认真填写！");
									return;
								} 
								$.ajax({
									type:"post", 
									url:"addProjectMemOrClient.html", 
									dataType:"text", 
									data:{"user_id":dataT,"user_type":1,"duty":duty},
									success:function(returnData) 
									{ 
										alert(returnData);
										if(returnData=="该客户已经存在！无法继续添加！"){
											return;
										}
										window.location.href="projectMemberList.html";
									}, 
								});
							});
						});
							$(function() {
								$("#name").change(function() {
									var user_id = $(this).children('option:selected').val();
									jQuery.ajax({
										type : "post",
										url : "findUerById.html",
										dataType : "text",
										data:{"user_id":user_id,"user_type": ${sessionScope.user_type}},
										success : function(cli) {
											var dataObj = eval("("+ cli+ ")");
											var client_Email = dataObj.client_email;
											var client_Gender = dataObj.client_Gender;
											var client_Phone = dataObj.client_Phone;
											var client_name = dataObj.client_name;
											var client_Telephone = dataObj.client_Telephone;
											var client_Qq = dataObj.client_Qq;
											var client_Company = dataObj.client_Company;
											$("#email").val(client_Email);
											$("#gender").val(client_Gender);
											$("#company").val(client_Company);
											$("#phone").val(client_Phone);
											if (client_Telephone == ""|| client_Telephone == null) {
												$("#telphone").val("没有固定电话");
											} else {
												$("#telphone").val(client_Telephone);
											}
											$("#qq").val(client_Qq);
										}
									});
								});
								
							});
						</script>
					</div>
				</div>
			</div>

		</c:if>
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