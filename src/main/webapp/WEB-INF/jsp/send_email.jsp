
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>邮件发送</title>
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
							<h2>发送邮件</h2>
						</div>
						<div class="box-content">

							<table class="table table-striped table-bordered">
								<tr>
									<th><button class="btn btn-default" type="submit">收件人</button>：</th>
									<td colspan="3"><select>
											<option value="volvo">张三</option>
											<option value="saab">李四</option>
									</select></td>
								</tr>
								<tr>
									<th>标题：</th>
									<td colspan="3"><input type="text" style="width:100%;height:100%;"></td>
								</tr>
								<tr>
									<th>内容：</th>
									<td colspan="3"><textarea
											class="form-control" rows="3"></textarea></td>
								</tr>
								<tr>
									<th>相关文件：</th>
									<td colspan="3"><input type="file" class="form-control"
										id="exampleInputName2" style="width: 80px; height: 30px;">

									</td>
								</tr>
								<tr>
									<td colspan="4">
										<div style="float: right;">
											<button type="submit" class="btn btn-default">发送</button>
										</div>
									</td>



								</tr>
							</table>
						</div>
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