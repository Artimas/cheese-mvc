package org.launchcode.cheesemvc.models;

public class Cheese {

    private String name;
    private String description;
    private int id;
    private static int idCounter = 0;

    public Cheese(String name, String description){
        this.name = name;
        this.description = description;
        this.id = Cheese.idCounter;
        Cheese.idCounter++;
    }

    public Cheese(String name){
        this(name, "I'm sure someone enjoys this...");
    }

    public String getName(){
        return name;
    }

    public void setName(String aName){
        name = aName;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription( String aDesc){
        description = aDesc;
    }

    public int getId(){return id;}





}
