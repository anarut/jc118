package lesson03;

import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        int n = (int) (Math.random() * 100 + 1);
        guessNumber(n);
    }

    public static void guessNumber(int n) {
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x > n) {
            System.out.println("больше. Введите число меньше");
            guessNumber(n);
        } else if (x == n) {
            System.out.println("угадал! молодец");
        } else {
            System.out.println("меньше. Введите число больше");
            guessNumber(n);
        }
    }
}
