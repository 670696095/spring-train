package com.yto.bean;

/**
 * @author czw
 */
public class User {
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoto() {

        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getSign() {

        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getSex() {

        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }



    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
        this.psw = psw;
    }

    private String username;
    private String sex;
    private String sign;
    private String photo;
    private int age;

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    private String psw;
}
