<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>编辑里程碑</title>
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
					<form class="form-horizontal" action="edit_milestone.html"
						method="post">
						<fieldset>
							<legend>编辑里程碑</legend>
							<div class="control-group">
								<label class="control-label" for="typeahead">里程碑名称：</label> <input
									type="text" class="span3 typeahead" id="typeahead"
									value="${milestone.milestone_Name }" readonly>
							</div>
							<div class="control-group">
								<label class="control-label" for="typeahead">计划提交时间 ：</label>
								<div class="controls" style="margin-left: 100px;">
									<input id="plan_time" name="plan_time" type="date"
										value="${milestone.getplan_Delivery_Time() }" readonly>
								</div>
							</div>
							<div class="control-group">
								<label class="control-label" for="typeahead">实际提交时间 ：</label>
								<div class="controls" style="margin-left: 100px;">
									<input id="actual_time" name="actual_time" type="date"
										value="${milestone.getactual_Delivery_Time() }">
								</div>
							</div>
							<div class="control-group">
								<label class="control-label" for="typeahead">当前状态：</label>
								<div style="margin-left: 100px; margin-top: 5px">
									<select id="milestone_status" name="milestone_status">
										<option value="0"
											<c:if test="${milestone.getmilestone_Status() == '0'}">selected="selected"</c:if>>未开始</option>
										<option value = "1"
	
											<c:if test="${milestone.getmilestone_Status() =='1'}">selected="selected"</c:if>>实施中</option>
										<option value = "2"
											<c:if test="${milestone.getmilestone_Status() =='2'}">selected="selected"</c:if>>正常完成</option>
										<option value = "3"
											<c:if test="${milestone.getmilestone_Status() =='3'}">selected="selected"</c:if>>延期完成</option>
									</select>
								</div>
							</div>
							<input type="hidden" id="project_id" name="project_id" value = "${requestScope.project_Id}">
							<input type="hidden" id="milestone_id" name="milestone_id" value = "${milestone.milestone_Id}">
							<div class="form-actions">
								<button type="submit" class="btn btn-primary" >确定</button>
								<button type="reset" class="btn" onclick="window.location.href='project_unified_view.html?pid=${project_Id}'">返回</button>
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

</html>