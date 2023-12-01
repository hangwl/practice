package org.untitled;

public class Strings {

    public static void displaySimpleMessage() {
        String message = "Hello World!";
        System.out.println(message);
    }

    public static void displayFullName() {
        String firstName = "HangWei";
        String lastName = "Low";
        String fullName = firstName + ' ' + lastName;

        System.out.println(fullName);
    }

    public static void displayNameDetails() {
        String name = "HangWei";
        String nameUpperCase = name.toUpperCase();
        String nameFirstLetter = String.valueOf(name.charAt(0));
        String nameLastLetter = String.valueOf(name.charAt(name.length() - 1));

        System.out.println("Uppercase Name: " + nameUpperCase);
        System.out.println("First Letter of Name: " + nameFirstLetter);
        System.out.println("Last Letter of Name: " + nameLastLetter);
    }

    public static void displaySentenceOperations() {

        String sentence = "this is a sentence";
        System.out.println(sentence.indexOf(' '));
        System.out.println(sentence.lastIndexOf(' '));
        System.out.println(sentence.indexOf('x'));
        System.out.println(sentence.substring(0, 4));
        System.out.println(sentence.substring(10));
        System.out.println(sentence.substring(5, 8));
        System.out.println(sentence.contains("a"));
        System.out.println(sentence.contains("x"));
        sentence = "is " + sentence + "?";
        System.out.println(sentence);
        sentence = sentence.replaceFirst("t", "T");
        System.out.println(sentence);
    }

}
