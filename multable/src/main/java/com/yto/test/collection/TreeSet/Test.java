package com.yto.test.collection.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        // 利用TreeSet来存储自定义类Person对象
        // 创建TreeSet对象的时候传入Comparator比较器，使用匿名内部类的方式
        // 比较规则是先按照 年龄排序，年龄相等的情况按照年龄排序
        TreeSet<Person> treeSet = new TreeSet<Person>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1 == o2) {
                    return 0;
                }
                int result = o1.getAge() - o2.getAge();
                if (result == 0) {
                    return o1.getName().compareTo(o2.getName());
                }
                return result;
            }

        });

        treeSet.add(new Person("张山1", 20));
        treeSet.add(new Person("张山2", 16));
        treeSet.add(new Person("张山3", 13));
        treeSet.add(new Person("张山4", 17));
        treeSet.add(new Person("张山5", 20));

        for (Person p : treeSet) {
            System.out.println(p);
        }
        // 结果：按照compara方法内的逻辑来排序的
        /*
        Person [name=张山3, age=13]
        Person [name=张山2, age=16]
        Person [name=张山4, age=17]
        Person [name=张山1, age=20]
        Person [name=张山5, age=20]
         */

    }

}

