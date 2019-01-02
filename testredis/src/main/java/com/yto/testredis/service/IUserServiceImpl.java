package com.yto.testredis.service;

import com.yto.testredis.bean.User;
import com.yto.testredis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author czw
 */
@Service
public class IUserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User userValiation(String userName, String userPass) {
        return userMapper.selectUserByUsernameAndPsw(userName,userPass);

    }

    @Override
    public List<User> getListUser() {
        return userMapper.getListUser();
    }

    @Override
    public User getUserById(int userId) {
        return userMapper.getUserById(userId);
    }

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public int delUsers(int[] userId) {
        return userMapper.delUser(userId);
    }

    @Override
    public int saveUser(User user) {
        return userMapper.saveUser(user);
    }

    @Override
    public User findByName(String userName) {
        return userMapper.findByName(userName);
    }


}
