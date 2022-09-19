package lesson04;

import java.util.Arrays;
import java.util.Random;

public class Ex8 {

    public static void main(String[] args) {
        int[] array = new int[15];
        // генерация массива
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(100);
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if((i == 0 || array[i]>array[i-1]) && (i == array.length-1 || array[i]>array[i+1]))
                System.out.print(array[i]+" ");
        }

    }
}
