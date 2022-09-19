package lesson04;

import java.util.Random;

public class Ex6 {

    public static void main(String[] args) {
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int min = array[1];
        for (int i = 1; i < array.length; i += 2) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println(min);
    }
}
