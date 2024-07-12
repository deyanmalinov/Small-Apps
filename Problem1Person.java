package com.DPM;
import java.util.Scanner;
public class Problem1Person {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();

        int age = Integer.parseInt(scan.nextLine());

        try {
            Children child = new Children(name, age);
            System.out.println(child.toString());
        }catch (IllegalArgumentException msg ){
            System.out.println(msg.getMessage());
        }
    }
}
class Personi {
    private int age;
    private String name;
    public Personi(String name, int age){
        this.setName(name);
        this.setAge(age);
    }
    public void setAge(int age) {
        if (age < 1) {
            throw new IllegalArgumentException("Age must be positive!");
        }
        this.age = age;
    }
    public void setName(String name){
        if (name.length() < 3){
            throw new IllegalArgumentException("Name's length should not be less than 3 symbols!");
        }
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return String.format("Name: %s, Age: %d", this.getName(), this.getAge());
    }
}
class Children extends Personi {
    public Children(String name, int age){
        super(name, age);
    }
    public void setAge(int age){
        if (age > 15 ){
            throw new IllegalArgumentException("Child's age must be lesser than 15!");
        }
        super.setAge(age);
    }
}