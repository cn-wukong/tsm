<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
                          <div class="layui-btn-group" style="float: right">
                              <button class="layui-btn" style="background-color: #00b7ee" data-toggle="modal" data-target=".bs-example-modal-lg"><i class="layui-icon">&#xe654;</i></button>
                              <button class="layui-btn" style="background-color: orange"><i class="layui-icon">&#xe642;</i></button>
                              <button class="layui-btn" style="background-color: red"><i class="layui-icon">&#xe640;</i></button>
                          </div>
                          <c:choose>
                              <c:when test="${not empty accountList}">
                                  <table class="table">
                                      <thead>
                                      <tr style="font-size: 20px;color: #3b883e">
                                          <td class="info"><label>用户名</label></td>
                                          <td class="info"><label>手机号</label></td>
                                          <td class="info"><label>创建时间</label></td>
                                          <td class="info"><label>修改时间</label></td>
                                          <td class="info"><label>当前状态</label></td>
                                          <td class="info"><label>权限</label></td>
                                      </tr>
                                      </thead>
                                      <tbody>
                                      <c:forEach items="${accountList}" var="account">
                                          <tr style="font-size: 20px;color:#1a1a1a" class="scenicMessage" val="${account.id}">
                                              <td class="info"><label>${account.accountName}</label></td>
                                              <td class="info"><label>${account.accountMobile}</label></td>
                                              <td class="info"><label><fmt:formatDate value="${account.createTime}" pattern="YYYY年MM月dd日"/></label></td>
                                              <td class="info"><label><fmt:formatDate value="${account.updateTime}" pattern="YYYY年MM月dd日"/></label></td>
                                              <td class="info"><label>${account.accountState}</label></td>
                                              <td class="info">
                                                  <c:forEach items="${account.roleList}" var="role">
                                                    <label>${role.roleName}</label>
                                                  </c:forEach>
                                              </td>
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
                  <c:if test="${not empty accountList}">
                      <ul class="pager">
                          <li class="previous disabled"><a href="#"  style="color: #3d8b40"><span aria-hidden="true">&larr;</span> 上一页</a></li>
                          <li class="next"><a href="#" style="color: #3d8b40">下一页 <span aria-hidden="true">&rarr;</span></a></li>
                      </ul>
                  </c:if>
              </div>
          </section>
      </section>
      <%--model--%>
      <div class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel">
          <div class="modal-dialog modal-lg" role="document">
              <div class="modal-content">
                  <form class="layui-form layui-form-pane" action="">
                      <div class="layui-form-item" pane>
                          <label class="layui-form-label">景区所在地</label>
                          <div class="layui-input-block">
                              <input type="text" name="address" required lay-verify="required" autocomplete="off" class="layui-input">
                          </div>
                      </div>
                      <div class="layui-form-item" pane>
                          <label class="layui-form-label">景区所在地</label>
                          <div class="layui-input-block">
                              <input type="text" name="address" required lay-verify="required" autocomplete="off" class="layui-input">
                          </div>
                      </div>
                      <div class="layui-form-item" pane>
                          <label class="layui-form-label">景区所在地</label>
                          <div class="layui-input-block">
                              <input type="text" name="address" required lay-verify="required" autocomplete="off" class="layui-input">
                          </div>
                      </div>

                      <div class="layui-form-item" pane>
                          <label class="layui-form-label">景区所在地</label>
                          <div class="layui-input-block">
                              <input type="text" name="address" required lay-verify="required" autocomplete="off" class="layui-input">
                          </div>
                      </div>
                      <div class="layui-form-item">
                          <label class="layui-form-label">景区级别</label>
                          <div class="layui-input-block">
                              <select name="level" lay-verify="required">
                                  <option value=""></option>
                                  <option value="A">A级</option>
                                  <option value="AA">AA级</option>
                                  <option value="AAA">AAA级</option>
                                  <option value="AAAA">AAAA级</option>
                                  <option value="AAAAA">AAAAA级</option>
                              </select>
                          </div>
                      </div>
                  </form>
              </div>
          </div>
      </div>
      <!-- js -->
      <jsp:include page="../include/js.jsp"/>

  <script>

  </script>

  </body>
</html>
