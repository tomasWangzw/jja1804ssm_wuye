<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@include file="../../appcomm/basePath.jsp" %>
<html>
<head>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width,user-scalable=no, initial-scale=1">
        <title>房屋出租</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/pages/gitqian/css/index.css" type="text/css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/pages/gitqian/css/zym.css" type="text/css">

        <script type="text/javascript" src="${pageContext.request.contextPath}/pages/gitqian/js/jquery.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/pages/gitqian/js/global.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/pages/gitqian/js/hm.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/pages/gitqian/js/script.js"></script>


    </head>
<body>


<jsp:include page="toubu.jsp"></jsp:include>
<!--子页-->
<div class="ziye_bj">
    <div class="ziye_tu">
        <img src="${pageContext.request.contextPath}/pages/gitqian/images/zy1_02.jpg">
    </div>
</div>
<!--关于我们-->
<div class="zy_gywm">
    <div class="ejdh" style="height: 1050px;">
        <div class="shang_g"></div>
        <div class="women">
            <div class="btmc">
                <h1>N</h1>
                <p>公司动态<span>ews</span></p>
            </div>
            <ul class="skb">
                <li style="background: #005bac; width: 25%;"></li>
                <li style="background: #ff8400; width: 20%;"></li>
                <li style="background: #d3d3d3; width: 55%;"></li>
            </ul>
        </div>
        <div class="zy_dh_lb">
            <ul>

                <li id="women"><img src="${pageContext.request.contextPath}/pages/gitqian/images/zy1_08.png"><a
                        id="wenzidangq" href="ohtc/qtcxloan.do?pageNum=1">外来车辆</a></li>
            </ul>
        </div>
    </div>
    <div class="touyin"></div>
    <div class="zynr_db" style="height: 1000px;">
        <div class="lujing">
            <h2>房屋信息</h2>
            <p>您的位置：首页 > 外来人员 > 外来车辆</p>
        </div>
        <ul class="skb" style="margin-bottom: 20px;">
            <li style="background: #005bac; width: 12%;"></li>
            <li style="background: #ff8400; width: 15%;"></li>
            <li style="background: #d3d3d3; width: 73%;"></li>
        </ul>

        <!--内容-->
        <div class="gsjj_nr">

            <ul>

                <li>

                    <form action="${pageContext.request.contextPath}/searchcar.do" method="post">
                        <label>查询停车费：</label>
                        <input type="text" value="请输入车牌号" name="Parkingcards"
                               style="width:250px; margin:10px;margin-left:20px; line-height:17px;display:inline-block"/>
                        <input type="submit" value="搜索"/>
                    </form>

                </li>
            </ul>
            <br><br>



            <form action="${pageContext.request.contextPath}/jine.do?parkingid=${parkingCarinfos.parkingid}" method="post">
                <div>
                    <label>进入时间:</label>
                    <input placeholder=""
                           name="parkingintime"
                           style=" width:250px; margin:10px;margin-left:20px; line-height:17px;display:inline-block"
                           readonly
                           value="${parkingCarinfos.parkingintime}">
                </div>
                <div>
                    <label>出去时间:</label>
                    <input placeholder=""
                           style=" width:250px; margin:10px;margin-left:20px; line-height:17px;display:inline-block"
                           name="parkingouttime"
                           readonly
                           value="${parkingCarinfos.parkingouttime}"><br/>
                </div>

                <div>
                    <label>支付方式</label>
                    <select name="paymentmethod" class="form-control" style=" width:250px; margin:10px;margin-left:20px;  line-height:17px;display:inline-block">
                        <option value="1">支付宝</option>
                        <option value="2">微信</option>
                        <option value="3">现金</option>
                    </select>
                    <input type="submit" value="缴费"/>

                    <%--<input--%>
                            <%--style=" width:250px; margin:10px;margin-left:20px;  line-height:17px;display:inline-block"--%>
                            <%--name="nctitle" readonly--%>
                            <%--value="<c:if test="${parkingCarinfos.paymentmethod eq 1}">支付宝</c:if><c:if test="${parkingCarinfos.paymentmethod eq 2}">微信</c:if><c:if test="${parkingCarinfos.paymentmethod eq 3}">现金</c:if>--%>
                       <%--"><br/>--%>
                </div>
            </form>
            <div>
                <label> 总 金 额:</label>
                <input
                        style=" width:250px; margin:10px;margin-left:20px; line-height:17px;display:inline-block"
                        readonly value= "${money}" name="nctime">
            </div>
            <div>
                <label> 总时数:</label>
                <input
                        style=" width:250px; margin:10px;margin-left:20px; line-height:17px;display:inline-block"
                        readonly value= "${mm}">
            </div>
            <br>

            <h3><c:if test="${money ne null}">
                <span style="color: red">缴费完毕，出入平安！！</span>
            </c:if></h3>
        </div>

    </div>

