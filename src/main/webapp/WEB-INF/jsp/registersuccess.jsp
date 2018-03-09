<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>

<title>iRead | 注册成功</title>

<%@ include file="bookheader.jsp"%>
<style>
.button {
  display: inline-block;
  border-radius: 4px;
  background-color: #004080;
  border: none;
  color: #FFFFFF;
  text-align: center;
  font-size: 15px;
  padding: 5px;
  width: 100px;
  height:30px;
  
  transition: all 0.5s;
  cursor: pointer;
  margin:10px 85px;
}

.button span {
  cursor: pointer;
  display: inline-block;
  position: relative;
  transition: 0.5s;
}

.button span:after {
  content: '»';
  position: absolute;
  opacity: 0;
  top: 0;
  right: -20px;
  transition: 0.5s;
}

.button:hover span {
  padding-right: 25px;
}

.button:hover span:after {
  opacity: 1;
  right: 0;
}
</style>

</head>

<body>
<<div id="wrap">

		<div id="contents">
			<div id="left">
				<h2>注册成功</h2>
				
			
			<div class="contactform">
			<button class="button" type="button" name="submit" id="submit"
									style="vertical-align:middle"><span>点击登录 </span></button>


</div>
</div>

			<div class="clear"></div>

		</div>
	</div>
<div id="footer"></div>
	<div id="credit">Designed by ZJN</div>
</body>
</html>
