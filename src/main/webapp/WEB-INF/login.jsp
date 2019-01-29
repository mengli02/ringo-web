<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en-us" id="extr-page">
<head>
<meta charset="UTF-8">
<title>登陆</title>
<meta name="description" content="">
<meta name="author" content="dream.li">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<!-- #CSS Links -->
<!-- Basic Styles -->
<link rel="stylesheet" type="text/css" media="screen"
	href="${pageContext.request.contextPath}/static/smart/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" media="screen"
	href="${pageContext.request.contextPath}/static/smart/css/font-awesome.min.css">

<!-- SmartAdmin Styles : Caution! DO NOT change the order -->
<link rel="stylesheet" type="text/css" media="screen"
	href="${pageContext.request.contextPath}/static/smart/css/smartadmin-production.min.css">
<link rel="${pageContext.request.contextPath}/static/smart/stylesheet"
	type="text/css" media="screen"
	href="${pageContext.request.contextPath}/static/smart/css/smartadmin-skins.min.css">

<!-- SmartAdmin RTL Support -->
<link rel="stylesheet" type="text/css" media="screen"
	href="${pageContext.request.contextPath}/static/smart/css/smartadmin-rtl.min.css">

<!-- We recommend you use "your_style.css" to override SmartAdmin
		     specific styles this will also ensure you retrain your customization with each SmartAdmin update.
		<link rel="stylesheet" type="text/css" media="screen" href="css/your_style.css"> -->

<!-- #FAVICONS -->
<link rel="shortcut icon"
	href="${pageContext.request.contextPath}/static/smart/img/favicon/favicon.ico"
	type="image/x-icon">
<link rel="icon"
	href="${pageContext.request.contextPath}/static/smart/img/favicon/favicon.ico"
	type="image/x-icon">

<!-- #GOOGLE FONT -->
<link rel="stylesheet"
	href="http://fonts.googleapis.com/css?family=Open+Sans:400italic,700italic,300,400,700">

<!-- #APP SCREEN / ICONS -->
<!-- Specifying a Webpage Icon for Web Clip 
			 Ref: https://developer.apple.com/library/ios/documentation/AppleApplications/Reference/SafariWebContent/ConfiguringWebApplications/ConfiguringWebApplications.html -->
<link rel="apple-touch-icon"
	href="${pageContext.request.contextPath}/static/smart/img/splash/sptouch-icon-iphone.png">
<link rel="apple-touch-icon" sizes="76x76"
	href="${pageContext.request.contextPath}/static/smart/img/splash/touch-icon-ipad.png">
<link rel="apple-touch-icon" sizes="120x120"
	href="${pageContext.request.contextPath}/static/smart/img/splash/touch-icon-iphone-retina.png">
<link rel="apple-touch-icon" sizes="152x152"
	href="${pageContext.request.contextPath}/static/smart/img/splash/touch-icon-ipad-retina.png">

<!-- iOS web-app metas : hides Safari UI Components and Changes Status Bar Appearance -->
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-status-bar-style" content="black">

<!-- Startup image for web apps -->
<link rel="apple-touch-startup-image"
	href="${pageContext.request.contextPath}/static/smart/img/splash/ipad-landscape.png"
	media="screen and (min-device-width: 481px) and (max-device-width: 1024px) and (orientation:landscape)">
<link rel="apple-touch-startup-image"
	href="${pageContext.request.contextPath}/static/smart/img/splash/ipad-portrait.png"
	media="screen and (min-device-width: 481px) and (max-device-width: 1024px) and (orientation:portrait)">
<link rel="apple-touch-startup-image"
	href="${pageContext.request.contextPath}/static/smart/img/splash/iphone.png"
	media="screen and (max-device-width: 320px)">

