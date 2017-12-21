<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Creative - Bootstrap 3 Responsive Admin Template">
    <meta name="author" content="GeeksLabs">
    <meta name="keyword" content="Creative, Dashboard, Admin, Template, Theme, Bootstrap, Responsive, Retina, Minimal">
    <link rel="shortcut icon" href="img/favicon.png">

    <title>旅游局管理</title>

    <!-- Bootstrap CSS -->    
    <link href="/static/css/bootstrap.min.css" rel="stylesheet">
    <!-- bootstrap theme -->
    <link href="/static/css/bootstrap-theme.css" rel="stylesheet">
    <!--external css-->
    <!-- font icon -->
    <link href="/static/css/elegant-icons-style.css" rel="stylesheet" />
    <link href="/static/css/font-awesome.min.css" rel="stylesheet" />
    <!-- full calendar css-->
    <link href="/static/assets/fullcalendar/fullcalendar/bootstrap-fullcalendar.css" rel="stylesheet" />
	<link href="/static/assets/fullcalendar/fullcalendar/fullcalendar.css" rel="stylesheet" />
    <!-- easy pie chart-->
    <link href="/static/assets/jquery-easy-pie-chart/jquery.easy-pie-chart.css" rel="stylesheet" type="text/css" media="screen"/>
    <!-- owl carousel -->
    <link rel="stylesheet" href="/static/css/owl.carousel.css" type="text/css">
    <link href="/static/css/jquery-jvectormap-1.2.2.css" rel="stylesheet">
    <!-- Custom styles -->
	<link rel="stylesheet" href="/static/css/fullcalendar.css">
	<link href="/static/css/widgets.css" rel="stylesheet">
    <link href="/static/css/style.css" rel="stylesheet">
    <link href="/static/css/style-responsive.css" rel="stylesheet" />
	<link href="/static/css/xcharts.min.css" rel=" stylesheet">
	<link href="/static/css/jquery-ui-1.10.4.min.css" rel="stylesheet">
    <!-- HTML5 shim and Respond.js IE8 support of HTML5 -->
    <!--[if lt IE 9]>
      <script src="/static/js/html5shiv.js"></script>
      <script src="/static/js/respond.min.js"></script>
      <script src="/static/js/lte-ie7.js"></script>
    <![endif]-->
      <style type="text/css">
          #maps{
              margin-top: 0px;
              caret-color:#7878f8;
          }
      </style>
  </head>

  <body>
  <!-- container section start -->
  <section id="container" class="">
     
      
      <header class="header dark-bg">
            <div class="toggle-nav">
                <div class="icon-reorder tooltips" data-original-title="Toggle Navigation" data-placement="bottom"></div>
            </div>

            <!--logo start-->
            <a href="index.html" class="logo">TSM <span class="lite">工作站</span></a>
            <!--logo end-->


            <div class="top-nav notification-row">                
                <!-- notificatoin dropdown start-->
                <ul class="nav pull-right top-menu">
                    
                    <!-- inbox notificatoin start-->
                    <li id="mail_notificatoin_bar" class="dropdown">
                        <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                            <i class="icon-envelope-l"></i>
                            <span class="badge bg-important">1</span>
                        </a>
                        <ul class="dropdown-menu extended inbox">
                            <div class="notify-arrow notify-arrow-blue"></div>
                            <li>
                                <p class="blue">You have 1 new messages</p>
                            </li>
                            <li>
                                <a href="#">
                                    <span class="photo"><img alt="avatar" src="/static/img/avatar-mini.jpg"></span>
                                    <span class="from">小李子</span>
                                    <span class="time">1 分钟</span>
                                    <span class="messagge">我真的很喜欢这个管理面板</span>
                                </a>
                            </li>
                            <li>
                                <a href="#">查看所有邮件</a>
                            </li>
                        </ul>
                    </li>
                    <!-- inbox notificatoin end -->

                    <!-- alert notification start-->
                    <li id="alert_notificatoin_bar" class="dropdown">
                        <a data-toggle="dropdown" class="dropdown-toggle" href="#">

                            <i class="icon-bell-l"></i>
                            <span class="badge bg-important">1</span>
                        </a>
                        <ul class="dropdown-menu extended notification">
                            <div class="notify-arrow notify-arrow-blue"></div>
                            <li>
                                <p class="blue">您有一条提醒</p>
                            </li>
                            <li>
                                <a href="#">
                                    <span class="label label-primary"><i class="icon_profile"></i></span> 
                                    新消息
                                    <span class="small italic pull-right">5 mins</span>
                                </a>
                            </li>
                            <li>
                                <a href="#">查看所有通知</a>
                            </li>
                        </ul>
                    </li>
                    <!-- alert notification end-->
                    <!-- user login dropdown start-->
                    <li class="dropdown">
                        <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                            <span class="profile-ava">
                                <img alt="" src="/static/img/avatar1_small.jpg">
                            </span>
                            <span class="username">Hello Word</span>
                            <b class="caret"></b>
                        </a>
                      <ul class="dropdown-menu extended logout">
                            <div class="log-arrow-up"></div>
                            <li class="eborder-top">
                                <a href="#"><i class="icon_profile"></i>我的信息</a>
                            </li>
                            <li>
                                <a href="#"><i class="icon_mail_alt"></i>收件箱</a>
                            </li>
                           
                            <li>
                                <a href="login.html"><i class="icon_key_alt"></i>修改密码</a>
                            </li>
                            <li>
                                <a href="documentation.html"><i class="icon_key_alt"></i>锁定账户</a>
                            </li>
                            <li>
                                <a href="documentation.html"><i class="icon_key_alt"></i> 安全退出</a>
                            </li>
                        </ul>
                    </li>
                    <!-- user login dropdown end -->
                </ul>
                <!-- notificatoin dropdown end-->
            </div>
      </header>      
      <!--header end-->


      <!--sidebar start-->
      <aside>
          <div id="sidebar"  class="nav-collapse ">
              <!-- sidebar menu start-->
              <ul class="sidebar-menu">                
                  <li class="active">
                      <a class="" href="/home">
                          <i class="icon_house_alt"></i>
                          <span>主页</span>
                      </a>
                  </li>

                  <li class="sub-menu">
                      <a href="javascript:;" class="">
                          <i class="icon_document_alt"></i>
                          <span>年票入库</span>
                          <span class="menu-arrow arrow_carrot-right"></span>
                      </a>
                      <ul class="sub">
                          <li><a class="" href="/card/save">新增年票</a></li>
                          <li><a class="" href="/card/not/down/">未下发年票</a></li>
                          <li><a class="" href="/card/already/down">已下发年票</a></li>

                      </ul>
                  </li>
                  <li class="sub-menu">
                      <a class="" href="/card/grant">
                          <i class="icon_desktop"></i>
                          <span>年票下发</span>
                      </a>
                     
                  </li>
                  <li>
                      <a class="" href="/card/destory">
                          <i class="icon_genius"></i>
                          <span>年票作废</span>
                      </a>
                  </li>
                   <li>
                      <a class="" href="/card/count">
                        <i class="icon_piechart"></i>
                       <span>年票盘点统计</span>
                      </a>
                  </li>
              </ul>
              <!-- sidebar menu end-->

          </div>
      </aside>
      <section id="main-content">

          <section class="wrapper">
              <div class="row">

                  <div class="panel panel-default" id="maps">
                      <!-- <div class="panel-heading">
                          <h2><i class="fa fa-map-marker red"></i><strong>Countries</strong></h2>
                          <div class="panel-actions">
                              <a href="index.html#" class="btn-setting"><i class="fa fa-rotate-right"></i></a>
                              <a href="index.html#" class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
                              <a href="index.html#" class="btn-close"><i class="fa fa-times"></i></a>
                          </div>
                      </div> -->
                      <div class="panel-body-map">
                          <div id="map" style="height:530px;"></div>
                      </div>

                  </div>


              </div>
          </section>
      </section>
      <!--main content end-->
  </section>
  <!-- container section start -->

    <!-- javascripts -->
    <script src="/static/js/jquery.js"></script>
	<script src="/static/js/jquery-ui-1.10.4.min.js"></script>
    <script src="/static/js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript" src="/static/js/jquery-ui-1.9.2.custom.min.js"></script>
    <!-- bootstrap -->
    <script src="/static/js/bootstrap.min.js"></script>
    <!-- nice scroll -->
    <script src="/static/js/jquery.scrollTo.min.js"></script>
    <script src="/static/js/jquery.nicescroll.js" type="text/javascript"></script>
    <!-- charts scripts -->
    <script src="/static/assets/jquery-knob/js/jquery.knob.js"></script>
    <script src="/static/js/jquery.sparkline.js" type="text/javascript"></script>
    <script src="/static/assets/jquery-easy-pie-chart/jquery.easy-pie-chart.js"></script>
    <script src="/static/js/owl.carousel.js" ></script>
    <!-- jQuery full calendar -->
    <<script src="/static/js/fullcalendar.min.js"></script> <!-- Full Google Calendar - Calendar -->
	<script src="/static/assets/fullcalendar/fullcalendar/fullcalendar.js"></script>
    <!--script for this page only-->
    <script src="/static/js/calendar-custom.js"></script>
	<script src="/static/js/jquery.rateit.min.js"></script>
    <!-- custom select -->
    <script src="/static/js/jquery.customSelect.min.js" ></script>
	<script src="/static/assets/chart-master/Chart.js"></script>

    <!--custome script for all page-->
    <script src="/static/js/scripts.js"></script>
    <!-- custom script for this page-->
    <script src="/static/js/sparkline-chart.js"></script>
    <script src="/static/js/easy-pie-chart.js"></script>
    <script src="/static/js/jquery-jvectormap-1.2.2.min.js"></script>
    <script src="/static/js/jquery-jvectormap-world-mill-en.js"></script>
	<script src="/static/js/xcharts.min.js"></script>
	<script src="/static/js/jquery.autosize.min.js"></script>
	<script src="/static/js/jquery.placeholder.min.js"></script>
	<script src="/static/js/gdp-data.js"></script>
	<script src="/static/js/morris.min.js"></script>
	<script src="/static/js/sparklines.js"></script>
	<script src="/static/js/charts.js"></script>
	<script src="/static/js/jquery.slimscroll.min.js"></script>
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

      $(function(){
          $('#map').vectorMap({
              map: 'world_mill_en',
              series: {
                  regions: [{
                      values: gdpData,
                      scale: ['#000', '#000'],
                      normalizeFunction: 'polynomial'
                  }]
              },
              backgroundColor: '#7878f8',
              onLabelShow: function(e, el, code){
                  el.html(el.html()+' (GDP - '+gdpData[code]+')');
              }
          });
      });

  </script>

  </body>
</html>
