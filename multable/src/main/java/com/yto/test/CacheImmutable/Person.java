package com.yto.test.CacheImmutable;

import java.util.Objects;

public class Person {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public String getIdStr() {
        return idStr;
    }

    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    private String idStr;

    public Person() {
    }

    public Person(String name, String idStr) {
        this.idStr = idStr;
        this.name = name;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == Person.class) {
            Person personObj = (Person) obj;
            if (this.getIdStr().equals(personObj.getIdStr())) {
                return true;
            }
        }
        return false;

    }


    @Override
    public int hashCode() {

        return Objects.hash(name, idStr);
    }

    public static void main(String[] args) {
        Person p1 = new Person("孙悟空", "123");
        Person p2 = new Person("孙悟饭", "123");
        Person p3 = new Person("孙行者", "789");
        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p3));

    }
}
