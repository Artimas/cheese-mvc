package org.launchcode.cheesemvc.models;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Cheese {

    @NotNull
    @Size(min=3, max=15)
    private String name;

    @NotNull
    @Size(min=1, message = "Description must not be empty")
    private String description;

    private CheeseType type;

    @NotNull
    @DecimalMin("1")
    @DecimalMax("5")
    private int rating;

    private int id;
    private static int idCounter = 0;

    public Cheese(String name, String description){
        this();
        this.name = name;
        this.description = description;
    }

    public Cheese(){
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

    public CheeseType getType() {
        return type;
    }

    public void setType(CheeseType type) {
        this.type = type;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
