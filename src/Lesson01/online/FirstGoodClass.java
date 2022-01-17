package Lesson01.online;

//one-line comment

/*
multi
line
comment
 */

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 13.01.2022
 */

public class FirstGoodClass {

    public static void main(String[] args) {
//        System.out.print("Hello world 1");
//        System.out.println("Hello world 2");
//        System.out.print("Hello Java");

        //целые числа
//        byte myByte = 13; //1 byte <-128..+127>
//        short myShort = 130; //2 byte <-32768..+32767>
//        int myInteger = 50000; //4 byte <-2.1mlrd..+2.1mlrd> DEFAULT
//        long myLong = 5000000000L; //8 byte <-2^63 .. +2^63>
//
//        //числа с точкой
//        double myDouble = 13.13; //8 byte <>.00000000000000 DEFAULT
//        float myFloat = 13.13f; //4 byte <>.0000000
//
//        //символы
//        char myChar = '@'; // 2 byte
//
//        //логика
//        boolean myBooleanTrue = true;
//        boolean myBooleanFalse = false;
//
//        //Строки (не ПРИМИТИВ!!!!!)
//        String myString = "myString123";
//
//        System.out.println(myByte);
//        System.out.println(myBooleanTrue);
//
//        //конкатенация
//        System.out.println(myFloat + myString);
//        System.out.println(myString + (myShort + myByte));
//
//        //математические операции
//        //+,-,*,/,^

//        int abc = 17;

//        if (abc > 15) {
//            System.out.println("abc > 15! All good");
//        } else {
//            System.out.println("All bad");
//        }

//        if (abc > 15) {
//            System.out.println("abc > 15! All good");
//        }

//        if (abc > 15) {
//            System.out.println("abc > 15! All good");
//        } else if (abc == 17) {
//            System.out.println("<>");
//        } else {
//            System.out.println("All bad");
//        }

//        goToShop1();
//        System.out.println("****");
//
//        goToShop2("bread", 100);
//        System.out.println("****");
//        goToShop2("milk", 500);
//        System.out.println("****");
//        goToShop2("potato", 100);

//        int myHomeCubishkaCash = goToShop3();
//        System.out.println(myHomeCubishkaCash);

        greetingsUser("Good day","Alex");
        greetingsUser("Good night", "Boris");
    }

//    public static void goToShop1() {
//        System.out.println("Go out home");
//        System.out.println("Go to shop");
//        System.out.println("Choose any goods");
//        System.out.println("Buy this goods");
//        System.out.println("Go to apteka");
//        System.out.println("Go to home");
//    }
//
//    public static void goToShop2(String goods, int cash) {
//        System.out.println("Get cash " + cash);
//        System.out.println("Go out home");
//        System.out.println("Go to shop");
//        System.out.println("Choose any " + goods); //milk, potato
//        System.out.println("Buy this goods");
//        System.out.println("Go to apteka");
//        System.out.println("Go to home");
//    }
//
//    public static int goToShop3() {
//        int cash = 1000;
//        System.out.println("Go out home");
//        System.out.println("Go to shop");
//        System.out.println("Choose any goods");
//        System.out.println("Buy this goods");
//        cash = cash - 150;
//        System.out.println("Go to home");
//        return cash;
//    }

    public static void greetingsUser(String time, String userName) {
        System.out.println(time + " user, " + userName);
    }


}
