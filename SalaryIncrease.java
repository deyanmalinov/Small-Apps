package DPM;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class SalaryIncrease {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int lines = Integer.parseInt(scan.nextLine());

        List<Person> people = new ArrayList<>();

        Person man = null;

        for (int i = 0; i < lines; i++) {
            String[] line = scan.nextLine().split(" ");
            String fname = line[0];
            String sname = line[1];
            int age = Integer.parseInt(line[2]);
            double salary = Double.parseDouble(line[3]);
            man = new Person(fname, sname, age, salary);
            people.add(man);
        }
        double bonus = Double.parseDouble(scan.nextLine());
        for (Person person : people) {
            person.increaseSalary(bonus);
        }
        for (Person person : people) {
            System.out.println(person.toString());
        }
    }
}
class Person {

    private String fname;
    private String sname;
    private int age;
    private double salary;
    public Person(String fname, String sname, int age, double salary){
        this.fname=fname;
        this.sname=sname;
        this.age=age;
        this.salary=salary;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public void setFname(String fname){
        this.fname=fname;
    }
    public void setSname(String sname){
        this.sname=sname;
    }
    public void setAge(int age){
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