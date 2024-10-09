package com.DPM;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ValidationData {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int lines = Integer.parseInt(scan.nextLine());

        List<Person2> people = new ArrayList<>();

        for (int i = 0; i < lines; i++) {
            Person2 man = null;
            String[] line = scan.nextLine().split(" ");
            String fname = line[0];
            String sname = line[1];
            int age = Integer.parseInt(line[2]);
            double salary = Double.parseDouble(line[3]);
            try{
                man = new Person2(fname, sname, age, salary);
            }catch (IllegalArgumentException exception){
                System.out.println(exception.getMessage());
            }
            if (man != null){
                people.add(man);
            }
        }
        double bonus = Double.parseDouble(scan.nextLine());
        for (Person2 person : people) {
            person.increaseSalary(bonus);
        }
        for (Person2 person : people) {
            System.out.println(person.toString());
        }
    }
}
class Person2 {
    private String fname;
    private String sname;
    private int age;
    private double salary;
    public Person2(String fname, String sname, int age, double salary){
        this.setFname(fname);
        this.setSname(sname);
        this.setAge(age);
        this.setSalary(salary);
    }
    public void setSalary(double salary){
        if (salary < 460){
            throw new IllegalArgumentException
                    ("Salary cannot be less than 460 leva");
        }
        this.salary=salary;
    }
    public void setFname(String fname){
        if (fname.length() < 3){
            throw new IllegalArgumentException
                    ("First name cannot be less than 3 symbols");
        }
        this.fname=fname;
    }
    public void setSname(String sname){
        if (sname.length() < 3){
            throw new IllegalArgumentException
                    ("Last name cannot be less than 3 symbols");
        }
        this.sname=sname;
    }
    public void setAge(int age){
        if (age < 1){
            throw new IllegalArgumentException
                    ("Age cannot be zero or negative integer");
        }
        this.age=age;
    }
    public String getFname(){
        return this.fname;
    }
    public String getSname(){
        return this.sname;
    }
    public int getAge(){
        return this.age;
    }
    public double getSalary(){
        return this.salary;
    }
    public void increaseSalary(double bonus){
        if (this.age > 30){
            this.salary += this.salary * bonus/100;
        }else {
            this.salary += this.salary * bonus/200;
        }
    }
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.0##############");
        return String.format("%s %s gets %s leva",
                this.getFname(), this.getSname(), df.format(this.getSalary()));
    }
}