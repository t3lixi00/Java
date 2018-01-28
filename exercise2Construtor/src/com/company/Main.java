package com.company;

public class Main {

    public static void main(String[] args) {

        // Create a new class VipCustomer
        // it should have 3 fields name, credit limit, and email address.
        // create 3 constructors
        // 1st constructor empty should call the constructor with 3 parameters with default values
        // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
        // 3rd constructor should save all fields.
        // create getters only for this using code generation of intellij as setters wont be needed
        // test and confirm it works.




     vipCustomer defaultTester = new vipCustomer();


     System.out.println(defaultTester.getName());
     System.out.println(defaultTester.getCreditLimit());
     System.out.println(defaultTester.getEmail());

     vipCustomer partDefaultTester = new vipCustomer("rita","rita@email.com");

        System.out.println(partDefaultTester.getName());
        System.out.println(partDefaultTester.getCreditLimit());
        System.out.println(partDefaultTester.getEmail());

     vipCustomer Tester3 = new vipCustomer("tester3",1000,"tester3@email.com");

        System.out.println(Tester3.getName());
        System.out.println(Tester3.getCreditLimit());
        System.out.println(Tester3.getEmail());
    }
}
