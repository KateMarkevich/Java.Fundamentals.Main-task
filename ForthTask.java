package com.company;

public class ForthTask {
    public static void main(String[] args) {
        int sum=0;
        int a=0;
        for (int i =0; i<args.length; i++) {
            a = Integer.parseInt(args[i]);
            sum += a;
        }
        System.out.println(sum);
    }
}