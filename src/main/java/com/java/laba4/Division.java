package com.java.laba4;

public class Division {
    private int id;
    private String name;

    public void setId(int id)
    {
        this.id = id;
    }
    public int getId()
    {
        return id;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }

    public String get()
    {
        return "(id)" + id + ", (name)" + name;
    }
}