</div>


<!--底部-->
<div class="dibu">
    <div class="dibu_jz">
        <div class="dibu_zuo">
            <p>联系地址：贵州省贵阳市市南路120号黔电发展楼6楼<br>
                电 话：0851-85594612 传 真：0851-85594612<br></p>
            <ul>
                <li><span>分享到：</span></li>
                <li>
                    <a href="http://connect.qq.com/widget/shareqq/index.html?url=file%3A%2F%2F%2FC%3A%2FUsers%2Fadmin%2FDesktop%2F%25E6%25BD%2598%25E4%25B8%25AD%25E5%2585%25A8%2F%25E7%25BD%2591%25E7%25AB%2599%2Fgztnwy_qt%2Fnewlist.html%230-sqq-1-12217-9737f6f9e09dfaf5d3fd14d775bfee85&title=%E5%A4%A9%E8%83%BD%E7%89%A9%E4%B8%9A%E7%AE%A1%E7%90%86&desc=&summary=&site=baidu"
                       target="_black"><img
                            src="${pageContext.request.contextPath}/pages/gitqian/images/dibu_06.png"></a></li>
                <li><a href="http://service.weibo.com/share/share.php" target="_black"><img
                        src="${pageContext.request.contextPath}/pages/gitqian/images/dibu_08.png"></a></li>
                <li>
                    <a href="http://widget.renren.com/dialog/share?resourceUrl=file%3A%2F%2F%2FC%3A%2FUsers%2Fadmin%2FDesktop%2F%25E6%25BD%2598%25E4%25B8%25AD%25E5%2585%25A8%2F%25E7%25BD%2591%25E7%25AB%2599%2Fgztnwy_qt%2Fnewlist.html%230-renren-1-63647-98fde57bb3d39343db0f272b38411f3e&srcUrl=file%3A%2F%2F%2FC%3A%2FUsers%2Fadmin%2FDesktop%2F%25E6%25BD%2598%25E4%25B8%25AD%25E5%2585%25A8%2F%25E7%25BD%2591%25E7%25AB%2599%2Fgztnwy_qt%2Fnewlist.html%230-renren-1-63647-98fde57bb3d39343db0f272b38411f3e&title=%E5%A4%A9%E8%83%BD%E7%89%A9%E4%B8%9A%E7%AE%A1%E7%90%86&description="
                       target="_black"><img
                            src="${pageContext.request.contextPath}/pages/gitqian/images/dibu_10.png"></a></li>
            </ul>
        </div>
        <div class="dibu_you">
            <ul>
                <li><a href="#">公司简介&nbsp;&nbsp;</a>｜</li>
                <li><a href="#">企业文化&nbsp;&nbsp;</a>｜</li>
                <li><a href="#">人才招聘&nbsp;&nbsp;</a>｜</li>
                <li><a href="#">意见反馈&nbsp;&nbsp;</a>｜</li>
                <li><a href="#">联系我们</a></li>
            </ul>
            <img class="dibu_logo" src="${pageContext.request.contextPath}/pages/gitqian/images/dibu_03.png">
        </div>
    </div>
</div>
<div class="dibu_1">
    <p>版权所有 贵州天能物业管理有限公司 黔ICP备10001741号<br>
        技术支持：WangID 驰通网络</p>
</div>


</body>
</html>