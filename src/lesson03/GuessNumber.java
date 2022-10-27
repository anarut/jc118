package lesson03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        int n = (int) (Math.random() * 100 + 1);
        guessNumber(n);
    }

    public static void guessNumber(int n) {
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int x = -1;
        try {
            x = scanner.nextInt();
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("не корректное число! Попробуйте снова");
            guessNumber(n);
        } catch (RuntimeException e) {
            //todo: попытаться снова
        } catch (Exception e) {
            //todo: завершить программу
        }

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
