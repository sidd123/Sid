<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome To LearnersBuzz</title>
</head>
<body>
	<h1>Welcome to LearnersBuzz</h1>
	<form name="loginForm" class="form-horizontal login" role="form">
		<p>
			<label for="login">User name:</label> <input type="text"
				class="form-control" placeholder="username" name="username"
				ng-model="login.username" required focus />
			<!-- <i class="ace-icon fa fa-user"></i>-->
		</p>

		<p>
			<label for="password">Password:</label> <input type="password"
				class="form-control glyphicon glyphicon-lock" placeholder="Password"
				ng-model="login.password" required />
			<!-- <i class="ace-icon fa fa-lock"></i> -->
		</p>

		<p class="login-submit">
			<button type="button" class="login-button" ng-click="doLogin(login)"
				data-ng-disabled="loginForm.$invalid">Login</button>
		</p>

		<p class="forgot-password">
			<a href="index.html">Forgot your password?</a>
		</p>
	</form>
</body>
</html>