<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>合同列表</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<%@ include file="header.jsp"%>
</head>
<script src="${pageContext.request.contextPath}/js/bootstrap-paginator.js"></script>
<script type="text/javascript">
	function getResult(p) {
		var result = "";
		$.ajax({
			type : "POST", //请求方式  
			url : "getContractList.html", //请求路径  
			async : false, //同步方式 
			data : {
				"page" : p,
				"cname":$("#cname").val()
			}, //传参  
			dataType : 'json', //返回值类型  
			success : function(page) {
				$("#contract tbody").children().remove();
				var contractList = page.obj;
				if (contractList != null) {
					for (i in contractList) {
						var accessory  = contractList[i].contract_Accessory;
						var accessory_Str;
						if(accessory==""){
							accessory_Str = "无";
						}else{
							accessory_Str = "<a href='"+accessory+"'>"+contractList[i].contract_Name+".doc</a>"
						}
						$("#contract tbody").append(
								"<tr>" + "<td>" + contractList[i].contract_Id + "</td>"
										+ "<td>" + contractList[i].contract_Name + "</td>"
										+ "<td>" +accessory_Str  + "</td>"
										+ "<td>" + contractList[i].money + "</td>"
										+ "<td>" + contractList[i].contract_Date + "</td>"
										+ "<td><a href ='project_unified_view.html?pid="+contractList[i].project_Id+"'>" + contractList[i].project_Id
										+ "</a></td></tr>");
					}
				}
				result = page;
			},
			error : function() {

			}

		});
		return result;
	}

	$(function() {
		var result = getResult(1);
		result = getPage(result);
		$("#select").click(function(){
			result1 = getResult(1);
			getPage(result1);
		});

	});
	function getPage(result){
		var PageNum = 5;
		$('#pageLimit')
		.bootstrapPaginator(
				{
					currentPage : result.currentPage==0?1:result.currentPage,
					totalPages : result.totalPage==0?1:result.totalPage,
					size : "normal",
					bootstrapMajorVersion : 3,
					numberOfPages : PageNum,
					shouldShowPage : true,
					itemTexts : function(type, page, current) {
						$("#pageLimit").find("li").removeClass("active");
						$("#pageLimit").find("li").eq((current - 1) % PageNum + 2).addClass("active");
						if (current == 1) {
							$("#pageLimit li:first").addClass("active");
						}
						switch (type) {
						case "first":
							return "首页";
						case "prev":
							return "上一页";
						case "next":
							return "下一页";
						case "last":
							return "末页";
						case "page":
							return page;
						}//默认显示的是第一页。
					},
					onPageClicked : function(event, originalEvent,
							type, page) {//给每个页眉绑定一个事件，其实就是ajax请求，其中page变量为当前点击的页上的数字。
						result = getResult(page);
					}
				});
		return result;
	}
</script>
<body>
	<%@ include file="navbar.jsp"%>
	<!----------------------------------------- 内容 -------------------------->
			<div id="content" class="span10">
				<!-- content starts -->
				<!--/row-->
				<div class="row-fluid sortable">
					<div class="box span12">
						<div class="box-header well" data-original-title>
							<h2>合同列表</h2>
						</div>
						<div class="box-content">
							<form class="form-inline">
								<div class="form-group" style="float: left;">
									<label for="cname">合同名称：</label> <input type="text"
										class="form-control" id= "cname"
										style="width: 100px;">
								</div>
								<button type="button" id="select" class="btn btn-default">查询</button>
							</form>
							<table class="table table-striped table-bordered" id= "contract">
								<thead>
									<tr>
										<th>合同编号</th>
										<th>合同名称</th>
										<th>合同附件</th>
										<th>合同金额</th>
										<th>合同日期</th>
										<th>项目编号</th>
									</tr>
								</thead>
								<tbody>
								</tbody>
							</table>
						</div>
					</div>
					<!-- 分页按钮 -->
					<div class="pagination pagination-centered">
						<div align="center">
							<nav aria-label="Page navigation">
								<ul class="pagination" id="pageLimit">
								</ul>
							</nav>
						</div>
					</div>
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
							<a href="#" class="btn" data-dismiss="modal">Close</a> <a
								href="#" class="btn btn-primary">Save changes</a>
						</div>
					</div>
				</div>
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