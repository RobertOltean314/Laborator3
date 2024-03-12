package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List list=new ArrayList<>();
        Random rand = new Random();
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < 15; i++) {
            int randomNum = rand.nextInt(100); // Generate random numbers between 0 to 99
            list.add(randomNum);
        }
        System.out.println(list);
    }
}