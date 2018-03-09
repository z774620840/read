<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>

<title>iRead | 用户注册</title>

<%@ include file="bookheader.jsp"%>

</head>

<body>
	<!----------------------------------------- 内容 -------------------------->
	<script type="text/javascript">
		$(function() {
			$("#username").click(function() {
				$("#txt").hide(100);
			});
			$("#username").blur(function() {

				var usval = document.getElementById("username").value
				var regix1 = /^(\w)+(\.\w+)*@(\w)+((\.\w{2,3}){1,3})$/;
				var regix2 = /^1[34578]\d{9}$/;
				if (usval == null || usval == "") {
					$("#txt").show(100);
				} else if (!regix1.test(usval) && !regix2.test(usval)) {
					$("#txt1").show(100);
				} else {
					$("#txt1").hide(100);
					$("#txt").hide(100);
				}
			});

		});
	
		
		$(function() {
			$("#password").click(function() {
				$("#txt2").hide(100);
			});
			$("#password").blur(function() {
				var password = document.getElementById("password").value;
				if (password == null || password == "") {
					$("#txt2").show(100);
				} else {
					$("#txt2").hide(100);
				}
			});
		});
		
		$(function() {
			$("#pswagain").click(function() {
				$("#txt3").hide(100);
			});
			$("#pswagain").blur(function() {
				var password = document.getElementById("password").value;
				var pswagain = document.getElementById("pswagain").value;
				if (pswagain == null || pswagain == "") {
					$("#txt3").show(100);
				} else if (password != pswagain) {
					$("#txt4").show(100);
				} else {
					$("#txt3").hide(100);
					$("#txt4").hide(100);
				}
			});
		});
		
		
		$(function() {
			$("#submit").click(function() {
				
				var isValid1 = false;
				var isValid2 = false;
				var isValid3 = false;
			
				var username = document.getElementById("username").value;
				var pswagain = document.getElementById("pswagain").value;
				var password = document.getElementById("password").value;
				var regix1 = /^(\w)+(\.\w+)*@(\w)+((\.\w{2,3}){1,3})$/;
				var regix2 = /^1[34578]\d{9}$/;
				
				if (username == null || username == "") {
					$("#txt").show(100);
				} 
				else if(!regix1.test(username) && !regix2.test(username)){
					$("#txt1").show(100);
				}
				else {
					$("#txt1").hide(100);				
					$("#txt").hide(100);
					isValid1 = true;
				}
				if (password == null || password == "") {
					$("#txt2").show(100);
				} else {
					$("#txt2").hide(100);
					isValid2 = true;
				}
				if (pswagain == null || pswagain == "") {
					$("#txt3").show(100);
				} else if(password != pswagain ){
					$("#txt4").show(100);
				} else{
					$("#txt3").hide(100);
					$("#txt4").hide(100);
					isValid3 = true;
				}

				if (isValid1 && isValid2 && isValid3 ) {
					$(this).prop("type", "submit");
				}
			});
		});
		
		
		
	</script>


	<div id="wrap">

		<div id="contents">
			<div id="left">
				<h2>注册</h2>
				<form action="register.html" method="post">
					<div class="contactform">
						<p>
							用户名&nbsp;&nbsp;&nbsp;&nbsp; <input class="textfield"
								name="username" id="username" type="text" placeholder="电子邮箱或手机号">
							<span id="txt" name="txt"
								style="display: none; color: red; font-size: 15px;">*请填写用户名</span>
							<span id="txt1" name="txt1"
								style="display: none; color: red; font-size: 15px;">*用户名格式不正确</span>

						</p>

						<br>
						<p>
							密码&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input
								class="textfield" name="password" id="password" type="password"> <span
								id="txt2" name="txt2"
								style="display: none; color: red; font-size: 15px;">*请输入密码</span>
						</p>
						<br>
						<p>
							再次确认&nbsp; <input class="textfield" name="pswagain" id="pswagain" type="password">
							<span id="txt3" name="txt3"
								style="display: none; color: red; font-size: 15px;">*请再次输入密码</span>
							<span id="txt4" name="txt4"
								style="display: none; color: red; font-size: 15px;">*两次输入的密码不一致，请重新检查</span>
						</p>
						<br> 
						<button type="button" name="submit" id="submit"
									style="margin: 15px  125px;width:70px;height:30px">注册</button>


					</div>
				</form>
			</div>




			<div class="clear"></div>

		</div>
	</div>


	<div id="footer"></div>
	<div id="credit">Designed by ZJN</div>
</body>
</html>
