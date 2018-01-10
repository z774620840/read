<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<%-- $(function func(){
if(${requestScope.as.status}!="立项中"||requestScope.as.status}!="预立项"){
readonly="true"; }else{ readonly="false"; } }); --%>

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
			<div class="box span12">
				<div class="box-header well" data-original-title>
					<h2>立项列表</h2>
				</div>
				<div class="box-content">
					<form action="editProjectApproval.html" method="post">
						<table class="table table-striped table-bordered">
							<tr>
								<th>项目编号:</th>
								<td width="30%"><input type="text"
									style="width: 100%; height: 100%;"
									value="${requestScope.as.project_Id}" readonly="readonly"
									name="project_id"></td>
								<th>项目名称:</th>
								<td width="30%"><input type="text"
									style="width: 100%; height: 100%;"
									value="${requestScope.as.project_Name}" readonly="readonly"
									name="projet_name"></td>
							</tr>
							<tr>
								<th>客户公司名称:</th>
								<td colspan="3"><input type="text"
									style="width: 100%; height: 100%;"
									value="${requestScope.as.company}" readonly="readonly"
									name="company"></td>
							</tr>
							<tr>
								<th>所属行业:</th>
								<td><input type="text" style="width: 100%; height: 100%;"
									value="${requestScope.as.vacation}" readonly="readonly"
									name="vacation"></td>
								<th>解决方案方向:</th>
								<td><input type="text" style="width: 100%; height: 100%;"
									value="${requestScope.as.solution}" readonly="readonly"
									name="solution"></td>
							</tr>
							<tr>
								<th>预立项时间:</th>
								<td><input type="date" style="width: 100%; height: 100%;"
									value="${requestScope.as.presettime}" readonly="readonly"
									name="presettime"></td>
								<th>业务人员:</th>
								<td width="30%"><input type="text" name="business"
									style="width: 100%; height: 100%;"
									value="${sessionScope.name}" readonly="readonly"
									name="business"></td>
							</tr>
							<tr>
								<th>项目起始时间:</th>
								<td><input type="date" style="width: 100%; height: 100%;"
									value="${requestScope.as.starting_Time}" class="txt"
									name="starting_Time"></td>
								<th>合同要求上线时间:</th>
								<td><input type="date" style="width: 100%; height: 100%;"
									value="${requestScope.as.online_Time}" class="txt"
									name="online_Time"></td>
							</tr>
							<tr>
								<th>项目计划初验时间:</th>
								<td><input type="date" style="width: 100%; height: 100%;"
									value="${requestScope.as.initial_Test_Time}" class="txt"
									name="initial_Test_Time"></td>
								<th>项目计划终验时间:</th>
								<td><input type="date" style="width: 100%; height: 100%;"
									value="${requestScope.as.final_Test_Time}" class="txt"
									name="final_Test_Time"></td>
							</tr>
							<tr>
								<th>项目经理:</th> 
								<td><select name="pm" class="txt" id="pm">
									<c:forEach items="${requestScope.pmList }" var="pm">
									    <c:if test="${pm.user_Id ==requestScope.as.pm_Id}">
									    	<option selected value="${pm.user_Id }">${pm.employee_Name}</option>
									    </c:if>
									    <c:if test="${pm.user_Id !=requestScope.as.pm_Id}">
									    	<option value="${pm.user_Id }">${pm.employee_Name}</option>
									    </c:if>
									</c:forEach>
								</select></td>
								<th>负责实施部门:</th>
								<td>
								<input type="text" style="width: 100%; height: 100%;"
									name="department"  id="department" value= "${requestScope.as.department}"
									 readonly="readonly">
								</td>
							</tr>
							<tr>
								<th>工作量计算方式:</th>
								<td><input type="text" style="width: 100%; height: 100%;"
									name="workingload_Computing"
									value="${requestScope.as.workingload_Computing}" class="txt"></td>
								<th>项目实施地点:</th>
								<td><input type="text" style="width: 100%; height: 100%;"
									name="implement_Site" value="${requestScope.as.implement_Site}"
									class="txt"></td>
							</tr>
							<tr>
								<th>项目经理评估工作量（人日）:</th>
								<td><input id="a" type="number" min="0"
									style="width: 100%; height: 100%;" name="assess_Workload"
									value="${requestScope.as.assess_Workload}" class="txt"></td>
								<th>业务上报客户工作量（人日）:</th>
								<td><input id="a" type="number" min="0"
									style="width: 100%; height: 100%;" name="report_Workload"
									value="${requestScope.as.report_Workload}" class="txt"></td>
							</tr>
							<tr>
								<th>工作量评估人:</th>
								<td><input id="a" type="text"
									style="width: 100%; height: 100%;" name="workload_Assessor"
									value="${requestScope.as.workload_Assessor}" class="txt"></td>
								<th>工作量审核人:</th>
								<td><input id="a" type="text"
									style="width: 100%; height: 100%;" name="workload_Verifier"
									value="${requestScope.as.workload_Verifier}" class="txt"></td>
							</tr>
							<tr>
								<th>项目预算（元）:</th>
								<td colspan="3"><input type="number" min="0"
									style="width: 100%; height: 100%;" name="project_Budget"
									value="${requestScope.as.project_Budget}" class="txt"></td>
							</tr>
							<tr>
								<th>收入金额（元）:</th>
								<td><input type="number" min="0" style="width: 100%; height: 100%;"
									name="income" value="${requestScope.as.income}" class="txt"></td>
								<th>收入金额备注:</th>
								<td><input type="text" style="width: 100%; height: 100%;"
									name="income_Remark" value="${requestScope.as.income_Remark}"
									class="txt"></td>
							</tr>
							<tr>
								<th>支出金额（元）：</th>
								<td><input type="number" min="0" style="width: 100%; height: 100%;"
									name="expend" value="${requestScope.as.expend}" class="txt"></td>
								<th>支出金额备注：</th>
								<td><input type="text" style="width: 100%; height: 100%;"
									name="expend_Remark" value="${requestScope.as.expend_Remark}"
									class="txt"></td>
							</tr>
							<tr>
								<th>自有产品销售金额（元）：</th>
								<td><input type="number" min="0" style="width: 100%; height: 100%;"
									name="sales_Amount" value="${requestScope.as.sales_Amount}"
									class="txt"></td>
								<th>自有产品销售金额备注：</th>
								<td><input type="text" style="width: 100%; height: 100%;"
									name="sales_Amount_Remark"
									value="${requestScope.as.sales_Amount_Remark}" class="txt"></td>
							</tr>
							<tr>
								<th>项目毛利（元）：</th>
								<td colspan="3"><input type="number"
									style="width: 100%; height: 100%;" name="margin"
									value="${requestScope.as.margin}" class="txt"></td>
							</tr>
							<tr>
								<th>是否亏本项目：</th>
								<td colspan="3"><input type="checkbox" name="isloss"
									class="txt" id="isloss">是</td>
							</tr>
							<tr>
								<th>未包括在合同中的承诺（如对客户的口头承诺等）：</th>
								<td colspan="3"><input type="text"
									style="width: 100%; height: 100%;" name="commitment"
									value="${requestScope.as.commitment}" class="txt"></td>
							</tr>
							<tr>
								<th>备注：</th>
								<td colspan="3"><input id="txt" type="text"
									style="width: 100%; height: 100%;" name="remark"
									value="${requestScope.as.remark}" class="txt"></td>
							</tr>
							<tr>
								<th>立项状态：</th>
								<td colspan="3"><select id="status" name="status" 
									class="txt">
										<option value="0" class="txt">预立项</option>
										<option value="1" class="txt">立项中</option>
										<option value="2" class="txt">正式立项</option>
										<option value="3" class="txt">立项中止</option>
								</select></td>
							</tr>
							<c:if test="${requestScope.as.status == 0 || requestScope.as.status == 1}"> 
							<tr>
								<td colspan="4">
									<div style="float: right;" id="test">
										<button type="submit" class="btn btn-default" >提交</button>
									</div>
								</td>
							</tr>
							</c:if>

						</table>
					</form>
				</div>
			</div>
		</div>
		
	</div>
	

	<hr style="color: #003399; margin-top: 1200px;">
	<div class="navbar">
		<div class="navbar-inner">
			<div class="container-fluid">
				<p>&copy;第四小组</p>
			</div>
		</div>
	</div>
	
</body>
<script type="text/javascript">
$(function() {
	$("#pm").change(function() {
		var user_id = $(this).children('option:selected').val();
		$.ajax({
			type : "POST", //请求方式  
			url : "findDepartmentById.html", //请求路径  
			data : {
				"user_Id" : user_id
			}, //传参  
			dataType : 'text', //返回值类型  
			success : function(result) {
				$("#department").val(result);
			}
		});
	});
	//选择框改变值
	$("#isloss").click(function(){
		if($(this).attr("checked")){
			$(this).attr("value","1");
		}else{
			$(this).attr("value","0");
		}
	});

		
		var status = "${requestScope.as.status}";
		$("#status").val(status);
		switch (status) {
		case '0':
		case '1':
			$(".txt").attr("readonly", false);
			break;
		case '2':
		case '3':
			$("#status").attr("disabled","disabled");
            $(".txt").attr("readonly", true);
			break;
		}
	$("#changeSe").change(function() {
		
	})
});
</script>
</html>