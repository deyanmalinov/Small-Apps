package com.DPM;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class CompanyRoster_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        List<Employee> employees= new ArrayList<>();

        for (int i = 0; i < num; i++) {
            String[] line = scan.nextLine().split(" ");
            String name = line[0];
            double salary = Double.parseDouble(line[1]);
            String position = line[2];
            String department = line[3];
            Employee employee=null;
            switch (line.length){
                case 4:
                    employee = new Employee(name, salary, position, department);
                    break;
                case 5:
                    if (line[4].matches("\\d+")){
                        employee = new Employee(name, salary, position, department, Integer.parseInt(line[4]));
                    }else {
                        employee = new Employee(name, salary, position, department, line[4]);
                    }
                    break;
                case 6:
                    employee = new Employee(name, salary, position, department,line[4], Integer.parseInt(line[5]));
            }
            employees.add(employee);
        }
//        TODO Printing
    }
}

class Employee {
    private final static String NO_EMAIL = "n/a";
    private final static int NO_AGE = -1;
    private String name;
    private double salary;
    private String position;
    private String department;
    private String email;
    private int age;
    public Employee(String name, double salary, String position, String department) {
        this(name, salary, position, department,NO_EMAIL, NO_AGE);
    }
    public Employee(String name, double salary, String position, String department, String email) {
        this(name, salary, position, department, email, NO_AGE);
    }
    public Employee(String name, double salary, String position, String department, int age) {
        this(name, salary, position, department, NO_EMAIL, age);
    }
    public Employee(String name, double salary, String position, String department, String email, int age) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email=email;
        this.age = age;
    }
    public String getDepartment() {
        return department;
    }
    public double getSalary() {
        return salary;
    }
    public String toString(){
        return String.format("%s %.2f %s %d",
                this.name,
                this.salary,
                this.email,
                this.age);
    }
}