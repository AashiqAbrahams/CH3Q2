package com.aashiq;


public class Person
{
    private String name;
    private boolean male = false;

    public Person(String name){
        this.name = name;
    }

    public Object getName() {

        return name;
    }

    public void gender(){
        male = true;
    }

    public void printGenderMessage(){
        if(!male){
            throw new IllegalStateException();
        }
        System.out.println("I am male!");
    }

    public String getGenderMessage() {
        if (!male) {
            throw new IllegalStateException();
        }
        return "I am male!";
    }

}

