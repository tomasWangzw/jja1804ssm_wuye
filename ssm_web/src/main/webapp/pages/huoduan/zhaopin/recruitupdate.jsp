<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/28 0028
  Time: 上午 9:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title></title>
    <!-- Bootstrap Styles-->

    <link href="${pageContext.request.contextPath}/pages/huoduan/assets/css/bootstrap.css" rel="stylesheet" />
    <!-- FontAwesome Styles-->
    <link href="${pageContext.request.contextPath}/pages/huoduan/assets/css/font-awesome.css" rel="stylesheet" />
    <!-- Custom Styles-->
    <link href="${pageContext.request.contextPath}/pages/huoduan/assets/css/custom-styles.css" rel="stylesheet" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/pages/huoduan/plugins/datepicker3.css">
    <!-- Google Fonts-->
    <link href='https://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
</head>
<body>
<div id="wrapper">
    <%--头部--%>
    <jsp:include page="../toubu.jsp"></jsp:include>
    <!--/. NAV TOP  -->
    <%--导航栏--%>
    <jsp:include page="../daohanglan.jsp"></jsp:include>
    <!-- /. NAV SIDE  -->
    <div id="page-wrapper" >
        <div id="page-inner">
            <div class="row">
                <div class="col-md-12">
                    <h1 class="page-header">
                        <small></small>
                    </h1>
                </div>
            </div>
            <!-- /. ROW  -->
            <div class="row" style="width: 600px;">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            增加一条讯息
                        </div>
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-lg-6">
                                    <form action="${pageContext.request.contextPath}/recruit/reupdate.do" method="post">
                                        <div  >
                                            <label>公司名称</label>
                                            <input class="form-control" placeholder="" value="${recruit.companyname}" name="companyname" >
                                        </div>
                                        <div  >
                                            <label>岗位名称</label>
                                            <input class="form-control" placeholder="" value="${recruit.postname}" name="postname" >
                                        </div>
                                        <div class="form-group">
                                            <label>招聘要求</label>
                                            <textarea class="form-control" rows="5"  name="recruitdes">${recruit.recruitdes}</textarea>
                                        </div>
                                        <div class="form-group">
                                            <label>岗位职责</label>
                                            <textarea class="form-control" rows="5"  name="duty">${recruit.duty}</textarea>
                                        </div>
                                        <div>
                                            <label>招聘人数</label>
                                            <input class="form-control" placeholder="" value="${recruit.recruitnum}" name="recruitnum">
                                        </div>
                                        <div class="form-group">
                                            <label>薪资待遇</label>
                                            <textarea class="form-control" rows="3"  name="salary">${recruit.salary}</textarea>
                                        </div>
                                        <div>
                                            <label>截止时间</label>
                                            <input class="form-control" placeholder="" id="date" value="<fmt:formatDate value='${recruit.recruitend}' pattern='yyyy-MM-dd'/>" name="recruitend">
                                        </div>
                                        <div  >
                                            <label>联系电话</label>
                                            <input class="form-control" placeholder="" value="${recruit.recruitnumber}" name="recruitnumber" >
                                        </div>
                                        <div  >
                                            <label>地址</label>
                                            <input class="form-control" placeholder="联系方式" value="${recruit.address}" name="address" >
                                        </div>
                                        <br>
                                        <div>

                                            <button type="submit" class="btn btn-success"><i class=""></i> 确认增加 </button>

                                            <button type="button" class="btn btn-primary" onclick="history.back(-1);"><i class="fa fa-reply "></i>返回</button>

                                        </div>



                                    </form>
                                </div>

                                <!-- /.col-lg-6 (nested) -->
                            </div>
                            <!-- /.row (nested) -->
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /. PAGE INNER  -->
        </div>
        <!-- /. PAGE WRAPPER  -->
    </div>
    <!-- /. WRAPPER  -->
    <!-- JS Scripts-->
    <!-- jQuery Js -->
    <script src="${pageContext.request.contextPath}/pages/huoduan/assets/js/jquery-1.10.2.js"></script>
    <!-- Bootstrap Js -->
    <script src="${pageContext.request.contextPath}/pages/huoduan/assets/js/bootstrap.min.js"></script>
    <!-- Metis Menu Js -->
    <script src="${pageContext.request.contextPath}/pages/huoduan/assets/js/jquery.metisMenu.js"></script>
    <!-- Custom Js -->
    <script src="${pageContext.request.contextPath}/pages/huoduan/assets/js/custom-scripts.js"></script>
    <script src="${pageContext.request.contextPath}/pages/huoduan/assets/bootstrap-datetimepicker/bootstrap-datetimepicker.js"></script>
    <script src="${pageContext.request.contextPath}/pages/huoduan/assets/bootstrap-datetimepicker/locales/bootstrap-datetimepicker.zh-CN.js"></script>

    <script src="${pageContext.request.contextPath}/pages/huoduan/assets/datatables/jquery.dataTables.min.js"></script>
    <script src="${pageContext.request.contextPath}/pages/huoduan/assets/datatables/dataTables.bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/pages/huoduan/plugins/jquery-2.2.3.min.js"></script>
    <script src="${pageContext.request.contextPath}/pages/huoduan/plugins/bootstrap-datepicker.js"></script>
    <script>
        $(document).ready(function() {
            $('#dateid').datepicker({
                format : "yyyy-mm-dd",
                autoclose: true,
                language: 'zh-CN'
            });
        });
    </script>
    <script>
        $(document).ready(function() {
            $('#date').datepicker({
                format : "yyyy-mm-dd",
                autoclose: true,
                language: 'zh-CN'
            });
        });
    </script>



</body>
</html>
