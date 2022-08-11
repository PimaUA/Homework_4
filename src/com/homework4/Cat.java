package com.homework4;

public class Cat extends Animal {
    private String name;
    private static int counter;

    {
        counter++;
    }

    public Cat(String name) {
        this.name = name;
    }

    // counter for number of cats
    public static void getCounter() {
        System.out.println(counter + " cats created.");
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

    //getters & setters for name
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
