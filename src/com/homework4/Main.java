package com.homework4;

public class Main {

    public static void main(String[] args) {
        Animal catBarsik = new Cat("Barsik");
        Animal dogSharik = new Dog("Sharik");
        Animal dogMuhtar = new Dog("Muhtar");
        Animal catMurzik = new Cat("Murzik");
        Animal catMyrka = new Cat("Myrka");
        Animal dogPatron = new Dog("Patron");

        Cat.getCounter();
        Dog.getCounter();
        Animal.getCounter();

        catBarsik.run(205);
        catMyrka.run(150);
        dogSharik.run(505);
        dogPatron.run(450);

        catBarsik.swim(10);
        dogSharik.swim(15);
        dogPatron.swim(9);
    }
}

