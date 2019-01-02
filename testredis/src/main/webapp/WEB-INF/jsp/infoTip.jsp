<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
                 操作结果
            </h3>
            
        </div>
		 
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
													
		<Table border="0" cellspacing="0"  class="table table-striped" cellpadding="0" align="center" width=400> 
        
          
              <h2  align="center">提示信息</h2>
            
        
        <TR>
        <TD>
          <Table border="0" cellspacing="1" cellpadding="1" width="100%" align="center"> 
            <TR class="editbody">
                <c:choose>
                    <c:when test="${tipType=='success'}"><TD id="htmlsuccess" height="60">&nbsp;&nbsp;&nbsp;&nbsp;${tip}</TD>
                    </c:when>
                    <c:otherwise> <TD id="htmlerror"><br/>&nbsp;&nbsp;&nbsp;&nbsp;操作失败，请您检测以下错误：<br><UL><LI>${tip}</LI></UL></TD>
                    </c:otherwise>
                </c:choose>
            </TR>
          </table>
        </TD>
        </TR>
        
        <TR class="editbody"><TD height=30 align="center">
          <c:if test="${url1!=null}"><input type='button'Class="btn btn-primary" value='${value1}' name='BtnRet1' class='btnstyle' onclick="window.location='${url1}'" /></c:if>

        </TD>
        </TR>
      </TABLE>  
													
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
        
    </div>
    <!-- main content end-->
</section>


<%@ include file="../frame/script.jsp"%>

</body>
</html>

