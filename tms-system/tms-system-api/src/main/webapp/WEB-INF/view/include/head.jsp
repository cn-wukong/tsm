<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<header class="header dark-bg">
    <div class="toggle-nav">
        <div class="icon-reorder tooltips" data-original-title="Toggle Navigation" data-placement="bottom"></div>
    </div>

    <!--logo start-->
    <a href="index.html" class="logo">TSM <span class="lite">系统管理</span></a>
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
                            <span class="subject">
                                    <span class="from">小李子</span>
                                    <span class="time">1 分钟</span>
                            </span>
                            <span class="message">
                            我真的很喜欢这个管理面板。
                            </span>
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