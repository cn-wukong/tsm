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

    <title>TMS-综合管理系统</title>
    <%--css--%>
    <jsp:include page="../include/css.jsp"/>
    <link rel="stylesheet" type="text/css" href="/static/webuploader/webuploader.css">
  </head>

  <body>

      <%--头部--%>
      <jsp:include page="../include/head.jsp"/>

      <!--左侧部分-->
      <jsp:include page="../include/left.jsp"/>
      <%--内容部分--%>
      <section id="main-content">

          <section class="wrapper">
              <div id="container">
                  <div class="row">
                      <div class="col-md-3"></div>
                      <div class="col-md-6">
                          <div style="margin-top: 120px">
                              <div class="site-title">
                                  <div id="uploader-demo" style="float: right;margin-top: -4px">
                                      <div id="fileList" class="uploader-list"></div>
                                      <div id="picker"><i class="fa fa-address-card" aria-hidden="true"></i>　上传身份证照片</div>
                                  </div>
                                  <p class="lead" style="display: inline-block;margin-left: 28px">景区资料填写</p>
                              </div>
                              <c:if test="${not empty message}">
                                  <div class="layui-bg-red" style="width: auto;height: 30px;font-size: 20px;margin-bottom: 10px"><label style="margin-left: 220px">${message}</label></div>
                              </c:if>
                              <c:if test="${not empty shopAccount}">
                                  <div id="chooseMessage">
                                      <div class="layui-bg-red" style="width: auto;height: 30px;font-size: 20px;margin-bottom: 10px">
                                          <label style="margin-left: 180px">您有未完成的注册,是否继续?　　
                                              <a href="/system/ticketShop/create" style="margin-right: 20px" id="yesHref"><i class="fa fa-check" aria-hidden="true"></i></a>
                                              <a href="javascript:;" id="noHref"><i class="fa fa-times" aria-hidden="true"></i></a>
                                          </label>
                                      </div>
                                  </div>
                              </c:if>
                              <form class="layui-form" method="post" action="/system/ticketShop/add">
                                  <div class="layui-form-item">
                                      <label class="layui-form-label">姓名 :</label>
                                      <div class="layui-input-block">
                                          <input type="text" name="spare" required  lay-verify="required" placeholder="请输入姓名" autocomplete="off" class="layui-input">
                                      </div>
                                  </div>
                                  <div class="layui-form-item">
                                      <label class="layui-form-label">账户 :</label>
                                      <div class="layui-input-block">
                                          <input type="text" name="account" required  lay-verify="required" placeholder="请输入手机号" autocomplete="off" class="layui-input">
                                      </div>
                                  </div>
                                  <div class="layui-form-item">
                                      <label class="layui-form-label">密码 :</label>
                                      <div class="layui-input-block">
                                          <input type="password" id="password" name="password" required  lay-verify="required" placeholder="请输入注册密码" autocomplete="off" class="layui-input">
                                      </div>
                                  </div>
                                  <div class="layui-form-item">
                                      <label class="layui-form-label">确认 :</label>
                                      <div class="layui-input-block">
                                          <input type="password" id="makeSure" name="makeSure" required  lay-verify="required" placeholder="请确认注册密码" autocomplete="off" class="layui-input">
                                      </div>
                                  </div>
                                  <input type="text" id="photo" name="accountPhoto" hidden>

                                  <div class="layui-form-item">
                                      <div class="layui-input-block">
                                          <button class="layui-btn" lay-submit lay-filter="formDemo" id="submitBtn">下一步</button>
                                          <button type="button" class="layui-btn layui-btn-primary" id="returnBtn">取消注册</button>
                                      </div>
                                  </div>

                              </form>
                        </div>
                    </div>
                </div>
              </div>
          </section>
      </section>
      <!-- js -->
      <jsp:include page="../include/js.jsp"/>
      <script type="text/javascript" src="/static/webuploader/webuploader.js"></script>
  <script>
      (function(){
          // 初始化Web Uploader
          var uploader = WebUploader.create({
              pick: '#picker',
              swf: '/static/webuploader/Uploader.swf',
              server: 'http://upload.qiniup.com',
              auto: true,
              fileVal: 'file',
              formData:{
                  'token':'${token}'
              },
              accept: {
                  title: 'Images',
                  extensions: 'gif,jpg,jpeg,bmp,png',
                  mimeTypes: 'image/*'
              },
          });
          uploader.on('uploadSuccess',function (file, data) {
            $("#photo").val(data.key);
          });

          //取消注册
          $("#returnBtn").click(function(){
              window.location.href = "/system/ticket/shopList";
          });
          //验证密码 确认密码是否一致
          layui.use('form', function(){
              var form = layui.form;

              //监听提交
              form.on('submit(formDemo)', function(data){
                  var json = JSON.stringify(data.field);
                  //将字符串转化成json对象
                  var accountJson = (new Function("return " + json))();
                  var password = accountJson.password;
                  var makeSure = accountJson.makeSure;
                  if(password!=makeSure){
                      layer.msg("两次输入的密码不一致");
                      return false;
                  }
              });
          });
          //          当用户点击不继续操作时 删除session中的数据
          $("#noHref").click(function(){
              $.ajax({
                  type:"post",
                  url:"/system/ticket/kill/session"
              })
              $("#chooseMessage").html("");
          });

      })()
  </script>

  </body>
</html>
