package com.ing.zoo;

import java.util.Random;

public class Zebra extends Animal implements Herbivore{
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Zebra(String name, String helloText) {
        super(name, helloText);
    }


    @Override
    public void eatLeaves()
    {
        eatText = "munch munch zank yee bra";
        System.out.println(eatText);
    }
}
