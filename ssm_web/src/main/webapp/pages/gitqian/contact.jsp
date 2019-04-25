<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/23
  Time: 18:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width,user-scalable=no, initial-scale=1">
    <title>天能物业管理</title>
    <link rel="stylesheet" href="css/index.css" type="text/css">
    <link rel="stylesheet" href="css/zym.css" type="text/css">

    <script type="text/javascript" src="js/jquery.js"></script>
    <script type="text/javascript" src="js/global.js"></script>
    <script type="text/javascript" src="js/hm.js"></script>
    <script type="text/javascript" src="js/script.js"></script>



</head>
<body>
<!--头部-->
<div class="top_bg" id="top_bg">
    <div class="top_gang">
        <div class="tou_zj">
            <div class="hy">
                <img src="images/tou_tb_03.png">
                <span>欢迎来到贵州天能物业管理有限公司</span>
            </div>
            <div class="soucang">
                <a href="#">设为首页&nbsp;</a>｜
                <a href="#">&nbsp;加入收藏</a>
            </div>
        </div>
    </div>
    <div class="top_main">
        <div class="top_logo">
            <a href='./'><img src="images/logo.png"></a>
        </div>
        <!--导航-->
        <div class="daohang">
            <div class="header_nav">
                <div class="main clearBoth">
                    <ul class="nav right">
                        <li class="narrow_wrap">
                            <a class="nav_btn" href="index.html">
                                网站首页
                                <b></b>
                            </a>
                        </li>
                        <li class="narrow_wrap">
                            <a class="nav_btn" href="about.html">
                                关于我们
                                <b></b>
                                <div></div>
                            </a>
                            <div class="service_nav hide_nav hide_nav_narrow none" style="opacity: 0;">
                                <ul>
                                    <li>
                                        <a href="#">公司简介</a>
                                    </li>
                                    <li>
                                        <a href="#">公司文化</a>
                                    </li>
                                    <li>
                                        <a href="#">领导致辞</a>
                                    </li>
                                    <li>
                                        <a href="#">服务理念</a>
                                    </li>
                                    <li>
                                        <a href="#">企业荣誉</a>
                                    </li>
                                </ul>
                            </div>
                        </li>
                        <li class="narrow_wrap">
                            <a class="nav_btn" href="products.html">
                                项目展示
                                <b></b>
                                <div></div>
                            </a>
                            <div class="service_nav hide_nav hide_nav_narrow none" style="opacity: 0;">
                                <ul>
                                    <li>
                                        <a href="#">经典案例</a>
                                    </li>
                                    <li>
                                        <a href="#">公司项目</a>
                                    </li>
                                </ul>
                            </div>
                        </li>
                        <li class="narrow_wrap">
                            <a class="nav_btn" href="news.html">
                                公司动态
                                <b></b>
                            </a>
                            <div class="about_us_nav hide_nav hide_nav_narrow none" style="opacity: 0;">
                                <ul>
                                    <li>
                                        <a href="#">公司新闻</a>
                                    </li>
                                    <li>
                                        <a href="#">行业新闻</a>
                                    </li>
                                    <li>
                                        <a href="#">公司大事记</a>
                                    </li>
                                </ul>
                            </div>
                        </li>
                        <li class="narrow_wrap">
                            <a class="nav_btn" href="javascript:;">
                                人才招聘
                                <b></b>
                            </a>
                        </li>
                        <li class="narrow_wrap">
                            <a class="nav_btn" href="contact.html">
                                联系我们
                                <b></b>
                            </a>
                            <div class="about_us_nav hide_nav hide_nav_narrow none" style="opacity: 0;">
                                <ul>
                                    <li>
                                        <a href="#">在线留言</a>
                                    </li>
                                    <li>
                                        <a href="#">联系我们</a>
                                    </li>
                                </ul>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>
<!--子页-->
<div class="ziye_bj">
    <div class="ziye_tu">
        <img src="images/lxwm_02.jpg">
    </div>
