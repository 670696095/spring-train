package com.yto.Interceptor;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Calendar;

/**
 * @author czw
 */
public class LoginTimeInterceptor extends HandlerInterceptorAdapter {
    private int startTime=6;
    private int endTime=24;

    @Override

    /**
     * 在控制器执行前调用,controller方法调用之前
     * preHandle方法：返回true，映射处理器执行链将继续执行；当返回false时，DispatcherServlet处理器认为拦截器已经处理完了请求，而不
     * 继续执行执行链中的其它拦截器和处理器
     */
    public boolean preHandle(HttpServletRequest request,HttpServletResponse response, Object handler) throws Exception {
        String tno = request.getParameter("tno");
        System.out.println("执行preHandle方法-->01");
        Calendar cal = Calendar.getInstance();
        //获得当前时间对应的小时数,例如：12:05-->12,13:15-->13
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        if (startTime <= hour && hour < endTime) {
            System.out.println("通过了拦截器。。。。。。。。。。。。。。。。。");
            return true;
        } else {//给定的时间之外禁止登录
            request.setAttribute("msg", "非登录时段");
            //request.getRequestDispatcher("error").forward(request, response);
            response.sendRedirect("error");
            //response.setStatus(404);
            System.out.println("没有通过拦截器，返回失败页面");
            return false;
        }

    }

    @Override
    //在后端控制器执行后调用,请求处理之后进行调用，但是在视图被渲染之前，即Controller方法调用之后
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("执行postHandle方法-->02");
        super.postHandle(request, response, handler, modelAndView);
    }
    @Override
    //整个请求执行完成后调用,在整个请求结束之后被调用，也就是在DispatcherServlet 渲染了对应的视图之后执行，主要是用于进行资源清理工作
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        System.out.println("执行afterCompletion方法-->03");
        super.afterCompletion(request, response, handler, ex);
    }

}
