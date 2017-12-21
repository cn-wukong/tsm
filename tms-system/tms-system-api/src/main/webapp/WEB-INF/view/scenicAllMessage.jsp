<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
                      <div class="col-md-4">
                          <h3 style="margin-bottom: 15px"><span class="label label-info">景区名称</span>　${scenic.name}</h3>
                          <h3 style="margin-bottom: 15px"><span class="label label-success">景区等级</span>　${scenic.level}</h3>
                          <h3 style="margin-bottom: 15px"><span class="label label-info">所在地点</span>　${scenic.address}</h3>
                          <h3 style="margin-bottom: 15px"><span class="label label-success">景区经理</span>　${scenic.manager}</h3>
                          <h3 style="margin-bottom: 15px"><span class="label label-info">联系电话</span>　${scenic.phone}</h3>
                          <h3 style="margin-bottom: 15px"><span class="label label-success">所在地点</span>　${scenic.address}</h3>
                          <h3 style="margin-bottom: 20px"><span class="label label-info">经度纬度</span>　${scenic.longitude} ${scenic.latitude}</h3>
                          <h3 style="margin-bottom: 15px"><span class="label label-success">创建时间</span>　<fmt:formatDate value="${scenic.createTime}" pattern="YYYY年MM月dd日"/></h3>
                          <h3 style="margin-bottom: 20px"><span class="label label-info">修改时间</span>　<fmt:formatDate value="${scenic.updateTime}" pattern="YYYY年MM月dd日"/></h3>
                          <h3 style="margin-bottom: 15px"><span class="label label-success">景区介绍</span></h3>
                          <div class="alert alert-success" style="width: 1000px;height: auto">
                              <label style="color: black ;font-size: 20px">
                                 ${scenic.info}
                              </label>
                          </div>
                      </div>
                      <div class="col-md-6">
                          <div class="col-md-7">
                              <a href="#" class="thumbnail" style="margin-top: -20px">
                                  <img src="http://ozpf2dllf.bkt.clouddn.com/${scenic.photo}">
                              </a>
                          </div>
                      </div>
                  </div>
              </div>
          </section>
      </section>
      <!-- js -->
      <jsp:include page="include/js.jsp"/>

  <script>
      //knob
      $(function() {
        $(".knob").knob({
          'draw' : function () {
            $(this.i).val(this.cv + '%')
          }
        })
      });
      //carousel
      $(document).ready(function() {
          $("#owl-slider").owlCarousel({
              navigation : true,
              slideSpeed : 300,
              paginationSpeed : 400,
              singleItem : true

          });
      });
      //custom select box
      $(function(){
          $('select.styled').customSelect();
      });
  </script>

  </body>
</html>
