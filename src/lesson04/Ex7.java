package lesson04;

import java.util.Arrays;
import java.util.Random;

public class Ex7 {

    public static void main(String[] args) {
        int[] array = new int[15];
        // генерация массива
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(100) - 50;
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // подсчет отрицательных элементов
        int negativesCount = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] < 0) {
                negativesCount++;
            }
        }

        if (negativesCount == 0) {
            System.out.println("Yse norm");
        } else {
            //новая длина равна количеству положительных элементов
            int[] arrayNew = new int[array.length - negativesCount];

            for (int m = 0, p = 0; m < array.length; m++) {
                if (array[m] >= 0) {
                    // p увеличивается только если сохраняем положительный элемент
                    arrayNew[p++] = array[m];
                }
            }
            // заменяем предыдущую ссылку массива на новый массив
            array = arrayNew;
        }

        // вывод
        System.out.println(Arrays.toString(array));
    }
}
