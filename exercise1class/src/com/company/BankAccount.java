package com.company;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;


    //constructor

    public BankAccount(){

        // if you want to add some default value, for example, users who use class, he did not input any parameters
        // then we can use this way to set default value, as one constructor can call another constructor and overwrite
        // mention: it must be in the very first line
        this("unknown accountNumber", 0,"Default name", "Default email", 00000);

        System.out.println("Empty constructor called");
    }
  //Notice: we can have more than one constructor

    public BankAccount(String accountNumber, double balance, String customerName, String email,int phoneNumber){

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email= email;
        this.phoneNumber = phoneNumber;

    }

    // third constructor for practice, if i want to default the accountNumber and balance only
    /*
      public BankAccount(String customerName, String email, int phoneNumber){
         this("newDefaultBankAccount", 34343.33, customerName, email, phoneNumber);

         //How does it work ?
         // when users call this constructor, it will assign the "newDefaultBankAccount" and 34343.33 to accountNumber and balance
         // then call the main constructor (2rd constructor)
      }

     */

/*
    public void setAccountNumber(String accountNumber){
        this.accountNumber= accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public void setEmail(String email){
        this.email= email;
    }
    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void setDeposit(double deposit){
        this.balance += deposit;
    }
    public void setWithdraw(double withdraw){
        if(this.balance >= withdraw){
            this.balance -= withdraw;
        }else{
            System.out.printf("withdraw is rejected!");
        }
    }
 */
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

}
