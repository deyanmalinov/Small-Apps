package DPM;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] lineStudent = reader.readLine().split("\\s+");
        String[] lineWorker = reader.readLine().split("\\s+");
        try {
            Student student = new Student(lineStudent[0], lineStudent[1], lineStudent[2]);
            Worker worker = new Worker(lineWorker[0], lineWorker[1],
                    Double.parseDouble(lineWorker[2]), Double.parseDouble(lineWorker[3]));
            System.out.println(student);
            System.out.println(worker);
        }catch (IllegalArgumentException msg) {
            System.out.println(msg.getMessage());
        }
    }
}--------------------------------------
package DPM;
public class Human {
    private String fname;
    private String sname;
    public Human(String fname, String sname){
        this.setFname(fname);
        this.setSname(sname);
    }
    public String getFname() {
        return fname;
    }
    private void setFname(String fname) {
        if (fname.length() < 4){
            throw new IllegalArgumentException("Expected upper case letter!Argument: firstName");
        }
        if (!Character.isUpperCase(fname.charAt(0))){
            throw new IllegalArgumentException("Expected length at least 4 symbols!Argument: firstName");
        }
        this.fname = fname;
    }
    public String getSname() {
        return sname;
    }
    protected void setSname(String sname) {
        if (!Character.isUpperCase(sname.charAt(0))){
            throw new IllegalArgumentException("Expected upper case letter!Argument: lastName");
        }
        if (sname.length() < 3){
            throw new IllegalArgumentException("Expected length at least 3 symbols!Argument: lastName");
        }
        this.sname = sname;
    }
    @Override
    public String toString() {
        StringBuilder human = new StringBuilder();

        human.append("First Name: ").append(this.fname).append(System.lineSeparator())
                .append("Last Name: ").append(this.sname);
        return human.toString();
    }
}-------------------------------------
package DPM;
public class Student extends Human{
    private String number;
    public Student(String fname, String sname, String number){
        super(fname, sname);
        this.setNumber(number);
    }
    public String getNumber() {
        return number;
    }
    private void setNumber(String  number) {
        if (number.length() < 5 || number.length() > 10){
            throw new IllegalArgumentException("Invalid faculty number!");
        }
        this.number = number;
    }
    @Override
    public String toString() {
        StringBuilder student = new StringBuilder();
        student.append(super.toString()).append(System.lineSeparator())
                .append("Faculty number: ").append(this.number);
        return student.toString();
    }
}----------------------------------
package DPM;
public class Worker extends Human{
    private double salary;
    private double hours;
    public Worker(String fname, String sname, double salary, double hours){
        super(fname, sname);
        this.setSalary(salary);
        this.setHours(hours);
    }
    public double getSalary() {
        return salary;
    }
    private void setSalary(double salary) {
        if (salary <= 10){
            throw new IllegalArgumentException("Expected value mismatch!Argument: weekSalary");
        }
        this.salary = salary;
    }
    public double getHours() {
        return hours;
    }
    @Override
    protected void setSname(String sname) {
        if (sname.length() <=3){
            throw new IllegalArgumentException("Expected length more than 3 symbols!Argument: lastName");
        }
        super.setSname(sname);
    }
    private void setHours(double hours) {
        if (hours < 1 || hours > 12){
            throw new IllegalArgumentException("Expected value mismatch!Argument: workHoursPerDay");
        }
        this.hours = hours;
    }
    private double getSalaryPerHour() {
         double hourSalary = this.salary / (this.hours * 7);
         return hourSalary;
    }
    @Override
    public String toString() {
        StringBuilder worker = new StringBuilder();
        worker.append(super.toString()).append(System.lineSeparator())
                .append("Week Salary: ").append(String.format("%.2f", this.salary)).append(System.lineSeparator())
                .append("Hours per day: ").append(String.format("%.2f", this.hours)).append(System.lineSeparator())
                .append("Salary per hour: ").append(String.format("%.2f", this.getSalaryPerHour()));
        return worker.toString();
    }
}