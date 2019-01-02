package com.yto.controller;

import com.yto.bean.User;
import com.yto.service.IUserService;
import com.yto.servlets.MyBootSessionListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author czw
 */
@Controller
public class UserMappingController {
    UserMappingController userMappingController;
    @Autowired
    private IUserService iUserService;
    private User user=new User();
    /**
     * 用户验证
     */
    @RequestMapping(value = "/login", method = {RequestMethod.POST, RequestMethod.GET})
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/loginPage", method = {RequestMethod.POST, RequestMethod.GET})
    public ModelAndView login(HttpServletRequest request, HttpSession session, HttpServletResponse response) {
        ModelAndView result = new ModelAndView("index");
        ModelAndView errResult = new ModelAndView("login");
        String tno = request.getParameter("tno");
        String password = request.getParameter("password");
        String autoLogin = request.getParameter("check");
        user = iUserService.UserValidation(tno, password);
        try {

            if(user != null && !"".equals(user)) {
                request.getSession().setAttribute("yh", user);
                request.getSession().setMaxInactiveInterval(3600);
                String tname = user.getUsername();
                String psw = user.getPsw();
                session.setAttribute("tname", tname);

                if ("check".equals(autoLogin) ) {
                    // 为用户名创建cookie
                    Cookie LoginName = new Cookie("LoginName", tname);
                    // 为密码创建Cookie!
                    Cookie cookiepsw = new Cookie("password", psw);
                    // 设置cookie的最大生存周期
                    LoginName.setMaxAge(7 * 24 * 60 * 60);
                    cookiepsw.setMaxAge(7 * 24 * 60 * 60);
                    // 将cookie回写到浏览器
                    response.addCookie(LoginName);
            response.addCookie(cookiepsw);
        }
        return result;
    }
            if(session != null){
        return result;
    }
            else {
                return errResult;
            }

        }catch (Exception e){
            errResult.addObject("errMsg", "数据异常！");
            e.printStackTrace();
        }
        return errResult;
    }


    @RequestMapping(value = "/index", method = {RequestMethod.POST, RequestMethod.GET})
    public String loginindex() {
        return "index";

    }
    @RequestMapping(value = "/erroe", method = {RequestMethod.POST, RequestMethod.GET})
    public String loginerror() {
        return "error";

    }
    @RequestMapping(value = "/returnTest", method = {RequestMethod.POST, RequestMethod.GET})
    public String test() {
        return "test";

    }


    @RequestMapping(value = "registe")
    public String registe() {
        return "registe";
    }

    @RequestMapping("/uregister")
    public String register(HttpServletRequest request) {
        String username=request.getParameter("username");
        String password1=request.getParameter("psw");
        String password2=request.getParameter("password2");
        String age=request.getParameter("age");
        int ages = Integer.parseInt(age);
        String str="registe";
        try {
            if (password1.equals(password2)) {
                user = iUserService.findByName(username);
                if (user == null) {
                    iUserService.saveUser(username, password1, ages);
                    str = "transfer";
                } else {
                    str = "error";
                }
            } else {
                str = "error";
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return str;
    }
    /**
     * 注销
     */
    @RequestMapping(value="/logout")
    public ModelAndView logout(HttpServletRequest request){
        ModelAndView result = new ModelAndView("login");
        HttpSession session = request.getSession();
        if(session!=null){
            User user = (User)session.getAttribute("yh");
            session.invalidate();//关闭session
        }
        return result;

    }
    @RequestMapping("/online")
    @ResponseBody
    public Object online() {
        return  "当前在线人数：" + MyBootSessionListener.online + "人";
    }



}
