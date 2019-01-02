package com.yto1114;

public class EmployeeTest
{
    public static void main(String[] args) {
        Employee [] employees =  new Employee[4];
        employees[0] = new Employee("cui",75000,1987,12,10);
        employees[1] = new Employee("zhi",50000,1997,12,10);
        employees[2] = new Employee("wen",40000,1987,12,10);
//        for (Employee employee : employees) {
//            employee.raiseSalary(10);
//        }
        for(int i=0 ;i<3 ;i++){
            employees[i].raiseSalary(10);
        }

        Manager boss = new Manager("liu",80000,1987,12,15);
        boss.setBonus(5000);
        employees[3] = boss;


        for (Employee employee : employees) {
            System.out.println(employee.getSalar());
        }
    }


}
