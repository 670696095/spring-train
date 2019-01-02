<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <%@ include file="../frame/head.jsp"%>

</head>

<body class="sticky-header">

<section>
    <%@ include file="../frame/menu.jsp"%>


    <!-- 主体导航栏-->
    <div class="main-content" >

        <%@ include file="../frame/header.jsp"%>
        <!-- 内容导航栏-->
        <div class="page-heading">
            <h3>
                欢迎您：${admin.realName}&nbsp;&nbsp;&nbsp;&nbsp;在线人数:${online}
            </h3>

        </div>

        <!-- page heading end-->

        <!--body wrapper start-->

        <div class="wrapper">
            <div class="row">
                <div class="col-md-12">
                    <section class="panel">
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-sm-12">
                                    <section class="panel">
                                        <!-- <header class="panel-heading">
                                DataTables hidden row details example
                            </header> -->
                                        <div class="panel-body">
                                            <div class="adv-table">
                                                <h1>欢迎您进入管理系统</h1>
                                                <li>
                                                    &nbsp;如果在使用过程中有任何疑问，欢迎致电17719779330。
                                                </li>
                                                <li>
                                                    &nbsp;祝您生活愉快 ！
                                                </li>
                                                <table id="stock-in-table">
                                                </table>
                                            </div>
                                        </div>
                                    </section>
                                </div>
                            </div>
                        </div>
                    </section>
                </div>
            </div>
        </div>
        <%@ include file="../frame/footer.jsp"%>
        <!--footer section end-->
    </div>
    <!-- main content end-->
</section>


<%@ include file="../frame/script.jsp"%>

</body>
</html>


