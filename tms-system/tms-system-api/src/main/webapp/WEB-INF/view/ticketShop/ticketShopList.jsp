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
                      <div class="col-md-1"></div>
                      <div class="col-md-10">
                          <a href="/system/ticketShop/add" class="layui-btn layui-btn-info" style="float: right">添加售票点信息</a>
                          <c:choose>
                              <c:when test="${not empty shopList}">
                                  <table class="table table-hover">
                                      <thead>
                                      <tr style="font-size: 20px;">
                                          <td class="info"><strong>售票点名称</strong></td>
                                          <td class="info"><strong>售票点所在地</strong></td>
                                          <td class="info"><strong>管理人姓名</strong></td>
                                          <td class="info"><strong>联系电话</strong></td>
                                      </tr>
                                      </thead>
                                      <tbody>
                                      <c:forEach items="${shopList}" var="shop">
                                          <tr style="font-size: 20px" class="scenicMessage" val="${shop.id}">
                                              <td class="info">${shop.name}</td>
                                              <td class="info">${shop.address}</td>
                                              <td class="info">${shop.shopAccount.spare}</td>
                                              <td class="info">${shop.shopAccount.account}</td>
                                          </tr>
                                      </c:forEach>
                                      </tbody>
                                  </table>
                              </c:when>
                              <c:otherwise>
                                  <h2 style="margin-top: 40px;margin-left: 450px">暂无数据</h2>
                              </c:otherwise>
                          </c:choose>
                      </div>
                  </div>
                  <c:if test="${not empty shopList}">
                      <ul class="pager">
                          <li class="previous disabled"><a href="#"  style="color: #3d8b40"><span aria-hidden="true">&larr;</span> 上一页</a></li>
                          <li class="next"><a href="#" style="color: #3d8b40">下一页 <span aria-hidden="true">&rarr;</span></a></li>
                      </ul>
                  </c:if>
              </div>
          </section>
      </section>
      <!-- js -->
      <jsp:include page="../include/js.jsp"/>

  <script>
      (function () {
          if("${message}"){
              layer.msg("${message}");
          }
          layui.use('laypage', function(){
              var laypage = layui.laypage;

              //执行一个laypage实例
              laypage.render({
                  elem: 'limitPage' //注意，这里的 test1 是 ID，不用加 # 号
                  ,count: 50 //数据总数，从服务端得到

              });
          });
      })()
  </script>

  </body>
</html>
