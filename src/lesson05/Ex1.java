package lesson05;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        System.out.println("введите n:");
        int n = new Scanner(System.in).nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                // убираем углы
                if (i + j + 1 < n || j - i > n) {
                    System.out.print(" ");
                } else {
                    // рисуем звезды
                    if ((n - 1) % 2 == i % 2) {
                        if (j % 2 == 0) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    } else {
                        if (j % 2 == 0) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}
