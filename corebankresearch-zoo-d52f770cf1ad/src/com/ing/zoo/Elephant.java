package com.ing.zoo;

import java.util.Random;

public class Elephant extends Animal implements Carnivore, Herbivore, Magician{

    public String trick;
    public Elephant(String name, String helloText) {
        super(name, helloText);
    }

    @Override
    public void eatLeaves() {
        eatText = "munch big oink";
        System.out.println(eatText);
    }

    @Override
    public void eatMeat() {
        eatText = "nomnomnom big thx";
        System.out.println(eatText);
    }
    @Override
    public void performTrick() {
        //Generates random number
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            trick = "Swim";
        } else {
            trick = "Jump";
        }
        System.out.println(trick);
    }
}
