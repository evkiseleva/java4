package com.java.laba4;

import java.util.ArrayList;


/**
 * Класс Divisions, содержащий список подразделений и поле, с помощью которого присваивается id новому подразделению
 */

public class Divisions {
    public static ArrayList<Division> divisions = new ArrayList<>();
    private static int count;

    /**
     * Функция, проверяющая по названию есть ли подразделение в списке и возвращающая его id,
     * если его нет, то добавляет
     * @param name - название подразделение
     * @return id подразделения
     */
    public static int getId(String name)
    {
        for(int i = 0; i < divisions.size(); i++)
        {
            if(name.equals(divisions.get(i).getName()))
            {
                return divisions.get(i).getId();
            }
        }
        count+=1;
        Division newDivision = new Division();
        newDivision.setName(name);
        newDivision.setId(count);
        divisions.add(newDivision);
        return newDivision.getId();
    }

}
