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
	<script type="text/javascript">
		$(function() {
			$("#reason").click(function() {
				$("#txt").hide(100);
			});
			$("#reason").blur(function() {
				var reason = document.getElementById("reason").value;
				if (reason == null || reason == "") {
					$("#txt").show(100);
				} else {
					$("#txt").hide(100);
				}
			});
		});

		$(function() {
			$("#submit").click(function() {
				var reason = document.getElementById("reason").value;
				if (reason == null || reason == "") {
					$("#txt").show(100);
				} else {
					$("#txt").hide(100);
				}
			});
		});
	</script>
	<div id="content" class="span10">
		<div class="row-fluid sortable">
			<div class="box span12">
				<div class="box-header well">
					<h2>
						<i class="icon-th"></i> 账号管理
					</h2>

				</div>
				<div class="box-content">
					<ul class="nav nav-tabs" id="myTab">
						<li class="active">账号申请(业务人员、项目经理)</li>
					</ul>

					<div id="myTabContent" class="tab-content">
						<div class="tab-pane active" id="apply">
							<form action="addAccountToApplication.html" method="post">
								<h3>账号申请</h3>
								<br>
								<div class="control-group">
									<div class="controls">
										<select id="selectError" data-rel="chosen" name="clientname">
											<option id="noselected">----请选择----</option>
											<c:forEach items="${requestScope.list }" var="clientlist">
												<option value="${clientlist.user_Id }" >${clientlist.client_Name }</option>
											</c:forEach>
										</select>
									</div>
								</div>
								<div class="alert alert-error" style="width: 255px">
									<i class=" icon-warning-sign"></i> <strong>该申请人必须与甲方干系人关联才能申请</strong>
								</div>
								<input type="text" name="company" id="company"
									placeholder="所属公司" readonly> <br> <br> <input
									type="text" name="email" id="email" placeholder="邮箱" readonly>
								<br> <br>
								<textarea class="autogrow" name="reason" id="reason"
									placeholder="申请原因" rows="5"></textarea>
								<span id="txt"
									style="display: none; color: red; font-size: 15px;">*请填写申请原因</span>
								<br>
								<button type="submit" name="submit" id="submit"
									class="btn btn-small btn-primary"
									style="margin: 5px 70px 25px 70px">提交申请</button>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	</div>
	</div>
	<script type="text/javascript">
		$("document").ready(
				function() {
					$("#selectError").change(
							function() {
								var user_id = $(this).children(
										'option:selected').val();
								jQuery.ajax({
									type : "post",
									url : "findViewClient.html?user_id="
											+ user_id + "&user_type=1",
									dataType : "text",
									success : function(data) {
										var dataObj = eval("(" + data + ")");
										var company = dataObj.client_Company;

										var email = dataObj.client_Email;

										$("#company").val(company);
										$("#email").val(email);
									}

								});
							});

				});
		/* $(function() {
			$("#selectError")
				.change(
					function() {
						var user_id = $(this).children(
								'option:selected').val();
						jQuery.ajax({
							type : "post",
							url : "findViewClient.html?user_id="
									+ user_id + "&user_type=1",
							dataType : "text",
							success : function(data) {
								var dataObj = eval("(" + data + ")");
								var company = dataObj.client_Company;

								var email = dataObj.client_Email;

								$("#company").val(company);
								$("#email").val(email);
						}

					});
				});

		}); */
	</script>
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