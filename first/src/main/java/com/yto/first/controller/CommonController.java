package com.yto.first.controller;

import com.yto.first.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by MWL on 2017/11/25.
 * @author czw
 */
@Controller
@RequestMapping(value = "/yto56")
public class CommonController {
    @Autowired
    public CommonService commonservice;

    @RequestMapping(value = "/login", method = {RequestMethod.POST, RequestMethod.GET})
    public String login() {
        System.out.println("测试！！！！");
        return "/login/login";
    }

    @RequestMapping(value = "/loginPage", method = {RequestMethod.POST, RequestMethod.GET})
    public String login(HttpServletRequest request, HttpSession session) {
        String tno = request.getParameter("tno");
        String password = request.getParameter("password");
        System.out.println("你输入的用户名为：" + tno);
        System.out.println("你输入的密码为：" + password);
        String tname = commonservice.login(tno, password);
        session.setAttribute("tname", tname);
        if (tname == null) {
            return "redirect:/yto56/login";
        } else {
            return "redirect:/yto56/index";
        }
    }

    @RequestMapping(value = "/index", method = {RequestMethod.POST, RequestMethod.GET})
    public String loginindex() {
        return "/login/test";

    }
}