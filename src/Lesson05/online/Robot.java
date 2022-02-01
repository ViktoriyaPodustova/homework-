package Lesson05.online;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 27.01.2022
 */

public class Robot {

    public static int abc = 15;

    private String name;
    private float speed;
    private String color;
    private int countHands;
    private int height;
    private Weapon laser = new Weapon();

    public Robot() {
//        System.out.println("I'm constructor");
//        speak();
    }

    public Robot(String data) {
//        System.out.println("Your data is " + data);
    }

    public Robot(String name,
                 float speed,
                 String color,
                 int countHands,
                 int height) {
        this.name = name;
        this.speed = speed;
        this.color = color;
        this.countHands = countHands;
        this.height = height;
    }

    public static void doSomething() {
        System.out.println("Hello");
    }

    private void speak() {
        System.out.println(name + " says something");
    }

    protected void run() {
        speak();
        System.out.println(name + " run with speed " + speed);
    }

    void repair() {
        System.out.println(name + " repair something with self " + countHands + " hand(-s)");
    }

    int sumDigits(int a, int b) {
        return a + b;
    }

    //Getter
    public String getName() {
        return name;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }

//    public class Weapon {
//        int weight;
//        int damage;
//        String name;
//        Bullet bullet;
//
//        void fire() {
//            System.out.println(name + " get damage is " + damage);
//        }
//
//        public class Bullet {
//
//        }
//    }
}
