package com.ing.zoo;

import java.util.Random;

public class Tiger extends Animal implements Carnivore, Magician {

    public String trick;

    public Tiger(String name, String helloText) {
        super(name, helloText);
    }

    @Override
    public void eatMeat() {
        eatText = "nomnomnom oink wubalubadubdub";
        System.out.println(eatText);
    }


    @Override
    public void performTrick() {

    }
}
