<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Creative - Bootstrap 3 Responsive Admin Template">
    <meta name="author" content="GeeksLabs">
    <meta name="keyword" content="Creative, Dashboard, Admin, Template, Theme, Bootstrap, Responsive, Retina, Minimal">
    <link rel="shortcut icon" href="/static/img/favicon.png">

    <title>TMS-综合管理系统</title>

    <!-- Bootstrap CSS -->    
    <link href="/static/css/bootstrap.min.css" rel="stylesheet">
    <!-- bootstrap theme -->
    <link href="/static/css/bootstrap-theme.css" rel="stylesheet">
    <!--external css-->
    <!-- font icon -->
    <link href="/static/css/elegant-icons-style.css" rel="stylesheet">
    <link href="/static/css/font-awesome.css" rel="stylesheet">
    <!-- Custom styles -->
    <link href="/static/css/style.css" rel="stylesheet">
    <link href="/static/css/style-responsive.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 -->
    <!--[if lt IE 9]>
    <script src="/static/js/html5shiv.js"></script>
    <script src="/static/js/respond.min.js"></script>
    <![endif]-->

    <style type="text/css">
          .login-form {
            margin-top: 150px;
            
            }
         
    </style>
</head>

  <body class="login-img3-body">

    
    <div class="container">
      <form class="login-form" method="post" action="/">
      <div class="text-center">
         <h1>TSM-<span class="lite">综合管理系统</span></h1>
      </div>
        <div class="login-wrap">
            <p class="login-img"><i class="icon_lock_alt"></i></p>
            <div class="input-group">
              <span class="input-group-addon"><i class="icon_profile"></i></span>
              <input type="text" class="form-control" placeholder="账号" name="mobile" value="110">
            </div>
            <div class="input-group">
                <span class="input-group-addon"><i class="icon_key_alt"></i></span>
                <input type="password" class="form-control" placeholder="密码" name="password" value="123">
            </div>
            <label class="checkbox">
                <input type="checkbox" value="remember-me" name="rememberMe"> 记住账号
                <span class="pull-right"> <a href="#"> 忘记密码</a></span>
            </label>
            <button class="btn btn-primary btn-lg btn-block" type="submit">登录</button>
        </div>
      </form>

    </div>


  </body>
</html>
