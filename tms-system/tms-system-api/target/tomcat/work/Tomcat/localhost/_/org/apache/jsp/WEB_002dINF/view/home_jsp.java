/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-12-15 08:57:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta name=\"description\" content=\"Creative - Bootstrap 3 Responsive Admin Template\">\r\n");
      out.write("    <meta name=\"author\" content=\"GeeksLabs\">\r\n");
      out.write("    <meta name=\"keyword\" content=\"Creative, Dashboard, Admin, Template, Theme, Bootstrap, Responsive, Retina, Minimal\">\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"/static/img/favicon.png\">\r\n");
      out.write("\r\n");
      out.write("    <title>TMS-综合管理系统</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap CSS -->    \r\n");
      out.write("    <link href=\"/static/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- bootstrap theme -->\r\n");
      out.write("    <link href=\"/static/css/bootstrap-theme.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!--external css-->\r\n");
      out.write("    <!-- font icon -->\r\n");
      out.write("    <link href=\"/static/css/elegant-icons-style.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <link href=\"/static/css/font-awesome.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <!-- full calendar css-->\r\n");
      out.write("    <link href=\"/static/assets/fullcalendar/fullcalendar/bootstrap-fullcalendar.css\" rel=\"stylesheet\" />\r\n");
      out.write("\t<link href=\"/static/assets/fullcalendar/fullcalendar/fullcalendar.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <!-- easy pie chart-->\r\n");
      out.write("    <link href=\"/static/assets/jquery-easy-pie-chart/jquery.easy-pie-chart.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\"/>\r\n");
      out.write("    <!-- owl carousel -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/static/css/owl.carousel.css\" type=\"text/css\">\r\n");
      out.write("    <!-- Custom styles -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"/static/css/fullcalendar.css\">\r\n");
      out.write("\t<link href=\"/static/css/widgets.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"/static/css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"/static/css/style-responsive.css\" rel=\"stylesheet\" />\r\n");
      out.write("\t<link href=\"/static/css/xcharts.min.css\" rel=\" stylesheet\">\r\n");
      out.write("\t<link href=\"/static/css/jquery-ui-1.10.4.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- HTML5 shim and Respond.js IE8 support of HTML5 -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"/static/js/html5shiv.js\"></script>\r\n");
      out.write("      <script src=\"/static/js/respond.min.js\"></script>\r\n");
      out.write("      <script src=\"/static/js/lte-ie7.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write("  <!-- container section start -->\r\n");
      out.write("  <section id=\"container\" class=\"\">\r\n");
      out.write("     \r\n");
      out.write("      \r\n");
      out.write("      <header class=\"header dark-bg\">\r\n");
      out.write("            <div class=\"toggle-nav\">\r\n");
      out.write("                <div class=\"icon-reorder tooltips\" data-original-title=\"Toggle Navigation\" data-placement=\"bottom\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!--logo start-->\r\n");
      out.write("            <a href=\"index.html\" class=\"logo\">TSM <span class=\"lite\">工作站</span></a>\r\n");
      out.write("            <!--logo end-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div class=\"top-nav notification-row\">                \r\n");
      out.write("                <!-- notificatoin dropdown start-->\r\n");
      out.write("                <ul class=\"nav pull-right top-menu\">\r\n");
      out.write("                    \r\n");
      out.write("                    <!-- inbox notificatoin start-->\r\n");
      out.write("                    <li id=\"mail_notificatoin_bar\" class=\"dropdown\">\r\n");
      out.write("                        <a data-toggle=\"dropdown\" class=\"dropdown-toggle\" href=\"#\">\r\n");
      out.write("                            <i class=\"icon-envelope-l\"></i>\r\n");
      out.write("                            <span class=\"badge bg-important\">1</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <ul class=\"dropdown-menu extended inbox\">\r\n");
      out.write("                            <div class=\"notify-arrow notify-arrow-blue\"></div>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <p class=\"blue\">You have 1 new messages</p>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"#\">\r\n");
      out.write("                                    <span class=\"photo\"><img alt=\"avatar\" src=\"static/img/avatar-mini.jpg\"></span>\r\n");
      out.write("                                    <span class=\"subject\">\r\n");
      out.write("                                    <span class=\"from\">小李子</span>\r\n");
      out.write("                                    <span class=\"time\">1 分钟</span>\r\n");
      out.write("                                    </span>\r\n");
      out.write("                                    <span class=\"message\">\r\n");
      out.write("                                       我真的很喜欢这个管理面板。\r\n");
      out.write("                                    </span>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"#\">查看所有邮件</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <!-- inbox notificatoin end -->\r\n");
      out.write("\r\n");
      out.write("                    <!-- alert notification start-->\r\n");
      out.write("                    <li id=\"alert_notificatoin_bar\" class=\"dropdown\">\r\n");
      out.write("                        <a data-toggle=\"dropdown\" class=\"dropdown-toggle\" href=\"#\">\r\n");
      out.write("\r\n");
      out.write("                            <i class=\"icon-bell-l\"></i>\r\n");
      out.write("                            <span class=\"badge bg-important\">1</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <ul class=\"dropdown-menu extended notification\">\r\n");
      out.write("                            <div class=\"notify-arrow notify-arrow-blue\"></div>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <p class=\"blue\">您有一条提醒</p>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"#\">\r\n");
      out.write("                                    <span class=\"label label-primary\"><i class=\"icon_profile\"></i></span> \r\n");
      out.write("                                    新消息\r\n");
      out.write("                                    <span class=\"small italic pull-right\">5 mins</span>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"#\">查看所有通知</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <!-- alert notification end-->\r\n");
      out.write("                    <!-- user login dropdown start-->\r\n");
      out.write("                    <li class=\"dropdown\">\r\n");
      out.write("                        <a data-toggle=\"dropdown\" class=\"dropdown-toggle\" href=\"#\">\r\n");
      out.write("                            <span class=\"profile-ava\">\r\n");
      out.write("                                <img alt=\"\" src=\"static/img/avatar1_small.jpg\">\r\n");
      out.write("                            </span>\r\n");
      out.write("                            <span class=\"username\">Hello Word</span>\r\n");
      out.write("                            <b class=\"caret\"></b>\r\n");
      out.write("                        </a>\r\n");
      out.write("                      <ul class=\"dropdown-menu extended logout\">\r\n");
      out.write("                            <div class=\"log-arrow-up\"></div>\r\n");
      out.write("                            <li class=\"eborder-top\">\r\n");
      out.write("                                <a href=\"#\"><i class=\"icon_profile\"></i>我的信息</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"#\"><i class=\"icon_mail_alt\"></i>收件箱</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                           \r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"login.html\"><i class=\"icon_key_alt\"></i>修改密码</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"documentation.html\"><i class=\"icon_key_alt\"></i>锁定账户</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"documentation.html\"><i class=\"icon_key_alt\"></i> 安全退出</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <!-- user login dropdown end -->\r\n");
      out.write("                </ul>\r\n");
      out.write("                <!-- notificatoin dropdown end-->\r\n");
      out.write("            </div>\r\n");
      out.write("      </header>      \r\n");
      out.write("      <!--header end-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      <!--sidebar start-->\r\n");
      out.write("      <aside>\r\n");
      out.write("          <div id=\"sidebar\"  class=\"nav-collapse \">\r\n");
      out.write("              <!-- sidebar menu start-->\r\n");
      out.write("              <ul class=\"sidebar-menu\">                \r\n");
      out.write("                  <li class=\"active\">\r\n");
      out.write("                      <a class=\"\" href=\"index.html\">\r\n");
      out.write("                          <i class=\"icon_house_alt\"></i>\r\n");
      out.write("                          <span>主页</span>\r\n");
      out.write("                      </a>\r\n");
      out.write("                  </li>\r\n");
      out.write("\r\n");
      out.write("                    <li class=\"sub-menu\">\r\n");
      out.write("                      <a class=\"\" href=\"/system/scenic\">\r\n");
      out.write("                          <i class=\"icon_document_alt\"></i>\r\n");
      out.write("                          <span>景区信息</span>\r\n");
      out.write("                      </a>\r\n");
      out.write("                  </li>    \r\n");
      out.write("\r\n");
      out.write("                  <li class=\"sub-menu\">\r\n");
      out.write("                      <a class=\"\" href=\"/card/grant\">\r\n");
      out.write("                          <i class=\"icon_desktop\"></i>\r\n");
      out.write("                          <span>售票点信息</span>\r\n");
      out.write("                      </a>\r\n");
      out.write("                     \r\n");
      out.write("                  </li>\r\n");
      out.write("                  <li>\r\n");
      out.write("                      <a class=\"\" href=\"/card/destory\">\r\n");
      out.write("                          <i class=\"icon_genius\"></i>\r\n");
      out.write("                          <span>电子公告</span>\r\n");
      out.write("                      </a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                   <li>\r\n");
      out.write("                      <a class=\"\" href=\"/card/count\">\r\n");
      out.write("                        <i class=\"glyphicon glyphicon-bell\"></i>\r\n");
      out.write("                       <span>消息中心</span>\r\n");
      out.write("                      </a>\r\n");
      out.write("                   </li>\r\n");
      out.write("                   <li>\r\n");
      out.write("                    <a class=\"\" href=\"/card/count\">\r\n");
      out.write("                     <i class=\"glyphicon glyphicon-folder-open\"></i>\r\n");
      out.write("                     <span>规章制度</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                 </li>\r\n");
      out.write("                  <li>\r\n");
      out.write("                        <a class=\"\" href=\"/card/count\">\r\n");
      out.write("                        <i class=\"glyphicon glyphicon-pencil\"></i>\r\n");
      out.write("                        <span>待办工作</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <li>\r\n");
      out.write("                    <a class=\"\" href=\"/card/count\">\r\n");
      out.write("                        <span class=\"glyphicon glyphicon-user\"></span>\r\n");
      out.write("                    <span>用户管理</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a class=\"\" href=\"/card/count\">\r\n");
      out.write("                            <i class=\"glyphicon glyphicon-wrench\"></i>\r\n");
      out.write("                        <span>权限设置</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a class=\"\" href=\"/card/count\">\r\n");
      out.write("                            <i class=\"glyphicon glyphicon-folder-open\"></i>\r\n");
      out.write("                        <span>日志管理</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a class=\"\" href=\"/card/count\">\r\n");
      out.write("                        <span>系统备份</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                  <li>\r\n");
      out.write("                    <a class=\"\" href=\"/card/count\">\r\n");
      out.write("                      <i class=\"icon_piechart\"></i>\r\n");
      out.write("                     <span>分类统计信息</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("              </ul>\r\n");
      out.write("              <!-- sidebar menu end-->\r\n");
      out.write("\r\n");
      out.write("          </div>\r\n");
      out.write("      </aside>\r\n");
      out.write("          </section>\r\n");
      out.write("      </section>\r\n");
      out.write("      <!--main content end-->\r\n");
      out.write("  </section>\r\n");
      out.write("  <!-- container section start -->\r\n");
      out.write("\r\n");
      out.write("    <!-- javascripts -->\r\n");
      out.write("    <script src=\"/static/js/jquery.js\"></script>\r\n");
      out.write("\t<script src=\"/static/js/jquery-ui-1.10.4.min.js\"></script>\r\n");
      out.write("    <script src=\"/static/js/jquery-1.8.3.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"static/js/jquery-ui-1.9.2.custom.min.js\"></script>\r\n");
      out.write("    <!-- bootstrap -->\r\n");
      out.write("    <script src=\"/static/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <!-- nice scroll -->\r\n");
      out.write("    <script src=\"/static/js/jquery.scrollTo.min.js\"></script>\r\n");
      out.write("    <script src=\"/static/js/jquery.nicescroll.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <!-- charts scripts -->\r\n");
      out.write("    <script src=\"/static/assets/jquery-knob/js/jquery.knob.js\"></script>\r\n");
      out.write("    <script src=\"/static/js/jquery.sparkline.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <script src=\"/static/assets/jquery-easy-pie-chart/jquery.easy-pie-chart.js\"></script>\r\n");
      out.write("    <script src=\"/static/js/owl.carousel.js\" ></script>\r\n");
      out.write("    <!-- jQuery full calendar -->\r\n");
      out.write("    <<script src=\"/static/js/fullcalendar.min.js\"></script> <!-- Full Google Calendar - Calendar -->\r\n");
      out.write("\t<script src=\"/static/assets/fullcalendar/fullcalendar/fullcalendar.js\"></script>\r\n");
      out.write("    <!--script for this page only-->\r\n");
      out.write("    <script src=\"/static/js/calendar-custom.js\"></script>\r\n");
      out.write("\t<script src=\"/static/js/jquery.rateit.min.js\"></script>\r\n");
      out.write("    <!-- custom select -->\r\n");
      out.write("    <script src=\"/static/js/jquery.customSelect.min.js\" ></script>\r\n");
      out.write("\t<script src=\"/static/assets/chart-master/Chart.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!--custome script for all page-->\r\n");
      out.write("    <script src=\"/static/js/scripts.js\"></script>\r\n");
      out.write("    <!-- custom script for this page-->\r\n");
      out.write("    <script src=\"/static/js/sparkline-chart.js\"></script>\r\n");
      out.write("    <script src=\"/static/js/easy-pie-chart.js\"></script>\r\n");
      out.write("\t<script src=\"/static/js/xcharts.min.js\"></script>\r\n");
      out.write("\t<script src=\"/static/js/jquery.autosize.min.js\"></script>\r\n");
      out.write("\t<script src=\"/static/js/jquery.placeholder.min.js\"></script>\r\n");
      out.write("\t<script src=\"/static/js/gdp-data.js\"></script>\r\n");
      out.write("\t<script src=\"/static/js/morris.min.js\"></script>\r\n");
      out.write("\t<script src=\"/static/js/sparklines.js\"></script>\r\n");
      out.write("\t<script src=\"/static/js/charts.js\"></script>\r\n");
      out.write("\t<script src=\"/static/js/jquery.slimscroll.min.js\"></script>\r\n");
      out.write("  <script>\r\n");
      out.write("\r\n");
      out.write("      //knob\r\n");
      out.write("      $(function() {\r\n");
      out.write("        $(\".knob\").knob({\r\n");
      out.write("          'draw' : function () {\r\n");
      out.write("            $(this.i).val(this.cv + '%')\r\n");
      out.write("          }\r\n");
      out.write("        })\r\n");
      out.write("      });\r\n");
      out.write("\r\n");
      out.write("      //carousel\r\n");
      out.write("      $(document).ready(function() {\r\n");
      out.write("          $(\"#owl-slider\").owlCarousel({\r\n");
      out.write("              navigation : true,\r\n");
      out.write("              slideSpeed : 300,\r\n");
      out.write("              paginationSpeed : 400,\r\n");
      out.write("              singleItem : true\r\n");
      out.write("\r\n");
      out.write("          });\r\n");
      out.write("      });\r\n");
      out.write("\r\n");
      out.write("      //custom select box\r\n");
      out.write("\r\n");
      out.write("      $(function(){\r\n");
      out.write("          $('select.styled').customSelect();\r\n");
      out.write("      });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  </script>\r\n");
      out.write("\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
