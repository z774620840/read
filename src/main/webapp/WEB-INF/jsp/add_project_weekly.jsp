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
<script type="text/javascript">
$(function(){
	//选择框改变值
	$("#checkbox").click(function(){
		if($(this).attr("checked")){
			$(this).attr("value","1");
			$("#issend_email").remove()
		}else{
			$(this).attr("value","0");
			$(this).after("<input type='hidden' id='issend_email'  name='issend_email' value='0'>");
		}
	});
});

$(function() {
	$("#week").blur(function() {
		var txt1 = document.getElementById("week").value;
		if (txt1 == null || txt1 == "") {
			$("#txt1").show(100);
		} else {
			$("#txt1").hide(100);
		}
	});
});

$(function() {
	$("#progress").blur(function() {
		var txt2 = document.getElementById("progress").value;
		if (txt2 == null || txt2 == "") {
			$("#txt2").show(100);
		} else {
			$("#txt2").hide(100);
		}
	});
});

$(function() {
	$("#peogress_remark").blur(function() {
		var txt3 = document.getElementById("peogress_remark").value;
		if (txt3 == null || txt3 == "") {
			$("#txt3").show(100);
		} else {
			$("#txt3").hide(100);
		}
	});
});

$(function() {
	$("#milestone_id").blur(function() {
		var txt4 = document.getElementById("milestone_id").value;
		if (txt4 == null || txt4 == "请选择") {
			$("#txt4").show(100);
		} else {
			$("#txt4").hide(100);
		}
	});
});

$(function() {
	$("#plan_time").blur(function() {
		var txt5 = document.getElementById("plan_time").value;
		if (txt5 == null || txt5 == "") {
			$("#txt5").show(100);
		} else {
			$("#txt5").hide(100);
		}
	});
});

$(function() {
	$("#submit").click(function() {
		var isValid1 = false;
		var isValid2 = false;
		var isValid3 = false;
		var isValid4 = false;
		var isValid5 = false;
		var txt1 = document.getElementById("week").value;
		var txt2 = document.getElementById("progress").value;
		var txt3 = document.getElementById("peogress_remark").value;
		var txt4 = document.getElementById("milestone_id").value;
		var txt5 = document.getElementById("plan_time").value;
		if (txt1 == null || txt1 == "") {
			$("#txt1").show(100);
		} else {
			$("#txt1").hide(100);
			isValid1 = true;
		}
		if (txt2 == null || txt2 == "") {
			$("#txt2").show(100);
		} else {
			$("#txt2").hide(100);
			isValid2 = true;
		}
		if (txt3 == null || txt3 == "") {
			$("#txt3").show(100);
		} else {
			$("#txt3").hide(100);
			isValid3 = true;
		}
		if (txt4 == null || txt4 == "请选择") {
			$("#txt4").show(100);
		} else {
			$("#txt4").hide(100);
			isValid4 = true;
		}
		if (txt5 == null || txt5 == "") {
			$("#txt5").show(100);
		} else {
			$("#txt5").hide(100);
			isValid5 = true;
		}
		if (isValid1 && isValid2 && isValid3 && isValid4 && isValid5 ) {
			$(this).prop("type", "submit");
		}
	});
});
</script>
<body >
<% pageContext.setAttribute("date",new java.util.Date()); %>
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
					<form action="addWeeklyReport.html" class="form-horizontal" enctype="multipart/form-data" method="post" >
						<fieldset>
							<legend>提交项目周报</legend>
							<div class="control-group">
								<label class="control-label" for="typeahead">周报对应的周次： </label>
								<div class="controls">
									<input name="week" id="week" type="week"><span
										id="txt1" style="display: none; color: red; font-size: 12px;">*请选择周次</span>
								</div>
							</div>
							<div class="control-group">
								<label class="control-label" for="typeahead">总体进度： 
								</label>
								<div class="controls">
									<input type="number" name="progress" id="progress" min="0" max="100"><span
										id="txt2" style="display: none; color: red; font-size: 12px;">*请输入总体进度</span>
								</div>
							</div>
							<div class="control-group">
								<label class="control-label">进度状态： </label>
								<div class="controls">
									<label class="radio"> <input type="radio"
										name="progress_status" id="optionsRadios1" value="0" checked="checked">
										<i class="icon icon-green icon-bullet-on"></i>绿色：表面项目状态正常
									</label>
									<div style="clear: both"></div>
									<label class="radio"> <input type="radio"
										name="progress_status" id="optionsRadios2" value="1">
										<i class="icon icon-orange icon-bullet-on"></i>黄色：表面项目存在一些问题，从而可能导致项目不能达到预期的质量/进度
									</label>
									<div style="clear: both"></div>
									<label class="radio"> <input type="radio"
										name="progress_status" id="optionsRadios3" value="2">
										<i class="icon icon-red icon-bullet-on"></i>红色：整个项目处于危险之中
									</label>
									<br>
								</div>
							</div>
							<div class="control-group">
								<label class="control-label" for="peogress_remark">进度说明：</label>
								<div class="controls">
									<textarea style="resize:none;" id="peogress_remark" name="peogress_remark" rows="5"></textarea>
									<span id="txt3" style="display: none; color: red; font-size: 12px;">*请输入进度说明</span>
								</div>
							</div>
							<div class="control-group">
								<label class="control-label" for="typeahead">当前里程碑</label>
								<div class="controls">
									<select name="milestone_id" id= "milestone_id">
									 	<option selected>请选择</option>
										<c:forEach items="${requestScope.milestoneList }" var="milestone">
											<option value="${milestone.milestone_Id }">${milestone.milestone_Name}</option>
										</c:forEach>
									</select>
									<span id="txt4" style="display: none; color: red; font-size: 12px;">*请选择里程碑</span>
								</div>
							</div>
							<div class="control-group">
								<label class="control-label">周报附件</label>
								<div class="controls">
									<input type="file" name="accessory">
								</div>
							</div>
							<div class="control-group">
								<label class="control-label">发送邮件</label>
								<div class="controls">
									<label class="checkbox inline"> <input type="checkbox"
										id="checkbox"  name="issend_email" value="0" > 是否同时给客户发送邮件
										<input type="hidden" id="issend_email"  name="issend_email" value="0">
									</label>
									
								</div>
							</div>
							<div class="control-group">
								<label class="control-label" for="typeahead">计划提交时间 </label>
								<div class="controls">
									<input name="plan_time" id="plan_time" type="date" ><span id="txt5" style="display: none; color: red; font-size: 12px;">*请选择计划提交时间</span>
								</div>
							</div>
							<div class="control-group">
								<label class="control-label" for="typeahead">实际提交时间 </label>
								<div class="controls">
									<fmt:setLocale value="zh_CN"/>
									<input name="actual_time" type="date" readonly="readonly" value="<fmt:formatDate value='${date}'/>">
								</div>
							</div>
							<input type="hidden" value="${requestScope.project_Id }" name="project_Id">
							<div class="form-actions">
								<button type="button" id="submit" class="btn btn-primary">提交</button>
								<button type="reset" class="btn"
									onclick="window.location.href='project_unified_view.html?pid=${requestScope.project_Id }'">返回</button>
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