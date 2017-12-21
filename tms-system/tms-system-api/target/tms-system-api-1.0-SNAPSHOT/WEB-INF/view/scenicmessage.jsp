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
                <div class="col-md-3"></div>
                <div class="col-md-6">
                    <p class="lead" style="display: inline-block">景区资料填写</p>
                    <div id="picker"  style="float: right"><i class="fa fa-file-excel-o"></i> 上传景区资格证图片</div>

                    <form class="layui-form layui-form-pane" id="scenicForm" method="post" action="/system/scenic/add">
                        <div class="layui-form-item" pane>
                            <label class="layui-form-label">景区名称</label>
                            <div class="layui-input-block">
                                <input type="text" name="name" required lay-verify="required" autocomplete="off" class="layui-input">
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
                        <div class="layui-form-item" pane>
                            <label class="layui-form-label">景区所在地</label>
                            <div class="layui-input-block">
                                <input type="text" name="address" required lay-verify="required" autocomplete="off" class="layui-input">
                            </div>
                        </div>
                        <div class="layui-form-item" pane>
                            <label class="layui-form-label">景区经理</label>
                            <div class="layui-input-block">
                                <input type="text" name="manager" required lay-verify="required" autocomplete="off" class="layui-input">
                            </div>
                        </div>
                        <div class="layui-form-item" pane>
                            <label class="layui-form-label">联系电话</label>
                            <div class="layui-input-block">
                                <input type="text" name="phone" required lay-verify="required" autocomplete="off" class="layui-input">
                            </div>
                        </div>
                        <div class="layui-form-item" pane>
                            <label class="layui-form-label">经度</label>
                            <div class="layui-input-block">
                                <input type="text" name="longitude" required lay-verify="required" autocomplete="off" class="layui-input">
                            </div>
                        </div>
                        <div class="layui-form-item" pane>
                            <label class="layui-form-label">纬度</label>
                            <div class="layui-input-block">
                                <input type="text" name="latitude" required lay-verify="required" autocomplete="off" class="layui-input">
                            </div>
                        </div>
                        <textarea name="info" required lay-verify="required" placeholder="请输入景区介绍" class="layui-textarea"></textarea>
                        <input type="text" id="photo" name="photo" style="display: none">
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
    </section>
</section>
<!-- js -->
<jsp:include page="include/js.jsp"/>
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
            var fileName = data.key;
            $("#photo").attr("value",fileName);
        });
    })()
</script>

</body>
</html>
