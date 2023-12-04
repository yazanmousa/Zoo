package com.ing.zoo;

public class Hippo extends Animal implements Herbivore{


    public Hippo(String name, String helloText) {
        super(name, helloText);
    }


    @Override
    public void eatLeaves() {
        eatText = "munch munch lovely";
        System.out.println(eatText);
    }
}
