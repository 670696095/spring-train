package com.yto.service;

import com.yto.bean.User;

/**
 * @author czw
 */
public interface IUserService {
    User UserValidation(String username, String psw);
    User findByName(String username);
    int saveUser(String usename,String psw,int age);
}
