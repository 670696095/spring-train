package com.yto.test.demo;

/**
 * @author czw
 */
public class Sort {
    public static void main(String[] args) {
        Student[] st = new Student[5];
        st[0] = new Student("你好1",98,99);
        st[1] = new Student("你好2",97,96);
        st[2] = new Student("你好3",95,94);
        st[3] = new Student("你好4",93,92);
        st[4] = new Student("你好5",91,90);
        System.out.println("排序前的数据:");
        for (Student student : st) {
            System.out.println(student);
        }
        bubbleSort(st);
        System.out.println(avg(st));


    }

    /**
     * 排序
     * @param st
     */
    public static void bubbleSort(Student [] st){
        for (int i = 0; i < st.length-1; i++) {
            for (int j = 0; j <st.length-1-i ; j++) {
                if (st[j].getMathScore() > st[j+1].getMathScore()){
                    Student temp = st[j];
                    st[j] = st[j+1];
                    st[j+1] = temp;

                }

            }

        }
        System.out.println("排序后的数据:");
        for (Student student : st) {
            System.out.println(student);
        }

    }
    /**
     * 求平均
     */
    public static double avg(Student [] students){
        double count = 0;
        for (int i = 0; i <students.length ; i++) {
            count+=students[i].getMathScore();
        }
        double avg = count/students.length;
        return avg;

    }

}
