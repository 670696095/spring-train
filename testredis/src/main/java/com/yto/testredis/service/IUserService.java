package com.yto.testredis.service;

import com.yto.testredis.bean.User;

import java.util.List;

/**
 * @author czw
 */

public interface IUserService {
    /**
     * 登录确认
     * @param userName
     * @param userPass
     * @return
     */
    User userValiation(String userName, String userPass);

    /**
     * 获取所有用户
     * @return
     */
    List<User> getListUser();
    /**
     * 根据ID获取用户
     */
    User getUserById(int userId);
    /**
     * 添加用户
     */
    int addUser( User user);
    /**
     * 删除用户
     */
    int delUsers(int []userId);
    /**
     * 更新用户信息
     */
    int saveUser(User user);
    /**
     * 根据UserNaem查询用户
     */
    User findByName(String userName);
}
