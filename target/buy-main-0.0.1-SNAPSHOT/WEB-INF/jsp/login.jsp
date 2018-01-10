<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>登录</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />
<link rel="stylesheet" type="text/css" href="css/body.css" />
</head>
<body>
	<div class="container">
		<section id="content">
			<form action="login.html" method="post">
				<h1>会员登录</h1>
				<div>
					<input type="text" placeholder="邮箱" required="required"
						id="username" name="username" />
				</div>
				<div>
					<input type="password" placeholder="密码" required="required"
						id="password" name="password" />
				</div>
				<div class="">
					<span class="help-block u-errormessage" id="js-server-helpinfo">&nbsp;</span>
				</div>
				<div>
					<input type="submit" value="登录" class="btn btn-primary"
						id="js-btn-login" /> <a href="#">忘记密码?</a>
				</div>
			</form>
		</section>
	</div>
	
</body>
</html>