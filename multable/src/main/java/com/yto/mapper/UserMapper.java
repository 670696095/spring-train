package com.yto.mapper;

import com.yto.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author czw
 */
@Mapper
public interface UserMapper {

    /**
     * 根据id获取用户信息
     * @param id
     * @return
     */
     User getUserById(@Param("id") int id);
    /**
     * 获取账号和密码
     * @param
     * @return
     */
    User selectUserByUsernameAndPsw(@Param("username") String username,@Param("psw") String psw);
    /**
     * 根据名字查询
     * @param
     * @return
     */
    User findByName(@Param("username") String  username);
    /**
     * 保存用户
     */
    int saveUser(@Param("username") String username,@Param("psw") String psw,@Param("age") int age);

}