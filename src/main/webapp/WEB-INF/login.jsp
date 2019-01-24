<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>login</title>
		<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
    	<link href="https://getbootstrap.com/docs/4.0/examples/signin/signin.css" rel="stylesheet" crossorigin="anonymous"/>
	</head>
<body>
<div>登陆</div>
	<div class="container">
		<form class="form-signin" method="post" action="authentication/login">
			<h2 class="form-signin-heading">Please sign in</h2>
			<p>
				<label for="username" class="sr-only">Username</label> 
				<input type="text" id="username" name="username" class="form-control"
					placeholder="Username" required autofocus>
			</p>
			<p>
				<label for="password" class="sr-only">Password</label> 
				<input type="password" id="password" name="password" class="form-control"
					placeholder="Password" required>
			</p>
			<input name="_csrf" type="hidden" value="e94f1f08-1269-40ac-a4e6-4c4e6eaccf02" />
			<button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
		</form>
</body>
</html>