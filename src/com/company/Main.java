package com.company;

import java.util.Random;

public class Main {

    static Random random = new Random();

    public static void main(String[] args) {

        int[] array = createAnArray(5, 15);

        array = fillArrayWithRandomNumbers(array, 100);

        printElementsOfArray(array);
        System.out.println();

        int[] arr = createAnArray(5, 10);

        arr = fillArrayWithRandomNumbers(arr, 100);

        printElementsOfArray(arr);

        int[] mergedArray = mergeTwoIntArray(array, arr);

        printElementsOfArray(mergedArray);



    }

    static int[] createAnArray(int originLength, int boundLength) {
        return new int[random.nextInt(originLength, boundLength)];
    }


    static int[] mergeTwoIntArray(int[] array1, int[] array2) {

        int[] all = new int[array1.length + array2.length];

        int counterForArray1 = 0;
        int counterForArray2 = 0;

        for (int i = 0; i < all.length; i++) {
            if (counterForArray1 < array1.length) {
                all[i] = array1[counterForArray1];
                counterForArray1++;
            } else {
                all[i] = array2[counterForArray2];
                counterForArray2++;
            }
        }
        return all;
    }

    static int[] fillArrayWithRandomNumbers(int[] array, int bound) {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(bound);
        }
        return array;
    }

    static void printElementsOfArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
