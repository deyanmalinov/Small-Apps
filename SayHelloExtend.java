package com.DPM;
import java.util.ArrayList;
import java.util.List;
public class SayHelloExtend {
    public static void main(String[] args) {

        List<Persona> people = new ArrayList<>();

        people.add(new Bulgarian("Pesho"));

        people.add(new European("Pesho"));

        people.add(new Chinese("Pesho"));

        for (Persona person : people) {
            print(person);
        }
    }
private static void print(Persona person){
        System.out.println(person.sayHello());
    }
}
interface Persona {
    String getName();
    String sayHello();
}
abstract class BasePerson implements Persona{
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
class Bulgarian extends BasePerson {
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
class European extends BasePerson{
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
class Chinese extends BasePerson{
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