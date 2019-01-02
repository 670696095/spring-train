package com.yto.test.Enum;

public class GenderTest {
    public static void main(String[] args) {
        Gender gender = Gender.valueOf("FEMALE");
        gender.setName("女");
        System.out.println(gender+"代表"+gender.getName());

        gender.setName("男");
        System.out.println(gender+"代表"+gender.getName());
    }
}
