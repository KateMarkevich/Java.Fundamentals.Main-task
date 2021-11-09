package com.company;

import java.util.Arrays;

public class ThirdTask {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        double[] randomNumberArray = new double[a];

        for (int i = 0; i < randomNumberArray.length; i++) {
            randomNumberArray[i] = Math.random();
            System.out.println(randomNumberArray[i]);
        }
        for (int i = 0; i < randomNumberArray.length; i++) {
            randomNumberArray[i] = Math.random();
            System.out.print(" " + randomNumberArray[i]);
        }
    }
}
