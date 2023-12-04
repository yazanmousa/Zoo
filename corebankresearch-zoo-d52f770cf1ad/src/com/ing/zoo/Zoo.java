package com.ing.zoo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        Map<String, Animal> animalMap = createAnimalMap();

        String[] commands = {"hello", "give leaves", "give meat", "perform trick"};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your command: ");
        String input = scanner.nextLine();

        boolean commandSuccessful = processCommand(input, commands, animalMap);

        if (!commandSuccessful) {
            System.out.println("Unknown command: " + input);
        }
    }

    private static Map<String, Animal> createAnimalMap() {
        Map<String, Animal> animalMap = new HashMap<>();
        animalMap.put("henk", new Lion("henk", "roooaoaaaaar"));
        animalMap.put("elsa", new Hippo("elsa", "splash"));
        animalMap.put("dora", new Pig("dora", "splash"));
        animalMap.put("wally", new Tiger("wally", "rraaarww"));
        animalMap.put("marty", new Zebra("marty", "zebra zebra"));
        animalMap.put("mike", new Liger("mike", "hi liger"));
        animalMap.put("hans", new Elephant("hans", "woooow"));
        animalMap.put("omar", new Cheetah("omar", "i am fast"));

        return animalMap;
    }

    private static boolean processCommand(String input, String[] commands, Map<String, Animal> animalMap) {
        boolean commandSuccessful = false;

        for (Animal animal : animalMap.values()) {
            if (input.equals(commands[0])) {
                animal.sayHello();
                commandSuccessful = true;
            } else if (input.equals(commands[0] + " " + animal.getName())) {
                animal.sayHello();
                commandSuccessful = true;
            } else if (input.equals(commands[1]) && animal instanceof Herbivore) {
                ((Herbivore) animal).eatLeaves();
                commandSuccessful = true;
            } else if (input.equals(commands[2]) && animal instanceof Carnivore) {
                ((Carnivore) animal).eatMeat();
                commandSuccessful = true;
            } else if (input.equals(commands[3]) && animal instanceof Magician) {
                ((Magician) animal).performTrick();
                commandSuccessful = true;
            }
        }
        return commandSuccessful;
    }
}
