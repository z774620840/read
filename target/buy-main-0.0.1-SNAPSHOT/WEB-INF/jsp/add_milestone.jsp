<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>添加里程碑</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<%@ include file="header.jsp"%>

</head>
<body>
	<%
		pageContext.setAttribute("date", new java.util.Date());
	%>
	<%@ include file="navbar.jsp"%>
	<!----------------------------------------- 内容 -------------------------->
	<div id="content" class="span10">
		<div class="row-fluid sortable">
			<div class="box span12">
				<div class="box-header well">
					<h2>
						<i class="icon-th"></i> 里程碑管理
					</h2>

				</div>
				<div class="box-content">
					<form class="form-horizontal" action="addMilestone.html"
						method="post">
						<fieldset>
							<legend>增加里程碑</legend>
							<div class="control-group">
								<label class="control-label" for="typeahead">里程碑名称： </label>
								<div class="controls">
									<input type="text" 
										name="milestone_name" id="milestone_name"> <span
										id="txt1" style="display: none; color: red; font-size: 15px;">*里程碑名称不能为空</span>
								</div>
							</div>
							<div class="control-group">
								<label class="control-label" for="typeahead">项目编号： </label>
								<div class="controls">
									<input type="text"  name="project_id"
										value="${project_Id}" readonly>
								</div>
							</div>
							<div class="control-group">
								<label class="control-label" for="typeahead">计划提交时间 ：</label>

								<div class="controls">
									<input name="plan_time" id="plan_time" type="date"> <span
										id="txt2" style="display: none; color: red; font-size: 15px;">*计划提交时间不能为空</span>
								</div>
							</div>
							<div class="control-group">
								<label class="control-label" for="typeahead">实际提交时间：</label>
								<div class="controls">
									<input name="actual_time" type="date">
								</div>
							</div>
							<div class="control-group">
								<label class="control-label" for="typeahead">当前状态： </label>
								<div class="controls">
									<select name="milestone_status">
										<option value="0">未开始</option>
										<option value="1">实施中</option>
										<option value="2">正常完成</option>
										<option value="3">延期完成</option>
									</select>
								</div>
							</div>
							<div class="form-actions">
								<button type="button" id="submit" class="btn btn-primary">确定</button>
								<button type="reset" class="btn"
									onclick="window.location.href='project_unified_view.html?pid=${project_Id}'">返回</button>
							</div>

						</fieldset>
					</form>
				</div>
			</div>
		</div>
		<!--/span-->
	</div>
	</div>
	<!--/#content.span10-->
	</div>
	<!--/fluid-row-->
	</div>
	<!--/.fluid-container-->
	<hr style="color: #003399;">
	<div class="navbar">
		<div class="navbar-inner">
			<div class="container-fluid">
				<p>&copy;第四小组</p>
			</div>
		</div>
	</div>
</body>
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("#milestone_name").click(function() {
			$("#txt1").hide(100);
		});
		$("#milestone_name").blur(function() {
			var tempName = document.getElementById("milestone_name").value;
			if (tempName == null || tempName == "") {
				$("#txt1").show(100);
			} else {
				$("#txt1").hide(100);
			}
		});
	});
		$(function() {
			$("#plan_time").click(function() {
				$("#txt2").hide(100);
			});
			$("#plan_time").blur(function() {
				var temptime = document.getElementById("plan_time").value;
				if (temptime == null || temptime == "") {
					$("#txt2").show(100);
				} else {
					$("#txt2").hide(100);
				}
			});
		});
		$(function() {

			$("#submit").click(function() {
				var isValid1 =false;
		        var isValid2 =false;
				var tempName = document.getElementById("milestone_name").value;
				var temptime = document.getElementById("plan_time").value;
				if (tempName == null || tempName == "") {
					$("#txt1").show(100);
				} 
				else{
					$("#txt1").hide(100);
					isValid1=true;
				} 
				if (temptime == null || temptime == "") {
					$("#txt2").show(100);
				}
				else {
					$("#txt2").hide(100);
					isValid2=true;
				}
				if(isValid1&&isValid2){
		            $(this).prop("type","submit");
		        }
			});
		});
</script>
</html>