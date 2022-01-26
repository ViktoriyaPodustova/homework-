package Homework3;

import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main (String[] args) {
        int [] array1 = {1,0,0,1,1,1,0,0,1};
        printArrayTask1(array1);
        System.out.println("\t");
        changeArrayTask1(array1);
        printArrayTask1(array1);
        System.out.println("\t");
        System.out.println("______________");

        int [] array2 = new int[100];
        fillArrayTask2(array2);
        printArrayTask2(array2);
        System.out.println("\t");
        System.out.println("______________");

        int[] array3 = {1,5,3,2,11,4,5,2,4,8,9,1};
        printArrayTask3(array3);
        System.out.println("\t");
        changeArrayTask3(array3);
        printArrayTask3(array3);
        System.out.println("\t");
        System.out.println("______________");

        int val = 5;
        int[][] array4 = new int[val][val];
        squareArrayTask4(array4);
        printArrayTask4(array4);
        System.out.println("\t");
        System.out.println("______________");

        int[] print= returnArrayTask5(10, 5);
        printArrayTask5(print);
        System.out.println("\t");
        System.out.println("______________");

        int[] array6 = {1,0,3,2,1,4,5,2,8,19,6};
        System.out.println("Минимальное значение массива:"+minNumber(array6));
        System.out.println("Максимальное значение массива:"+maxNumber(array6));
    }
    //________________________________________________
    public static void printArrayTask1(int[] array1 ){

        for(int i=0; i<array1.length; i++) {
            System.out.print(array1[i] + "|");
        }
    }
    public static void changeArrayTask1(int[] array1){
        for(int i=0; i<array1.length; i++) {
            if (array1[i] == 1) { array1[i] =0;
            }
            else {array1[i] =1;}
        }
    }
    //_______________________________________________
    public static void fillArrayTask2(int[] array2) {
        for (int i = 0; i < array2.length; i++) {
            array2[i] = i+1;
        }
    }
    public static void printArrayTask2(int[] array2){
        for(int i=0; i<array2.length; i++) {
            System.out.print(array2[i] + "|");
        }
    }
    //___________________________________________________
    public static void  printArrayTask3(int[] array3) {
        for(int i=0; i<array3.length; i++) {
            System.out.print(array3[i] + "|" + "\t");
        }
    }
    public static void changeArrayTask3(int[] array3){
        for(int i=0; i<array3.length; i++) {
            if (array3[i]<6) {
                array3[i]=array3[i]*2;
            }
        }
    }
    //_________________________________________________
    public static void squareArrayTask4(int[][] array4){
        for(int i=0; i<array4.length; i++){
            for (int j=0; j< array4.length; j++) {
                array4[i][i]=1;
                array4[i][(array4.length-1)-i]=1;
            }
        }
    }
    public static void printArrayTask4(int[][] array4){
        for(int i=0; i<array4.length; i++){
            for (int j=0; j< array4.length; j++) {
                System.out.print(array4[i][j]+ "\t") ;}
            System.out.println();
            }
        }
    //_________________________________________________
    public static int[] returnArrayTask5(int len, int initialValue){
    int [] array5= new int[len];
    for (int i=0; i< len; i++){
        array5[i]=initialValue;
    }
    return array5;
    }

    public static void printArrayTask5(int[] print ){

        for(int i=0; i<print.length; i++) {
            System.out.print(print[i] + "|");
        }
    }
    //_________________________________________________
    public static int minNumber(int[] array6){
        int min=array6[1];
        for(int i=0; i< array6.length; i++){
         if (array6[i]<min){
             min=array6[i];
         }
        }
        return min;
    }
    public static int maxNumber(int[] array6){
        int max=array6[1];
        for(int i=0; i< array6.length; i++){
            if (array6[i]>max){
                max=array6[i];
            }
        }
        return max;
    }
    }

