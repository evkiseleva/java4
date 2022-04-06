package com.java.laba4;

public class Person {
    private int id;
    private String name;
    private String gender;
    private String bDate;
    private Division division;
    private double salary;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public Division getDivision() {
        return division;
    }
    public void setDivision(int idD, String nameD) {
        Division division = new Division();
        division.setId(idD);
        division.setName(nameD);
        this.division = division;
    }

    public String getBDate() {
        return bDate;
    }
    public void setBDate(String bDate) {
        this.bDate = bDate;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String printPerson()
    {
        return "id: "+ id + " name: " + name + " gender: " + gender + " bDate: " + bDate +
                " division: "+ division.get() + " salary: " + salary;
    }
}
