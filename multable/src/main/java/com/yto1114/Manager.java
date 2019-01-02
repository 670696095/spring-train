package com.yto1114;

public class Manager extends Employee {

    public Manager(String name, double salar, int year, int month, int day) {
        super(name, salar, year, month, day);
    }
    private double bonus;
    public void setBonus(double bonus){
        this.bonus = bonus;
    }
    @Override
    public double getSalar(){
        return bonus+super.getSalar();
    }
}
