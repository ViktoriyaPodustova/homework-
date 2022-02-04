package Homework6;

import Homework6.Animals.Cat;
import Homework6.Animals.Dog;
import Homework6.View.Animal;

import java.sql.SQLOutput;

public class HomeWork6 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Musya", 200, 0);
        Cat cat2 =new Cat("Barsik", 200, 0);
        Dog dog1 = new Dog("Bim", 500, 10);
        Dog dog2 = new Dog("Gav", 500, 10);
        Dog dog3 = new Dog("Rex", 500, 10);

        Cat[] cats = {cat1, cat2};
        Dog[] dogs = {dog1, dog2, dog3};
        Animal[] animals = {cat1, cat2, dog1, dog2, dog3};

        System.out.println("Total number of cats " + cats.length);
        System.out.println("Total number of dogs " + dogs.length);
        System.out.println("Total number of animals " + animals.length);
        System.out.println("_____________________");
        cat1.run(10);
        cat2.run(200);
        cat1.run(250);
        dog1.run(550);
        dog2.run(500);
        dog3.run(340);
        dog1.run(-5);
        cat1.run(0);
        System.out.println("_____________________");
        dog1.swim(5);
        dog2.swim(15);
        dog3.swim(10);
        cat1.swim(10);
        cat2.swim(4);
        dog1.swim(-5);
        cat1.swim(0);



    }
}
