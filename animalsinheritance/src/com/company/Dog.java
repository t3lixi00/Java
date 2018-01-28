package com.company;

public class Dog extends Animal {

    // we also can create unique characteristics in Dog class
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    // initialize basic characteristics which inherit from Animal class
    // public Dog(String name, int brain, int body, int size, int weight) {
       // super(name, brain, body, size, weight);

    // because all of dogs have only one brain and one body, so we can assign value in this class as default, then
    // users don't need to retype them again. And build unique fields (eyes, legs...) into this constructor too.

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
         super(name, 1, 1, size, weight);

         this.eyes = eyes;
         this.legs = legs;
         this.tail = tail;
         this.teeth = teeth;
         this.coat = coat;
    }


    private void chew(){

        System.out.println("This is dog chew method! ");
    }

    @Override
    public void eat() {

        System.out.println("This is Dog eat method! ");
        chew();
        super.eat();
    }
}
