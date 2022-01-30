package Homework4;

import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {
    public static char[][] field;
    public static int fieldWidth;
    public static int fieldHeight;

    public static char playerOne = 'X';
    public static char playerTwo = 'O';
    public static char empty = '_';

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        do {createField();
        } while ((fieldWidth < 4)); // если нужен универсальный способ, то 4 заменить на 3

        showField();
        while(true) {
            stepPlayerOne();
            showField();

            if (checkWinLine(playerOne)) {
                System.out.println(playerOne + " is win!");
                break;
            }

            if (checkFullField()) {
                System.out.println("Sorry, game draw");
                break;
            }

            stepPlayerTwo();
            showField();

            if (checkWinLine(playerTwo)) {
                System.out.println(playerTwo + " is win!");
                break;
            }

            if (checkFullField()) {
                System.out.println("Sorry, game draw");
                break;
            }
        }
        System.out.println("Game over!");


    }

    public static void createField() {
        fieldWidth = inputUserValue("Enter size field (from 4)"); //для конкретной программы, где число победных ходов 4. Если нужен универсальный способ, то 4 заменить на 3
        fieldHeight = fieldWidth;
        if (fieldWidth < 4) { // если нужен универсальный способ, то 4 заменить на 3
            System.out.println("Field size cannot be less than 4x4. Enter size field again."); // если нужен универсальный способ, то 4 заменить на 3
        }
        field = new char[fieldHeight][fieldWidth];

        for (int y = 0; y < fieldHeight; y++) {
            for (int x = 0; x < fieldWidth; x++) {
                field[y][x] = empty;
            }
        }
    }

    public static void showField() {
        for (int y = 0; y < fieldHeight; y++) {
            for (int x = 0; x < fieldWidth; x++) {
                System.out.print(field[y][x] + "|");
            }
            System.out.println();
        }
        System.out.println("----------");
    }

    public static void stepPlayerOne() {

        int x;
        int y;

        do {
            x = inputUserValue("Enter your X-coordinate") - 1;
            y = inputUserValue("Enter your Y-coordinate") - 1;
            if (!checkStepPlayer(y, x) || !checkCellFree(y, x)){
                System.out.println("Try again (the cell is occupied or out of bounds)");
            }
        } while (!checkStepPlayer(y, x) || !checkCellFree(y, x));

        field[y][x] = playerOne;

    }

    public static void stepPlayerTwo() {
        int x;
        int y;

        do {
            x = random.nextInt(fieldWidth);
            y = random.nextInt(fieldHeight);
        } while (!checkCellFree(y, x));

        field[y][x] = playerTwo;

    }

    public static boolean checkCellFree(int y, int x) {
        return field[y][x] == empty;
    }

    public static boolean checkStepPlayer(int y, int x) {
        return x >= 0 && x < fieldWidth && y >= 0 && y < fieldHeight;
    }

    public static int inputUserValue(String systemMsg) {
        System.out.print(systemMsg + " > ");
        return scanner.nextInt();
    }

    public static boolean checkWinLine(char playerChar) {
        //  if (field[0][0] == playerChar && field[0][1] == playerChar && field[0][2] == playerChar) return true;
        //  if (field[1][0] == playerChar && field[1][1] == playerChar && field[1][2] == playerChar) return true;
        // if (field[2][0] == playerChar && field[2][1] == playerChar && field[2][2] == playerChar) return true;

        int counter=0;
        for(int i=0; i<fieldWidth;i++) {
            for (int j = 0; j < fieldHeight; j++) {
                if (field[i][j] == playerChar) {
                    counter = counter + 1;
                }

            }
          //  if (counter != fieldWidth){counter =0;} else return true; // универсальный вариант для первого задания
            if (counter != 4){counter =0;} else return true; // серия побед до 4
        }


        //  if (field[0][0] == playerChar && field[1][0] == playerChar && field[2][0] == playerChar) return true;
        //  if (field[0][1] == playerChar && field[1][1] == playerChar && field[2][1] == playerChar) return true;
        //   if (field[0][2] == playerChar && field[1][2] == playerChar && field[2][2] == playerChar) return true;


        for(int i=0; i<fieldWidth;i++) {
            for (int j = 0; j < fieldHeight; j++) {
                if (field[j][i] == playerChar) {
                    counter = counter + 1;
                }

            }
            //if (counter != fieldWidth){counter =0;} else return true; // универсальный вариант для первого задания
            if (counter != 4){counter =0;} else return true; // серия побед до 4
        }

//   if (field[0][0] == playerChar && field[1][1] == playerChar && field[2][2] == playerChar) return true;

        for(int i=0; i<fieldWidth;i++) {
            for (int j = 0; j < fieldHeight; j++) {
                if (field[j][j] == playerChar) {
                    counter = counter + 1;
                }

            }
           // if (counter != fieldWidth){counter =0;} else return true; // универсальный вариант для первого задания
            if (counter != 4){counter =0;} else return true; // серия побед до 4
        }

        //   if (field[0][2] == playerChar && field[1][1] == playerChar && field[2][0] == playerChar) return true;


        for(int i=0; i<fieldWidth;i++) {
            for (int j = 0; j < fieldHeight; j++) {
                if (field[j][(fieldHeight-1)-j] == playerChar) {
                    counter = counter + 1;
                }

            }
            //if (counter != fieldWidth){counter =0;} else return true; // универсальный вариант для первого задания
            if (counter != 4){counter =0;} else return true; // серия побед до 4
        }

        return false;
    }

    public static boolean checkFullField() {
        for (int y = 0; y < fieldHeight; y++) {
            for (int x = 0; x < fieldWidth; x++) {
                if (field[y][x] == empty) {
                    return false;
                }
            }
        }
        return true;
    }
}
