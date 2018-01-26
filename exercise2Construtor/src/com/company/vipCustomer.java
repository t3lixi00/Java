package com.company;

public class vipCustomer {

    private String name;
    private double creditLimit;
    private String email;


    public vipCustomer(){

        this("default name", 4999.99, "default@email.com");
    }

    public vipCustomer(String name, String email){
        this(name, 4999.99, email);
    }

    public vipCustomer(String name, double creditLimit, String email){

        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;

    }


    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
