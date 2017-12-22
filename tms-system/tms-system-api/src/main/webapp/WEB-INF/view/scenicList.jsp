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
    <jsp:include page="include/css.jsp"/>
  </head>

  <body>

      <%--头部--%>
      <jsp:include page="include/head.jsp"/>

      <!--左侧部分-->
      <jsp:include page="include/left.jsp"/>
      <%--内容部分--%>
      <section id="main-content">
          <section class="wrapper">
              <div id="container">
                  <div class="row">
                      <div class="col-md-1"></div>
                      <div class="col-md-10">
                          <a href="/system/scenic/account/add" class="layui-btn layui-btn-info" style="float: right">添加景区信息</a>
                          <c:choose>
                              <c:when test="${not empty scenicList}">
                                  <table class="table table-hover">
                                      <thead>
                                      <tr style="font-size: 20px">
                                          <td class="info"><strong>景区名称</strong></td>
                                          <td class="info"><strong>景区所在地</strong></td>
                                          <td class="info"><strong>景区星级</strong></td>
                                          <td class="info"><strong>景区经理</strong></td>
                                          <td class="info"><strong>联系电话</strong></td>
                                      </tr>
                                      </thead>
                                      <tbody>
                                      <c:forEach items="${scenicList}" var="scenic">
                                          <tr style="font-size: 20px" class="scenicMessage" val="${scenic.id}">
                                              <td class="info">${scenic.name}</td>
                                              <td class="info">${scenic.address}</td>
                                              <td class="info">${scenic.level}</td>
                                              <td class="info">${scenic.manager}</td>
                                              <td class="info">${scenic.phone}</td>
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
                  <c:if test="${not empty scenicList}">
                      <nav>
                          <ul class="pager">
                              <li class="previous disabled"><a href="#"  style="color: black"><span aria-hidden="true">&larr;</span> 上一页</a></li>
                              <li class="next"><a href="#" style="color: black">下一页 <span aria-hidden="true">&rarr;</span></a></li>
                          </ul>
                      </nav>
                  </c:if>
              </div>
          </section>
      </section>
      <!-- js -->
      <jsp:include page="include/js.jsp"/>

  <script>
      (function(){
          if("${message}"!=""&&"${message}"!=null){
              layer.msg("${message}");
          }
          $(document).delegate(".scenicMessage","click",function(){
              var scenicId = $(this).attr("val");
              window.location.href = "/system/scenic/allMessage/"+scenicId;

          })
      })()
  </script>

  </body>
</html>
