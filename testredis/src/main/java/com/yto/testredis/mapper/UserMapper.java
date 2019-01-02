package com.yto.testredis.mapper;

import com.yto.testredis.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author czw
 */
@Mapper
public interface UserMapper {
    /**
     * 获取账号和密码
     */
    User selectUserByUsernameAndPsw(@Param("userName") String userName, @Param("userPass") String userPass);
    /**
     * 获取所有用户
     */
    List<User> getListUser();

    /**
     * 根据ID获取用户
     */
    User getUserById(@Param("userId") int userId);
    /**
     * 添加用户
     */
    int addUser(User user);
    /**
     * 删除用户
     */
    int delUser(int [] userId);
    /**
     * 更新用户信息
     */
    int saveUser(User user);
    /**
     * 根据UserNaem查询用户
     */
    User findByName(String userName);

}
