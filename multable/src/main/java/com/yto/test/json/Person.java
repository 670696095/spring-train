package com.yto.test.json;

import java.util.ArrayList;
import java.util.List;

/**
 * @author czw
 */
public class Person {
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Cards> getCardList() {
        return cardList;
    }


    private String username;
    private String email;
    private String sex;
    private int age;
    private List<Cards> cardList = new ArrayList<>();

    public void setCardList(List<Cards> cards) {
        this.cardList = cards;
    }
}
