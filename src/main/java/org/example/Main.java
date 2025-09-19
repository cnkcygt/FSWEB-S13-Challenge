package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        String[] employeeArr = new String[4];
        employeeArr[0] = "Enis";
        employeeArr[1] = "Yalçın";
        employeeArr[2] = "Can";

        Company company = new Company(1,"Workintech",100.24, employeeArr);
        Employee employee = new Employee(2,"Can Koçyiğit", "@cankcygt","1234", new String[] {Plan.BASIC.getName(), Plan.PREMIUM.getName()});
        Healthplan healthplan = new Healthplan(3, Plan.BASIC.getName(), Plan.BASIC);

//        System.out.println(employee);
//
//        employee.addHealthPlan(1, "NEW BASIC");

        System.out.println(company);

        company.addEmployee(3, "Can");

        System.out.println("COMPANY------------------");
        System.out.println(company);
//        System.out.println("EMPLOYEE------------------");
//        System.out.println(employee);
//        System.out.println("HEALTHPLAN------------------");
//        System.out.println(healthplan);
    }
}