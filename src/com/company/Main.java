package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(5,10);
        int[] array = new int[a];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        for (int b: array) {
            System.out.print(b + " ");
        }
        System.out.println();

        int g = random.nextInt(5,10);
        int[] arr = new int[g];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        for (int p: arr) {

        }
        int[] all = new int[array.length + arr.length];
        for (int alls: all) {
            
        }
    }
}
