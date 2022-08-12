package com.homework4;

public abstract class Animal {
    protected String name;
    private static int animalCounter;

    public Animal(String name) {
        this.name = name;
        animalCounter++;
    }

    // counter for number of animals
    public static void getCounter() {
        System.out.println(animalCounter + " animals created.");
    }

    //run method
    public abstract void run(int lengthOfObstacle);

    //swim method
    public abstract void swim(int lengthOfObstacle);
}
