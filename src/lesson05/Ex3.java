package lesson05;

import java.util.Arrays;
import java.util.Random;

public class Ex3 {

    public static void main(String[] args) {
        int n = 10;
        int m = 4;
        int[][] mass = new int[n][m];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = new Random().nextInt(100);
            }
            System.out.println(Arrays.toString(mass[i]));
        }
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                arr1[i] += mass[i][j];
                arr2[j] += mass[i][j];
            }
            System.out.print("");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
