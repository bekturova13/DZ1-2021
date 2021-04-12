package com.company;

public class Main {

    public static void main(String[] args) {

        String someRandomWords;
        final int NUM = 15;
        String word = "any word";
        someRandomWords = NUM + word;
        System.out.println(NUM + " " + word + " " + someRandomWords);
        if (NUM < 0)
            System.out.println("You have saved a negative number ");
        if (NUM > 0)
            System.out.println("You have saved a positive number");
        else System.out.println("You have saved zero");

    }

}
