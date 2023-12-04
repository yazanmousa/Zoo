package com.ing.zoo;

public class Liger extends Animal implements Carnivore{
    public Liger(String name, String helloText) {
        super(name, helloText);
    }

    @Override
    public void eatMeat() {
        eatText = "nomnomnom yummy yummy";
        System.out.println(eatText);
    }
}
