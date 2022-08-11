package com.homework4;

public abstract class Animal {
    private String name;
    private static int counter;

    {
        counter++;
    }

    // counter for number of animals
    public static void getCounter() {
        System.out.println(counter + " animals created.");
    }

    //run method
    public abstract void run(int lengthOfObstacle);

    //swim method
    public abstract void swim(int lengthOfObstacle);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
