package com.yto.service;

import com.yto.bean.User;
import com.yto.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IUserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User UserValidation(String username, String psw) {
        return userMapper.selectUserByUsernameAndPsw(username,psw);
    }

    @Override
    public int saveUser(String usename, String psw, int age) {
        return userMapper.saveUser(usename,psw,age);
    }

    @Override
    public User findByName(String username) {
        return userMapper.findByName(username);
    }
}
