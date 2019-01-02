package com.yto1114;

import java.time.LocalDate;

public class Employee {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalar() {
        return salar;
    }

    public void setSalar(double salar) {
        this.salar = salar;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void setHireDay(LocalDate hireDay) {
        this.hireDay = hireDay;
    }

    private String name;
    private double salar;
    private LocalDate hireDay;

    public Employee(String name, double salar, int year,int month,int day) {
        this.name = name;
        this.salar = salar;
        this.hireDay = LocalDate.of( year, month, day);
    }

    /**
     * 涨工资
     * @param byPercent
     */
    public void raiseSalary(double byPercent){
        double raise = salar*byPercent/100;
        salar+=raise;
    }

    @Override
    public String toString() {
        return "Employee: [" +
                "name='" + name + '\'' +
                ", salar=" + salar +
                ", hireDay=" + hireDay +
                ']';
    }
}
