<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019\4\26 0026
  Time: 9:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <jsp:include page="toubu.jsp"></jsp:include>
    <!--/. NAV TOP  -->
    <%--导航栏--%>
    <jsp:include page="daohanglan.jsp"></jsp:include>
    <div id="page-wrapper" >
        <div id="page-inner">
            <div class="row">
                <div class="col-md-12">
                    <h1 class="page-header">
                        Forms Page <small></small>
                    </h1>
                </div>
            </div>
            <!-- /. ROW  -->
            <div class="row" style="width: 600px; display: inline">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            修改房屋详情
                        </div>
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-lg-6">
                                                  <%--${pageContext.request.contextPath}/nt/htnewstypeupda.do?ntid=${newsType.ntid}--%>
                                    <form action="${pageContext.request.contextPath}/ower/addower.do?" method="post">

                                        <div >
                                            <label>业主姓名</label>
                                            <input class="form-control" placeholder="业主姓名"  name="olname" value="游队长">
                                        </div>
                                        <div>
                                            <label>业主账号</label>
                                            <input class="form-control" placeholder="业主账号" name="olaccount" value="ydz">
                                        </div>
                                       <div >
                                           <label>登录密码</label>
                                           <input class="form-control" placeholder="登录密码" name="olpasswd" value="123123">
                                        </div>
                                        <div >
                                            <label>业主身份证</label>
                                            <input class="form-control"  placeholder="业主身份证" name="powerid"  value="46545416549874">
                                        </div>
                                        <div >
                                            <label>业主手机号</label>
                                            <input class="form-control" placeholder="业主手机号" name="olphone"  value="1954642445">
                                        </div>
                                        <br>
                                            <div>
                                            <button type="submit" class="btn btn-success"><i class="fa fa-save "></i> 确定增加</button>
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



</body>
</html>

