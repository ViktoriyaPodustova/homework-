package Homework2;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println(sumChek(5, 16));
        System.out.println("______________");
        if(numberCheck1(1)){
            System.out.println("Положительное число");
        }else {
            System.out.println("Отрицательное число");
        }
        System.out.println("______________");
        System.out.println(numberCheck2(-115));
        System.out.println("______________");
        stringOutput("Hello, World!", 3);
        System.out.println("______________");
        System.out.println(yearCheck(100));
    }
        public static boolean sumChek(int a, int b){
            return (a+b>=10 & a+b<= 20);
        }
        public static boolean numberCheck1(int num){
            return num>=0;
        }
        public static boolean numberCheck2(int number){
        return number<0;
    }
    public static void stringOutput(String sentence, int a){
for (int i=0; i<a; i++) {
    System.out.println(sentence);
}
    }
    public static boolean yearCheck(int year){
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }
    }
