package lesson03;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        //1
        if (x > y) {
            if (x > z) {
                System.out.println(x);
            } else {
                System.out.println(z);
            }
        } else {
            if (y > z) {
                System.out.println(y);
            } else {
                System.out.println(z);
            }
        }

        //2
        if (x >= y && x >= z) {
            System.out.println(x);
        } else if (y >= x && y >= z) {
            System.out.println(y);
        } else {
            System.out.println(z);
        }

        //3
        System.out.println(Math.max(Math.max(x, y), z));
    }
}
