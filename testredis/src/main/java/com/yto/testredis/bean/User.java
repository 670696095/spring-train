package com.yto.testredis.bean;

import java.io.Serializable;

/**
 * @author czw
 */

public class User implements Serializable {

    private String    regDate;
    private Integer userType;
    private Integer userFlag;
    private Integer userId;
    private String userName;
    private String userPass;
    private String realName;
    private Integer userSex;
    private String userPhone;
    private String userTypes;
    public String getUserTypes() { return userTypes; }
    public void setUserTypes(String userTypes) { this.userTypes = userTypes; }
    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public Integer getUserType() {
        return userType;
    }
    public void setUserType(Integer userType) {
        this.userType = userType;
    }
    public String getUserPass() {
        return userPass;
    }
    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }
    public String getRealName() {
        return realName;
    }
    public void setRealName(String realName) {
        this.realName = realName;
    }
    public Integer getUserSex() {
        return userSex;
    }
    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }
    public String getUserPhone() {
        return userPhone;
    }
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }
    public Integer getUserFlag() {
        return userFlag;
    }
    public void setUserFlag(Integer userFlag) {
        this.userFlag = userFlag;
    }
    public String getRegDate() {
        return regDate;
    }
    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public String getUserSexDesc(){
        switch (userSex) {
            case 1:
                return "男";
            case 2:
                return "女";
            default:
                return "";
        }
    }
    public String getUserTypeDesc(){
        switch (userType){
            case 1:
                return "普通用户";
            case 2:
                return "特殊用户";
            case 3:
                return "系统管理员";
            default:
                return "";
        }
    }

    /** default constructor */
    public User() {
    }

    /** minimal constructor */
    public User(String userName, String userPass) {
        this.userName = userName;
        this.userPass = userPass;
    }

    /** full constructor */
    public User(String userName, String userPass, String realName,
                Integer userSex, String userPhone, Integer userFlag,
                String regDate, Integer userType) {
        this.userName = userName;
        this.userPass = userPass;
        this.realName = realName;
        this.userSex = userSex;
        this.userPhone = userPhone;
        this.userFlag = userFlag;
        this.regDate = regDate;
        this.userType = userType;
    }


}
