<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>项目管理</title>
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
						<i class="icon-th"></i> 项目周报管理
					</h2>

				</div>
				<div class="box-content">
					<form class="form-horizontal">
						<fieldset>
							<legend>查看项目周报</legend>
							<div class="control-group">
								<label class="control-label" for="typeahead">周报对应的周次: </label>
								<div style="margin-left: 160px; margin-top: 5px">
									${report.week}
								</div>
							</div>
							<div class="control-group">
								<label class="control-label" for="typeahead">总体进度: </label>

								<div style="margin-left: 160px; margin-top: 5px">
									<div class="progress progress-striped progress-success active"
										style="width: 200px;">
										<div class="bar" style="width: ${report.progress }%;">${report.progress }%</div>
									</div>
								</div>

							</div>
							<div class="control-group">
								<label class="control-label">进度状态: </label>
								<c:choose>
									<c:when test="${report.progress_Status==0 }">
										<div style="margin-left: 160px; margin-top: 5px">
											<i class="icon icon-green icon-bullet-on"></i>项目状态正常
										</div>
									</c:when>
									<c:when test="${report.progress_Status==1 }">
										<div style="margin-left: 160px; margin-top: 5px">
											<i class="icon icon-orange icon-bullet-on"></i>项目存在一些问题，从而可能导致项目不能达到预期的质量/进度
										</div>
									</c:when>
									<c:when test="${report.progress_Status==2}">
										<div style="margin-left: 160px; margin-top: 5px">
											<i class="icon icon-red icon-bullet-on"></i>整个项目处于危险之中
										</div>
									</c:when>
								</c:choose>
							</div>
							<div class="control-group">
								<label class="control-label" for="typeahead">当前里程碑:</label>
								<div style="margin-left: 160px; margin-top: 5px">${mileStone.milestone_Name }</div>
							</div>
							<div class="control-group">
								<label class="control-label">周报附件:</label>
								<div style="margin-left: 160px; margin-top: 5px">
									<c:if test="${empty report.weekly_Report_Accessory}">无</c:if>
									<c:if test="${not empty report.weekly_Report_Accessory}">
										<a href="${report.weekly_Report_Accessory}">附件</a>
									</c:if>
								</div>
							</div>
							<div class="control-group">
								<label class="control-label" for="typeahead">是否发送邮件: </label>
								<div style="margin-left: 160px; margin-top: 5px">
									<c:if test="${report.issend_Email ==true}">已发送</c:if>
									<c:if test="${report.issend_Email ==false}">未发送</c:if>
								</div>
							</div>
							<div class="control-group">
								<label class="control-label" for="typeahead">计划提交时间: </label>
								<div style="margin-left: 160px; margin-top: 5px">
									${report.plan_Time }</div>
							</div>
							<div class="control-group">
								<label class="control-label" for="typeahead">实际提交时间 : </label>

								<div style="margin-left: 160px; margin-top: 5px">
									${report.actual_Time }</div>
							</div>
						</fieldset>
					</form>
				</div>
			</div>
		</div>
		<!--/span-->
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