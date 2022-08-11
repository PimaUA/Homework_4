package com.homework4;

public class Animal {
private String name;
private static int counter;

    {
        counter++;
    }

    static void getCounter(){
        System.out.println(counter +" animals created.");
    }

    public void run(int lengthOfObstacle){
       System.out.println(name+" ran "+lengthOfObstacle+" meters");
   }

   public void swim(int lengthOfObstacle){
       System.out.println(name+" swam "+lengthOfObstacle+" meters");
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
