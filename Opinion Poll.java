package com.DPM;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lines = Integer.parseInt(scan.nextLine());
        List<Person> people = new ArrayList<>();
        for (int i = 0; i <lines; i++) {
            String[] line = scan.nextLine().split(" ");
            String name = line[0];
            int age = Integer.parseInt(line[1]);
            Person persona = new Person(name, age);
            people.add(persona);
        }
        people.stream()
                .filter(person -> person.getAge()>30)
                .sorted((fp, sp) -> fp.getName().compareTo(sp.getName()))
                .forEach(person -> System.out.println(String
                .format("%s - %d",person.getName(),person.getAge())));
    }
}

public class Person {
    private String name;
    private int age;
    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}