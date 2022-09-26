package lesson05;

import java.util.Arrays;

public class Ex2 {

    public static void main(String[] args) {
        int[] a = new int[100];
        System.out.println(Arrays.toString(a));
        Arrays.fill(a, 5);
        System.out.println(Arrays.toString(a));
        Arrays.fill(a, 15, 45, 61);
        System.out.println(Arrays.toString(a));
        Arrays.fill(a, 45, 55, 61);
    }
}
