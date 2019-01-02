package com.yto.servlets;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @author czw
 */
@WebListener
public class MyBootSessionListener implements HttpSessionListener {
    public static int online = 0;
    @Override
    public void sessionCreated(HttpSessionEvent arg0) {
        HttpSession session = arg0.getSession();
        System.out.println("一个用户上线了:" + session.getId());
        session.setAttribute("online",online);
        online ++;
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent arg0) {
        HttpSession session = arg0.getSession();
        System.out.println("一个用户离线了:" + session.getId());
    }
}

