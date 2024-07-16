package com.DPM;
import java.util.*;
public class CompanyRoster {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int lines = Integer.parseInt(scan.nextLine());

        HashMap<String, Department> deparments = new HashMap<>();

        while (lines-- > 0 ){
            String[] line = scan.nextLine().split(" ");
            String departmentName = line[3];
            Employees emp = new Employees(line[0],Double.parseDouble(line[1]),line[2]);
            if (line.length==5){
                if (Character.isDigit(line[4].charAt(0))){
                    emp.setAge(Integer.parseInt(line[4]));
                }else {
                    emp.setEmail(line[4]);
                }
            }else if (line.length==6){
                emp.setEmail(line[4]);
                emp.setAge(Integer.parseInt(line[5]));
            }
            if (!deparments.containsKey(departmentName)){
                deparments.put(departmentName, new Department());
            }
            deparments.get(departmentName).addEmployee(emp);
        }
        Map.Entry<String, Department> bigSal= deparments.entrySet()
                .stream().
                sorted((first,second) ->{
            int result = 0;
            if (second.getValue().getAvaregeSalery() > first.getValue().getAvaregeSalery()){
                result = 1;
            }else if (second.getValue().getAvaregeSalery() < first.getValue().getAvaregeSalery()){
                result = -1;
            }
            return result;
        }).findFirst().get();
        System.out.println(String.format("Highest Average Salary: %s", bigSal.getKey()));
        bigSal.getValue().getEmployees().stream().sorted((f,s) ->
                Double.compare(s.getSalary(), f.getSalary())).forEach(employee -> {
            System.out.println(String.format("%s %.2f %s %d", employee.getName(),
                    employee.getSalary(), employee.getEmail(), employee.getAge()));
        });
    }
}

class Employees {

    private String name;
    private double salary;
    private String position;
    private String email;
    private int age;
    public Employees(String name, double salary, String position){
        this.name=name;
        this.salary=salary;
        this.position=position;
        this.email="n/a";
        this.age=-1;
    }
    public void setEmail (String email){
        this.email=email;
    }
    public void setAge(int age){
        this.age=age;
    }
    public double getSalary(){
        return this.salary;
    }
    public String getName(){
        return this.name;
    }
    public String getEmail() {
        return this.email;
    }
    public int getAge() {
        return this.age;
    }
}


class Department {

    private List<Employees> employees;
    public Department(){
        this.employees = new ArrayList<>();
    }
    public List<Employees> getEmployees(){
        return this.employees;
    }
    public void addEmployee(Employees employee){
        this.employees.add(employee);
    }
    public double getAvaregeSalery(){
        return this.employees.stream().mapToDouble(e -> e.getSalary()).average().getAsDouble();
    }
}