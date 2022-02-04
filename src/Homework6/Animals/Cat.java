package Homework6.Animals;

import Homework6.View.Animal;

public class Cat extends Animal {
    public Cat(String name, int runLimit, int swimLimit) {
        super(name, runLimit, swimLimit);
    }

    @Override
    public void swim(int obstacleLength) {
        System.out.println(name + " doesn't swim");
    }
}
