package com.yto.test.demo;

/**
 * @author czw
 */
public class Student {
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", mathScore=" + mathScore +
                ", chineseScore=" + chineseScore +
                '}';
    }

    public Student(String name, int mathScore, int chineseScore) {
        this.name = name;
        this.mathScore = mathScore;
        this.chineseScore = chineseScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public int getChineseScore() {
        return chineseScore;
    }

    public void setChineseScore(int chineseScore) {
        this.chineseScore = chineseScore;
    }

    private String  name;
    private int mathScore;
    private int chineseScore;

}
