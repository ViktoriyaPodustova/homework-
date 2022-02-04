package Lesson06.online.units;

import Lesson06.online.models.Unit;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 31.01.2022
 */

public class Archer extends Unit {

    private int power;
    private int dexterity;

    public Archer(int health, String name, int speed, int power, int dexterity) {
        super(health, name, speed);
        this.power = power;
        this.dexterity = dexterity;
    }

    public void attack() {
        System.out.println(name + " has attack with " + (power * (45 + dexterity)) + " points");
    }

    public void escapeFromBattle() {
        if (health < 20) {
            System.out.println(name + " has escape from battle");
        }
    }

    @Override
    public void jump() {
        System.out.println(name + " jump-jump");
    }
}
