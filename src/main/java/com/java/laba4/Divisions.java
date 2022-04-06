package com.java.laba4;

import java.util.ArrayList;

public class Divisions {
    public ArrayList<Division> divisions = new ArrayList<>();
    private int count;
    public int getId(String name)
    {
        for(int i = 0; i < divisions.size(); i++)
        {
            if(divisions.get(i).getName() == name)
            {
                return divisions.get(i).getId();
            }
        }
        count+=1;
        Division newDivision = new Division();
        newDivision.setName(name);
        newDivision.setId(count);
        return newDivision.getId();
    }

}
