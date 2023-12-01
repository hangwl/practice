package org.untitled;

public class Loops {

    private static String courses[] = {"UNIX", "SQL", "Java", "Python", "Web Apps"};
    private static void displayCourses() {

        for (String course : courses) { // for each
            System.out.println(course);
        }

    }

    private static void displayNumbersToAMillion() {
        for (int i=0; i<=1000000; i++) { // for loop
            System.out.println(i);
        }
    }

    private static void displayAlphabetLetters() {
        char letter = 'a';
        while (letter <= 'z') { // while loop
            System.out.println(letter);
            letter++;
        }

    }

    public static void doAll() {
        displayCourses();
        displayNumbersToAMillion();
        displayAlphabetLetters();
    }

}
