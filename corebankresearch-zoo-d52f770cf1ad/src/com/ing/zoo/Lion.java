package com.ing.zoo;

public class Lion extends Animal implements Carnivore{


    public Lion(String name, String helloText) {
        super(name, helloText);
    }

    @Override
    public void eatMeat() {
        eatText = "nomnomnom thx mate";
        System.out.println(eatText);
    }
}
