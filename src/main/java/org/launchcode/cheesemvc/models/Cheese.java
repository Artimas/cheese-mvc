package org.launchcode.cheesemvc.models;

public class Cheese {

    private String name;
    private String description;

    public Cheese(String name, String description){
        this.name = name;
        this.description = description;
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



}
