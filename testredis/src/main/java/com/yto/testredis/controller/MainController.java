package com.yto.testredis.controller;

import com.yto.testredis.bean.User;
import com.yto.testredis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author czw
 *
 */
@Controller
public class MainController {
    @Autowired
    private IUserService iUserService;
    private User params;
    private String tip;
    /**
     * @Title: index
     * @Description: 显示提示页面
     * @return String
     */
    @RequestMapping(value = "index", method = {RequestMethod.POST, RequestMethod.GET})
    public String index(){
        return "index";
    }

    /**
     * 用户登录
     *
     * @return
     */
    @RequestMapping(value = "login", method = {RequestMethod.POST, RequestMethod.GET})
    public String test() {
        return "login";
    }

    /**
     * 登录验证
     */
    @RequestMapping(value = "/LoginInSystem.action", method = {RequestMethod.POST, RequestMethod.GET})
    public ModelAndView loginInSystem(HttpServletRequest request, HttpSession session, HttpServletResponse response) {
        ModelAndView result = new ModelAndView("index");
        ModelAndView errResult = new ModelAndView("loginerror");
        ModelAndView loginResult = new ModelAndView("login");
        String userName = request.getParameter("params.userName");
        String userPass = request.getParameter("params.userPass");
        params = iUserService.userValiation(userName, userPass);
        try {
            if (params != null && !"".equals(params)) {
                params.setUserTypes("1,2,3");
                request.getSession().setAttribute("yh", params);
                request.getSession().setMaxInactiveInterval(3600);
                String sessionName = params.getUserName();
                String sessionPass = params.getUserPass();
                session.setAttribute("admin", params);
                return result;
            } else {
                tip = "用户名或密码错误";
                request.setAttribute("tip", tip);

            }

        } catch (Exception e) {
            tip = "登录异常，请稍后重试";
            errResult.addObject("errMsg", "数据异常！");
            e.printStackTrace();

        }
        return loginResult;
    }

    /**
     * 个人信息页面
     *
     * @return
     */
    @RequestMapping(value = "modifyInfo", method = {RequestMethod.POST, RequestMethod.GET})
    public String modifyinfo() {
        return "modifyInfo";
    }

    /**
     * @return String
     * @Title: listUsers
     * @Description: 查询用户
     */
    @RequestMapping(value = "listUsers", method = {RequestMethod.POST, RequestMethod.GET})
    public String listUsers(HttpServletRequest request, HttpSession session, HttpServletResponse response) {
        try {
            if (params == null) {
                params = new User();
            }
            //查看用户信息
            params.setUserType(1);
            //查询用户列表
            List<User> users = iUserService.getListUser();

            session.setAttribute("users", users);


        } catch (Exception e) {
            e.printStackTrace();
            return "infoTip";
        }

        return "userShow";
    }
    /**
     * @Title: addUserShow
     * @Description: 显示添加用户页面
     * @return String
     */
    @RequestMapping(value = "addUserShow", method = {RequestMethod.POST, RequestMethod.GET})
    public String addUserShow(){
        return "userEdit";
    }

