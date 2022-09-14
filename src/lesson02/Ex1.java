package lesson02;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите координаты точки A: ");
        int a = scanner.nextInt();
        System.out.print("Введите координаты точки B: ");
        int b = scanner.nextInt();

//        Math.max()
        int c = Math.abs(b - a);
        System.out.println("Длина отрезка AB: " + c);
//        System.out.println(a);
//        System.out.println(b);
    }
}
