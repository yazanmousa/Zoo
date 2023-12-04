package com.ing.zoo;

public abstract class Animal {

    protected String name;
    protected String helloText;
    protected String eatText;

    public Animal(String name, String helloText) {
        this.name = name;
        this.helloText = helloText;
        this.eatText = "";
    }

    public String getName() {
        return name;
    }

    public void sayHello()
    {
        System.out.println(helloText);
    }

}
