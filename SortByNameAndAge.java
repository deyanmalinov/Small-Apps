package com.DPM;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class SortByNameAndAge {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int lines = Integer.parseInt(scan.nextLine());

        List<Persons> people = new ArrayList<>();

        Persons man = null;

        for (int i = 0; i < lines; i++) {
            String[] line = scan.nextLine().split(" ");
            String fname = line[0];
            String sname = line[1];
            int age = Integer.parseInt(line[2]);
            man = new Persons(fname, sname, age);
            people.add(man);
        }
        people.sort((fperson, sperson) -> {
            int comp = fperson.getFname().compareTo(sperson.getFname());
            if (comp != 0){
                return comp;
            }else {
                return Integer.compare(fperson.getAge(), sperson.getAge());
            }
        });
        for (Persons person : people) {
            System.out.println(person.toString());
        }
    }
}
class Persons {
    private String fname;
    private String sname;
    private int age;
    public Persons(String fname, String sname, int age){
        this.fname=fname;
        this.sname=sname;
        this.age=age;
    }
    public void setFname(){
        this.fname=fname;
    }
    public void setSname(){
        this.sname=sname;
    }
    public void setAge(){
        this.age=age;
    }
    public String getFname(){
        return fname;
    }
    public String getSname(){
        return sname;
    }
    public int getAge(){
        return age;
    }
    @Override
    public String toString() {
        return String.format("%s %s is %d years old.",
                this.getFname(), this.getSname(), this.getAge());
    }
}