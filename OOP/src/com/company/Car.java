package com.company;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void Setmodel(String model)
    {
        String validModel = model.toLowerCase();
        if(validModel.equals("porsche")){
            this.model= model;
        }else{

         this.model="unknown";
        }
    }

    public String getModel()
    {
        return this.model;
    }
}