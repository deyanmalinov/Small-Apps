package com.DPM;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Bulgarian("Pesho"));
        people.add(new European("Pesho"));
        people.add(new Chinese("Pesho"));
        for (Person person : people) {
            print(person);
        }
    }
    private static void print(Person person){
        System.out.println(person.sayHello());
    }
}
public interface Person {
    String getName();
    String sayHello();
}
public abstract class BasePerson implements Person{
    private String name;
    private String hello;
    public void setName(String name){
        this.name=name;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public String sayHello() {
        return hello;
    }
}
public class Bulgarian extends BasePerson {
    private String name;
    public Bulgarian(String name){
        this.name=name;
    }
    @Override
    public void setName(String name) {
        super.setName(name);
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public String sayHello() {
        return "Здравей";
    }
}
public class European extends BasePerson{
    private String name;
    public European(String name){
        this.name=name;
    }
    @Override
    public void setName(String name) {
        super.setName(name);
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public String sayHello() {
        return "Hello";
    }
}
public class Chinese extends BasePerson{
    private String name;
    public Chinese(String name){
        this.name=name;
    }
    @Override
    public void setName(String name) {
        super.setName(name);
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public String sayHello() {
        return "Djydjybydjy";
    }
}