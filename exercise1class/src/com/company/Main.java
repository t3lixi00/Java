package com.company;


// Create a new class for a bank account
// Create fields for the account number, balance, customer name, email and phone number.
//
// Create getters and setters for each field
// Create two additional methods
// 1. To allow the customer to deposit funds (this should increment the balance field).
// 2. To allow the customer to withdraw funds. This should deduct from the balance field,
// but not allow the withdrawal to complete if their are insufficient funds.
// You will want to create various code in the Main class (the one created by IntelliJ) to
// confirm your code is working.
// Add some System.out.println's in the two methods above as well.

// Here is also constructor practice

public class Main {

    public static void main(String[] args) {


        //The following is exercise without constructor
        //BankAccount rita = new BankAccount(); //This is calling to the constructor
       // rita.setAccountNumber("1234567");
       // rita.setBalance(2300);
       // rita.setCustomerName("ritali");
       // rita.setDeposit(2300);
       // rita.setWithdraw(5000);
       // rita.setEmail("rita@dd.com");

        //using constructor, purpose: easy for developers to initialize the class

        BankAccount rita = new BankAccount("234567",2300,"ritali","rita@dd.com",123453);
        System.out.println(rita.getAccountNumber());
        System.out.println(rita.getBalance());
        System.out.println(rita.getCustomerName());
        System.out.println(rita.getEmail());
        System.out.println(rita.getBalance());
        System.out.println(rita.getPhoneNumber());

    }
}