</div>
<!--lianxi我们-->
<div class="zy_gywm">
    <div class="ejdh">
        <div class="shang_g"></div>
        <div class="women">
            <div class="btmc">
                <h1>C</h1>
                <p>联系我们<span>ONTACT US</span></p>
            </div>
            <ul class="skb">
                <li style="background: #005bac; width: 25%;"></li>
                <li style="background: #ff8400; width: 20%;"></li>
                <li style="background: #d3d3d3; width: 55%;"></li>
            </ul>
        </div>
        <div class="zy_dh_lb">
            <ul>
                <li id="women"><img src="images/zy1_08.png"><a id="wenzidangq" href="#">联系我们</a></li>
                <li><img src="images/zy1_08_z.png"><a href="#">在线留言</a></li>
            </ul>
        </div>
    </div>
    <div class="touyin"></div>
    <div class="zynr_db">
        <div class="lujing">
            <h2>在线留言</h2>
            <p>您的位置：首页 > 在线留言</p>
        </div>
        <ul class="skb" style="margin-bottom: 20px;">
            <li style="background: #005bac; width: 12%;"></li>
            <li style="background: #ff8400; width: 15%;"></li>
            <li style="background: #d3d3d3; width: 73%;"></li>
        </ul>

        <!--内容-->
        <div class="gsjj_nr">
            <form action="#" method="get" class="messages">
                <div class="messlist">
                    <label>*姓名：</label>
                    <input type="text" placeholder="姓名" />
                    <div class="clears"></div>
                </div>
                <div class="messlist">
                    <label>*手机号：</label>
                    <input type="text" placeholder="手机号" />
                    <div class="clears"></div>
                </div>
                <div class="messlist textareas">
                    <label>*留言内容：</label>
                    <textarea placeholder="留言内容"></textarea>
                    <div class="clears"></div>
                </div>
                <div class="messsub">
                    <input type="submit" value="提交留言" style="background:#00a3eb;color:#fff;" />
                    <input type="reset" value="重填留言" />
                </div>
            </form>
        </div>
    </div>
</div>


<!--底部-->
<div class="dibu">
    <div class="dibu_jz">
        <div class="dibu_zuo">
            <p>联系地址：贵州省贵阳市市南路120号黔电发展楼6楼<br>
                电 话：0851-85594612   传 真：0851-85594612<br></p>
            <ul>
                <li><span>分享到：</span></li>
                <li><a href="http://connect.qq.com/widget/shareqq/index.html?url=file%3A%2F%2F%2FC%3A%2FUsers%2Fadmin%2FDesktop%2F%25E6%25BD%2598%25E4%25B8%25AD%25E5%2585%25A8%2F%25E7%25BD%2591%25E7%25AB%2599%2Fgztnwy_qt%2Fnewlist.html%230-sqq-1-12217-9737f6f9e09dfaf5d3fd14d775bfee85&title=%E5%A4%A9%E8%83%BD%E7%89%A9%E4%B8%9A%E7%AE%A1%E7%90%86&desc=&summary=&site=baidu" target="_black"><img src="images/dibu_06.png"></a></li>
                <li><a href="http://service.weibo.com/share/share.php" target="_black"><img src="images/dibu_08.png"></a></li>
                <li><a href="http://widget.renren.com/dialog/share?resourceUrl=file%3A%2F%2F%2FC%3A%2FUsers%2Fadmin%2FDesktop%2F%25E6%25BD%2598%25E4%25B8%25AD%25E5%2585%25A8%2F%25E7%25BD%2591%25E7%25AB%2599%2Fgztnwy_qt%2Fnewlist.html%230-renren-1-63647-98fde57bb3d39343db0f272b38411f3e&srcUrl=file%3A%2F%2F%2FC%3A%2FUsers%2Fadmin%2FDesktop%2F%25E6%25BD%2598%25E4%25B8%25AD%25E5%2585%25A8%2F%25E7%25BD%2591%25E7%25AB%2599%2Fgztnwy_qt%2Fnewlist.html%230-renren-1-63647-98fde57bb3d39343db0f272b38411f3e&title=%E5%A4%A9%E8%83%BD%E7%89%A9%E4%B8%9A%E7%AE%A1%E7%90%86&description=" target="_black"><img src="images/dibu_10.png"></a></li>
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
            <img class="dibu_logo" src="images/dibu_03.png">
        </div>
    </div>
</div>
<div class="dibu_1">
    <p>版权所有 贵州天能物业管理有限公司 黔ICP备10001741号<br>
        技术支持：WangID 驰通网络</p>
</div>


</body>
</html>