</head>
<body class="animated fadeInDown">

	<header id="header">

		<div id="logo-group">
			<span id="logo"> <img src="${pageContext.request.contextPath}/static/smart/img/logo.png" alt="图书管理系统">
			</span>
		</div>

		<span id="extr-page-header-space"> <span class="hidden-mobile hidden-xs">需要创建一个账号吗?</span> 
		<a href="register.html" class="btn btn-danger"> 创建 账号 </a>
		</span>

	</header>

	<div id="main" role="main">

		<!-- MAIN CONTENT -->
		<div id="content" class="container">

			<div class="row">
				<div
					class="col-xs-12 col-sm-12 col-md-7 col-lg-8 hidden-xs hidden-sm">
					<h1 class="txt-color-red login-header-big">图书管理系统</h1>
					<div class="hero">

						<div class="pull-left login-desc-box-l">
							<h4 class="paragraph-header">这是一个图书管理系统</h4>
							<!-- <div class="login-app-icons">
								<a href="javascript:void(0);" class="btn btn-danger btn-sm"></a> 
								<a href="javascript:void(0);" class="btn btn-danger btn-sm"></a>
							</div> -->
						</div>

						<img
							src="${pageContext.request.contextPath}/static/smart/img/demo/iphoneview.png"
							class="pull-right display-image" alt="" style="width: 210px">

					</div>

					<div class="row">
						<div class="col-xs-12 col-sm-12 col-md-6 col-lg-6">
							<h5 class="about-heading"></h5>
							<p></p>
						</div>
						<div class="col-xs-12 col-sm-12 col-md-6 col-lg-6">
							<h5 class="about-heading"></h5>
							<p></p>
						</div>
					</div>

				</div>
				<div class="col-xs-12 col-sm-12 col-md-5 col-lg-4">
					<div class="well no-padding">
						<form action="authentication/login" id="login-form" method="post"
							class="smart-form client-form">
							<header> 登 陆 </header>
							<fieldset>
								<section>
									<label class="label">用户名</label> <label class="input">
										<i class="icon-append fa fa-user"></i> <input type="text"
										name="username"> <b class="tooltip tooltip-top-right"><i
											class="fa fa-user txt-color-teal"></i> 请输入用户名</b>
									</label>
								</section>

								<section>
									<label class="label">密码</label> <label class="input">
										<i class="icon-append fa fa-lock"></i> <input type="password"
										name="password"> <b class="tooltip tooltip-top-right"><i
											class="fa fa-lock txt-color-teal"></i> 请输入密码</b>
									</label>
									<div class="note">
										<a href="forgotpassword.html"> 忘记密码?</a>
									</div>
								</section>

								<section>
									<label class="checkbox"> <input type="checkbox"
										name="remember" checked=""> <i></i>记住登陆
									</label>
								</section>
							</fieldset>
							<footer>
								<button type="submit" class="btn btn-primary">登陆</button>
							</footer>
						</form>
					</div>

					<!-- <h5 class="text-center">- Or sign in using -</h5>

					<ul class="list-inline text-center">
						<li><a href="javascript:void(0);"
							class="btn btn-primary btn-circle"><i class="fa fa-facebook"></i></a>
						</li>
						<li><a href="javascript:void(0);"
							class="btn btn-info btn-circle"><i class="fa fa-twitter"></i></a>
						</li>
						<li><a href="javascript:void(0);"
							class="btn btn-warning btn-circle"><i class="fa fa-linkedin"></i></a>
						</li>
					</ul> -->

				</div>
			</div>
		</div>

	</div>

	<!--================================================== -->

	<!-- Link to Google CDN's jQuery + jQueryUI; fall back to local -->
	<!--  <script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
		<script> if (!window.jQuery) { document.write('<script src="js/libs/jquery-2.1.1.min.js"><\/script>');} </script>
 -->
	<script
		src="${pageContext.request.contextPath}/static/smart/js/libs/jquery-2.1.1.min.js"></script>

	<!--  <script src="//ajax.googleapis.com/ajax/libs/jqueryui/1.10.3/jquery-ui.min.js"></script>
		<script> if (!window.jQuery.ui) { document.write('<script src="js/libs/jquery-ui-1.10.3.min.js"><\/script>');} </script>
		 -->

	<script
		src="${pageContext.request.contextPath}/static/smart/js/libs/jquery-ui-1.10.3.min.js"></script>

	<!-- IMPORTANT: APP CONFIG -->
	<script
		src="${pageContext.request.contextPath}/static/smart/js/app.config.seed.js"></script>

	<!-- JS TOUCH : include this plugin for mobile drag / drop touch events 		
		<script src="js/plugin/jquery-touch/jquery.ui.touch-punch.min.js"></script> -->

	<!-- BOOTSTRAP JS -->
	<script
		src="${pageContext.request.contextPath}/static/smart/js/bootstrap/bootstrap.min.js"></script>

	<!--[if IE 8]>
			
			<h1>Your browser is out of date, please update your browser by going to www.microsoft.com/download</h1>
			
		<![endif]-->

	<!-- MAIN APP JS FILE -->
	<script
		src="${pageContext.request.contextPath}/static/smart/js/app.seed.js"></script>

</body>
</html>