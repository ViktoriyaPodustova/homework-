
package Homework1;

public class HomeWorkApp {
    public static void main (String[] args) {
        printLine("----------");
        printThreeWords("Orange");
        printThreeWords("Banana");
        printThreeWords("Apple");
        printLine("----------");
        checkSumSign ();
        printLine("----------");
        printColor();
        printLine("----------");
        compareNumbers();
        printLine("----------");
    }
    public static void printThreeWords(String word){
        System.out.println(word);
    }

    public static void printLine(String line) {
        System.out.println(line);
    }
    public static void checkSumSign() {
        int a = -3;
        int b = 15;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() {
       int value=-100;
       if (value<= 0) {
           System.out.println("Красный");
       }
       if (value>0 & value<=100) {
           System.out.println("Желтый");
       }
       if(value>100) {
           System.out.println("Зеленый");
       }
    }
    public static void compareNumbers() {
        int a=48;
        int b=48;
        if (a>=b) {
            System.out.println("a>=b");
        }
        else {
            System.out.println("a<b");
        }
    }
}
