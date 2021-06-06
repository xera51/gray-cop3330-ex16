/*
 *  UCF COP3330 Summer 2021 Exercise 16 Solution
 *  Copyright 2021 Christopher Gray
 */
package base;

import java.util.Scanner;

public class App {

    static Scanner in = new Scanner(System.in);
    static final int LEGAL_DRIVING_AGE = 16;
    static final String OLD_ENOUGH_MESSAGE = "You are old enough to legally drive.";
    static final String NOT_OLD_ENOUGH_MESSAGE = "You are not old enough to legally drive.";

    public static void main(String[] args) {
        App myApp = new App();

        int age = myApp.readAge();
        isOldEnough(age);
    }

    public int readAge() {
        System.out.print("What is your age? ");
        return Integer.parseInt(in.nextLine());
    }

    public static void isOldEnough(int age) {
        String output = (age >= LEGAL_DRIVING_AGE) ?
                OLD_ENOUGH_MESSAGE : NOT_OLD_ENOUGH_MESSAGE;
        System.out.println(output);
    }
}
