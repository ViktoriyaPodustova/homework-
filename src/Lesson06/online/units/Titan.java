package Lesson06.online.units;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 31.01.2022
 */

public class Titan extends Warrior {

    public Titan(int health, int power, String name, int speed) {
        super(health, power, name, speed);
    }

    @Override
    public void speak() {
        System.out.println(name + " don't speak");
    }

}
