package com.homework4;

public class Cat extends Animal {
    private static int catCounter;

    public Cat(String name) {
        super(name);
        catCounter++;
    }

    // counter for number of cats
    public static void getCounter() {
        System.out.println(catCounter + " cats created.");
    }

    //run method for cats
    @Override
    public void run(int lengthOfObstacle) {
        if (lengthOfObstacle < 0 || lengthOfObstacle > 200) {
            System.out.println("For cats running distance limit is  between 0 and 200!");
        } else {
            System.out.println(name + " ran " + lengthOfObstacle + " meters.");
        }
    }

    //swim method for cats
    @Override
    public void swim(int lengthOfObstacle) {
        System.out.println("Sorry, cats can't swim!");
    }
}
