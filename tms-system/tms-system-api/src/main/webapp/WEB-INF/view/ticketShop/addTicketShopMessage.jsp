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
    <link rel="stylesheet" type="text/css" href="/static/webuploader/webuploader.css">
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
                <div class="col-md-3"></div>
                <div class="col-md-6">
                    <div style="margin-top: 20px">
                        <p class="lead" style="display: inline-block">售票点资料填写</p>
                        <div id="picker"  style="float: right"><i class="fa fa-file-excel-o"></i> 上传售票点资格证图片</div>
                        <form class="layui-form layui-form-pane" id="scenicForm" method="post" action="/system/ticketShop/create">
                            <div class="layui-form-item" pane>
                                <label class="layui-form-label">售票点名称</label>
                                <div class="layui-input-block">
                                    <input type="text" name="name" required lay-verify="required" autocomplete="off" class="layui-input">
                                </div>
                            </div>
                            <div class="layui-form-item" pane>
                                <label class="layui-form-label">所在地</label>
                                <div class="layui-input-block">
                                    <input type="text" name="address" required lay-verify="required" autocomplete="off" class="layui-input">
                                </div>
                            </div>
                            <input type="text" id="photo" name="photo" hidden>
                            <div class="layui-form-item" style="float: right">
                                <div class="layui-input-block">
                                    <button class="layui-btn" lay-submit lay-filter="formDemo" style="margin-top: 10px;float: left" id="submitBtn">立即提交</button>
                                    <button type="reset" class="layui-btn layui-btn-primary" style="margin-top: 10px;float: left" >重置</button>
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
<!--引入JS-->
<script type="text/javascript" src="/static/webuploader/webuploader.js"></script>

<script>
    (function(){
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
        //获取qiniu上传图片的key
        uploader.on('uploadSuccess',function (file, data) {
            $("#photo").val(data.key);
        });
    })()
</script>

</body>
</html>
