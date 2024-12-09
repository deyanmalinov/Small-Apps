package com.DPM;

public class Students {
    private String fname;
    private String sname;
    private String age;
    private String town;

    public Students(String fname, String sname, String age, String town) {
        this.fname = fname;
        this.sname = sname;
        this.age = age;
        this.town = town;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getFname() {
        return fname;
    }

    public String getSname() {
        return sname;
    }

    public String getAge() {
        return age;
    }

    public String getTown() {
        return town;
    }
}