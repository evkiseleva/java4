package com.java.laba4;

/**
 * Класс Division, содержащий поля id, название
 */

public class Division {
    private int id;
    private String name;

    /**
     * Функция, задающая значение id
     * @param id - id сотрудника
     */
    public void setId(int id)
    {
        this.id = id;
    }

    /**
     * Функция, возвращающая значение id
     * @return id
     */
    public int getId()
    {
        return id;
    }

    /**
     * Функция, задающая значение name
     * @param name - Название
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Функция, возвращающая значение name
     * @return name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Функция, возвращающая информацию о подразделении
     * @return id+name
     */
    public String get()
    {
        return "(id)" + id + ",(name)" + name;
    }
}
