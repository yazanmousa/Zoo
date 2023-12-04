package com.ing.zoo;

import java.util.Random;

public class Pig extends Animal implements Herbivore, Carnivore, Magician{

    public String trick;

    public Pig(String name, String helloText) {
        super(name, helloText);
    }

    @Override
    public void eatLeaves() {
        eatText = "munch munch oink";
        System.out.println(eatText);
    }

    @Override
    public void eatMeat() {
        eatText = "nomnomnom oink thx";
        System.out.println(eatText);
    }
    @Override
    public void performTrick() {
        //Generates random number
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            trick = "rolls in the mud";
        } else {
            trick = "runs in circles";
        }
        System.out.println(trick);
    }

}
