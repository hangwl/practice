package org.untitled;


import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Conditionals {

    private static List<String> colours = Arrays.asList("green", "yellow", "red");

    private static String randomColour() {
        Random random = new Random();
        int randomIndex = random.nextInt(colours.size());
        return colours.get(randomIndex);
    }

    private static void checkIfColourIsGreen(String alienColour) {
        if (alienColour.equals("green")) {
            System.out.println("Player earns 5 points!");
        } else if (alienColour.equals("red")) {
            System.out.println("Player earns 10 points!");
        } else if (alienColour.equals("yellow")) {
            System.out.println("Player earns 15 points!");
        } else {
            System.out.println("Invalid colour?!");
        }
    }

    public static void doSection_1() {
        String alienColour = randomColour();
        checkIfColourIsGreen(alienColour);
    }


}
