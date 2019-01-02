package com.yto.servlets;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author czw
 */
@WebFilter(filterName="loginFilter",
        urlPatterns="/*",
        initParams={
                @WebInitParam(name="login",value="demo.html,login,index,login.html,registe,uregister"),
                @WebInitParam(name = "encoding", value = "utf-8")
    })
public class LoginFilter implements Filter{
    private FilterConfig config;
    private String[] reqUrls;
    @Override
    public void init(FilterConfig Config) throws ServletException {
        String urlsStr=Config.getInitParameter("login");
        reqUrls=urlsStr.split(",");
        this.config=Config;
    }
    @Override
    public void doFilter(ServletRequest reg, ServletResponse res, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) reg;
        HttpServletResponse response = (HttpServletResponse) res;
        HttpSession session = request.getSession();
        String url = request.getRequestURI();
        String encoding = config.getInitParameter("encoding");
        request.setCharacterEncoding(encoding);
        System.out.println("过滤的地址是:" + url + "字符集配置是:" + encoding);
        String userName = (String) session.getAttribute("tname");
        boolean flag = false;
        for (int i = 0; i < reqUrls.length; i++) {
            url = url.toLowerCase();
            reqUrls[i] = reqUrls[i].toLowerCase();
            reqUrls[i] = reqUrls[i].trim();
            if (url.endsWith(reqUrls[i])) {
                System.out.println("放行了==>" + url);
                flag = true;
                break;
            }

        }
        String tno = request.getParameter("tno");
        if (tno != null) {
            flag = true;
        }
        System.out.println("flag标志是: " + flag);
        if (flag) {
            chain.doFilter(reg, res);
        } else {
            if (userName != null) {
                    chain.doFilter(reg, res);
                    System.out.println("用户存在的登陆过的放行");
                } else {
                    session.setAttribute("loginFlag", "登录失败了");
                    response.sendRedirect("login.html");
                }
            }
        }


    @Override
    public void destroy() {
        System.out.println("过滤器销毁了...");
    }
}
