<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

	<!-- topbar starts -->
	<div class="navbar">
		<div class="navbar-inner">
			<div class="container-fluid">
				<a class="btn btn-navbar" data-toggle="collapse"
					data-target=".top-nav.nav-collapse,.sidebar-nav.nav-collapse">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
				</a> <a class="brand" href="index.html"> <img alt="Charisma Logo"
					src="img/logo20.png" /> <span>admin</span></a>

				<!-- theme selector starts -->
				<div class="btn-group pull-right theme-container">
					<a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
						<i class="icon-tint"></i><span class="hidden-phone">
							改变主题/皮肤</span> <span class="caret"></span>
					</a>
					<ul class="dropdown-menu" id="themes">
						<li><a data-value="classic" href="#"><i
								class="icon-blank"></i> 经典</a></li>
						<li><a data-value="cerulean" href="#"><i
								class="icon-blank"></i> 蔚蓝</a></li>
						<li><a data-value="cyborg" href="#"><i class="icon-blank"></i>
								黑色</a></li>
						<li><a data-value="redy" href="#"><i class="icon-blank"></i>
								红色</a></li>
						<li><a data-value="simplex" href="#"><i
								class="icon-blank"></i> 白色</a></li>
						<li><a data-value="slate" href="#"><i class="icon-blank"></i>
								暗黑</a></li>
						<li><a data-value="united" href="#"><i class="icon-blank"></i>
								橙色</a></li>
					</ul>
				</div>
				<div class="btn-group pull-right">
					<a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
						<i class="icon-user"></i><span class="hidden-phone">${sessionScope.name }</span> <span
						class="caret"></span>
					</a>
					<ul class="dropdown-menu">
						<li><a href="#">个人信息</a></li>
						<li class="divider"></li>
						<li><a href="index.html">注销</a></li>
					</ul>
				</div>
				<div class="top-nav nav-collapse">
					<form class="navbar-search pull-left">
						<ul class="nav">
							<li><input placeholder="搜索" class="search-query span2"
								name="query" type="text"></li>
							<li><a href="#">查询</a></li>
						</ul>
					</form>
				</div>
			</div>
		</div>
	</div>
	<!-- topbar ends -->
	<div class="container-fluid">
		<div class="row-fluid">

			<div class="span2 main-menu-span">
				<div class="well nav-collapse sidebar-nav">
					<ul class="nav nav-tabs nav-stacked main-menu">
					<li><a class="ajax-link" href="home.html"><i class="icon-list"></i><span class="hidden-tablet"> 首页</span></a></li>
					<c:forEach items="${menurules}" var="item">
						<c:if test="${item.rule_Name =='项目管理'}">
						<li class="nav-header hidden-tablet">项目管理</li>
						<li><a class="ajax-link" href="project_list.html"><i class="icon-list"></i><span class="hidden-tablet"> 项目列表</span></a></li>
						<c:forEach items="${menurules}" var="item">
						<c:if test="${item.rule_Name =='项目进度'}">
						<li><a class="ajax-link" href="project_unified_view.html"><i class=" icon-tag"></i><span class="hidden-tablet"> 项目进度</span></a></li>
						</c:if>
						</c:forEach>
						<c:forEach items="${menurules}" var="item">
						<c:if test="${item.rule_Name =='项目概况'}">
						<li><a class="ajax-link" href="project_table.html"><i class=" icon-tag"></i><span class="hidden-tablet"> 项目概况</span></a></li>
						</c:if>
						</c:forEach>
						<c:forEach items="${menurules}" var="item">
						<c:if test="${item.rule_Name =='干系人'}">
						<li><a class="ajax-link" href="projectMemberList.html"><i class=" icon-tag"></i><span class="hidden-tablet"> 干系人</span></a></li>
						</c:if>
						</c:forEach>
						<li><a class="ajax-link" href="workload.html"><i class=" icon-tag"></i><span class="hidden-tablet"> 工作量</span></a></li>
						</c:if>
					</c:forEach>
					<c:forEach items="${menurules}" var="item">
						<c:if test="${item.rule_Name =='立项管理'}">
						<li class="nav-header hidden-tablet">立项管理</li>
							<c:forEach items="${menurules}" var="item">
							<c:if test="${item.rule_Name =='立项申请'}">
							<li><a class="ajax-link" href="project_construct.html">
							<i class=" icon-wrench"></i><span class="hidden-tablet">立项申请</span></a></li>
							</c:if>
							</c:forEach>
							<c:forEach items="${menurules}" var="item">
							<c:if test="${item.rule_Name =='立项列表'}">
								<li><a class="ajax-link" href="business_personnel_index.html">
								<i class="icon-list"></i><span class="hidden-tablet"> 立项列表</span></a></li>
							</c:if>
							</c:forEach>
						</c:if>
					</c:forEach>
					<c:forEach items="${menurules}" var="item">		
						<c:if test="${item.rule_Name =='合同管理'}">
						<li class="nav-header hidden-tablet">合同管理</li>
						<li><a class="ajax-link" href="contract.html"><i
								class="icon-list"></i><span class="hidden-tablet"> 合同列表</span></a></li>
						</c:if>
					</c:forEach>
					<c:forEach items="${menurules}" var="item">
						<c:if test="${item.rule_Name =='邮件管理'}">
						<li class="nav-header hidden-tablet">邮件管理</li>
						<c:forEach items="${menurules}" var="item">
							<c:if test="${item.rule_Name =='邮件发送'}">
							<li><a class="ajax-link" href="send_email.html"><i class="icon-list"></i><span class="hidden-tablet"> 邮件发送</span></a></li>
							</c:if>
							</c:forEach>
						<c:forEach items="${menurules}" var="item">
							<c:if test="${item.rule_Name =='邮件发送'}">
							<li><a class="ajax-link" href="email_history.html"><i class="icon-list"></i><span class="hidden-tablet"> 邮件历史</span></a></li>
							</c:if>
						</c:forEach>
						</c:if>
						</c:forEach>
				<c:forEach items="${menurules}" var="item">
					<c:if test="${item.rule_Name =='账号管理'}">
					<li class="nav-header hidden-tablet">账号管理</li>
					<c:forEach items="${menurules}" var="item">
						<c:if test="${item.rule_Name =='账号申请'}">
						<li><a class="ajax-link" href="account.html"><i class="icon-user"></i><span class=" hidden-tablet"> 账号申请</span></a></li>
						</c:if>
					</c:forEach>
					<c:forEach items="${menurules}" var="item">
						<c:if test="${item.rule_Name =='账号审批'}">
						<li><a class="ajax-link" href="showAccountApproval.html"><i class="icon-edit"></i><span class="hidden-tablet"> 账号审批</span></a></li>
						</c:if>
					</c:forEach>
					<c:forEach items="${menurules}" var="item">
						<c:if test="${item.rule_Name =='账号列表'}">
						<li><a class="ajax-link" href="showPassAccount.html"><i class="icon-list"></i><span class="hidden-tablet"> 账号列表</span></a></li>
						</c:if>
					</c:forEach>
					<c:forEach items="${menurules}" var="item">
						<c:if test="${item.rule_Name =='密码修改'}">
						<li><a class="ajax-link" href="change_password.html"><i class="icon-edit"></i><span class="hidden-tablet"> 密码修改</span></a></li>
						</c:if>
					</c:forEach>
					</c:if>
				</c:forEach>
					</ul>
				</div>
			</div>
			<noscript>
				<div class="alert alert-block span10">
					<h4 class="alert-heading">Warning!</h4>
					<p>
						You need to have <a href="http://en.wikipedia.org/wiki/JavaScript"
							target="_blank">JavaScript</a> enabled to use this site.
					</p>
				</div>
			</noscript>
			