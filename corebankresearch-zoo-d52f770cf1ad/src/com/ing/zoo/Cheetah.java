package com.ing.zoo;

public class Cheetah extends Animal implements Carnivore{
    public Cheetah(String name, String helloText) {
        super(name, helloText);
    }

    @Override
    public void eatMeat() {
        eatText = "nomnomnom fast";
        System.out.println(eatText);
    }
}
