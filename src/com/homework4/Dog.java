package com.homework4;

public class Dog extends Animal {
private String name;
private static int counter;

    {
        counter++;
    }

    public Dog(String name) {
        this.name = name;
    }

    static void getCounter(){
        System.out.println(counter+" dogs created.");
    }

    @Override
    public void run(int lengthOfObstacle) {
        if (lengthOfObstacle < 0 || lengthOfObstacle > 500) {
            System.out.println("For dogs running distance limit is between 0 and 500!");
        } else {
            System.out.println(name + " ran " + lengthOfObstacle + " meters.");
        }
    }

        @Override
       public void swim ( int lengthOfObstacle){
            if (lengthOfObstacle <0 || lengthOfObstacle >10) {
                System.out.println("For dogs swimming distance limit is between 0 and 10!");
            } else {
                System.out.println(name + " swam " + lengthOfObstacle + " meters.");
            }
        }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}