    /**
     * @Title: editUser
     * @Description: 编辑用户
     * @return String
     */
    @RequestMapping(value = "editUser", method = {RequestMethod.POST, RequestMethod.GET})
    public String editUser(HttpServletRequest request, HttpSession session, HttpServletResponse response){
        try {
            //得到用户
            String  ids =request.getParameter("params.userId");
            int id = Integer.parseInt(ids);
            User user = iUserService.getUserById(id);
            int userId = user.getUserId();
            int userSex = user.getUserSex();
            request.setAttribute("user", user);
            request.setAttribute("userId", userId);
            session.setAttribute("userSex", userSex);


        } catch (Exception e) {
            e.printStackTrace();
            return "infoTip";
        }

        return "userEdit";
    }
    /**
     * @Title: addUser
     * @Description: 添加用户
     * @return String
     */
    @RequestMapping(value = "addUser", method = {RequestMethod.POST, RequestMethod.GET})
    public String addUser(HttpServletRequest request, HttpSession session, HttpServletResponse response){
        try {
            //检查用户是否存在
            String userName = request.getParameter("paramsUser.userName");
            String userPass = request.getParameter("paramsUser.userPass");
            String temp = request.getParameter("paramsUser.userSex");
            String realName = request.getParameter("paramsUser.realName");
            String userPhone = request.getParameter("paramsUser.userPhone");
            if(null != temp && !"".equals(temp)) {
                int userSex = Integer.parseInt(temp);
                params = iUserService.findByName(userName);
                if (params != null) {
                    tip = "失败，该用户名已经存在！";
                    setErrorTip(request,tip, "addUserShow");
                    return "infoTip";
                }
                Date now = new Date();
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                String date = dateFormat.format(now);
                //添加用户
                User user = new User();
                user.setUserSex(userSex);
                user.setUserName(userName);
                user.setUserPass(userPass);
                user.setUserPhone(userPhone);
                user.setUserType(2);
                user.setRegDate(date);
                user.setUserFlag(0);
                user.setRealName(realName);

                int result = iUserService.addUser(user);
                setSuccessTip(request, "添加成功", "listUsers");
            }
        } catch (Exception e) {
            setErrorTip(request,"添加用户异常", "listUsers");
            e.printStackTrace();
        }

        return "infoTip";
    }
    /**
     * @Title: saveUser
     * @Description: 编辑用户
     * @return String
     */
    @RequestMapping(value = "saveUser", method = {RequestMethod.POST, RequestMethod.GET})
    public String saveUser(HttpServletRequest request, HttpSession session, HttpServletResponse response){
        try {
            //检查用户是否存在
            String userName = request.getParameter("paramsUser.userName");
            String userPass = request.getParameter("paramsUser.userPass");
            String temp = request.getParameter("paramsUser.userSex");
            String realName = request.getParameter("paramsUser.realName");
            String userPhone = request.getParameter("paramsUser.userPhone");
            if(null != temp && !"".equals(temp)) {
                params = iUserService.findByName(userName);
                if (params != null) {
                    tip = "失败，该用户名已经存在！";
                    setErrorTip(request,tip, "listUsers");
                    return "infoTip";
                }
                int userSex = Integer.parseInt(temp);
                User user = new User();
                user.setUserSex(userSex);
                user.setUserName(userName);
                user.setUserPass(userPass);
                user.setUserPhone(userPhone);
                user.setRealName(realName);

                int result = iUserService.saveUser(user);
                setSuccessTip(request, "编辑成功", "listUsers");
            }
        } catch (Exception e) {
            setErrorTip(request,"编辑用户异常", "listUsers");
            e.printStackTrace();
        }

        return "infoTip";
    }
    /**
     * @Title: showTig
     * @Description: 显示提示页面
     * @return String
     */
    @RequestMapping(value = "infoTip", method = {RequestMethod.POST, RequestMethod.GET})
    public String showTig(){
        return "infoTip";
    }
    /**
     *tip设置
     */
    private void setErrorTip(HttpServletRequest request,String tip,String url){
        request.setAttribute("tipType", "error");
        request.setAttribute("tip", tip);
        request.setAttribute("url1", url);
        request.setAttribute("value1", "确 定");
    }

    private void setSuccessTip(HttpServletRequest request,String tip,String url){
        request.setAttribute("tipType", "success");
        request.setAttribute("tip", tip);
        request.setAttribute("url1", url);
        request.setAttribute("value1", "确 定");
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    /**
     * @Title: delUsers
     * @Description: 删除用户
     * @return String
     */
    @RequestMapping(value = "delUsers", method = {RequestMethod.POST, RequestMethod.GET})
    public String delUsers(HttpServletRequest request, HttpSession session, HttpServletResponse response){
        //删除用户
        try {
            String id = request.getParameter("paramsUser.ids");
            int ids = Integer.parseInt(id);
            User user = iUserService.getUserById(ids);
            if (user.getUserType()==1){
                setErrorTip(request,"不允许删除管理员", "listUsers");
                return  "infoTip";
            }
            String arrays[] = (id.split(","));
            int[] userId = new int[arrays.length];
            if(null != id &&!"".equals(id)) {
                for (int i = 0; i < arrays.length; i++) {
                    userId[i] = Integer.parseInt(arrays[i]);
                }
               iUserService.delUsers(userId);
                setSuccessTip(request, "删除用户成功", "listUsers");
            }
        } catch (Exception e) {
            setErrorTip(request,"删除用户异常", "listUsers");
        }

        return "infoTip";
    }
    /**
     * @Title: OutSystem
     * @Description: 退出登录
     * @return String
     */
    @RequestMapping(value = "OutSystem", method = {RequestMethod.POST, RequestMethod.GET})
    public String OutSystem(HttpServletRequest request, HttpSession session, HttpServletResponse response){
        try {
            //用户查询
            User user = (User)session.getAttribute("admin");
            if (user!=null) {
                //退出登录
                session.invalidate();
            }

        } catch (Exception e) {
            setErrorTip(request,"退出系统失败", "index");
            return "infoTip";
        }

        return "login";
    }


}
