package com.java.laba4;
/**
 *  Реализация класса Person, с полями id, имя, пол, дата рождения, подразделение, з/п
 * */

public class Person {
    private int id;
    private String name;
    private String gender;
    private String bDate;
    private Division division;
    private double salary;

    /**
     * Функция, возвращающая значение id
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Функция, задающая значение id
     * @param id - id сотрудника
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Функция, возвращающая значение name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Функция, задающая значение name
     * @param name - Имя
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Функция, возвращающая значение gender
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Функция, задающая значение gender
     * @param gender - пол
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Функция, возвращающая значение division
     * @return division
     * */
    public Division getDivision() {
        return division;
    }

    /**
     * Функция, задающая значение division
     * @param idD - id подразделения
     * @param nameD - название подразделения
     */
    public void setDivision(int idD, String nameD) {
        Division division = new Division();
        division.setId(idD);
        division.setName(nameD);
        this.division = division;
    }

    /**
     * Функция, возвращающая значение bDate
     * @return bDate
     */
    public String getBDate() {
        return bDate;
    }

    /**
     * Функция, задающая значение bDate
     * @param bDate - дата рождения
     */
    public void setBDate(String bDate) {
        this.bDate = bDate;
    }

    /**
     * Функция, возвращающая значение salary
     * @return salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Функция, задающая значение salary
     * @param salary - з/п
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Функция, возвращающая информацию о человеке
     * @return id+name+gender+bDate+division+salary
     */
    public String getPerson()
    {
        return "id: "+ id + " name: " + name + " gender: " + gender + " bDate: " + bDate +
                " division: "+ division.get() + " salary: " + salary;
    }
}
