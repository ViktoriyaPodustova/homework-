package Lesson06.online.units;

import Lesson06.online.models.Unit;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 31.01.2022
 */

public class Warrior extends Unit {

    protected int power;
//    private String name;

    public Warrior(int health, int power, String name, int speed) {
        super(health, name, speed);
        this.power = power;
    }

    public Warrior(String name) {
        super(name);
    }


    public void attack() {
        System.out.println(name + " has attack with " + power * 15 + " points");
    }

    @Override
    public void jump() {
        System.out.println(name + " jump");
    }

}
