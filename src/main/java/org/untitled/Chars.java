package org.untitled;

public class Chars {

    public static void unicodeNums() {

        char letter = 'a';
        int code = 98;

        System.out.println((int) letter);
        System.out.println((char) code);
        System.out.println((char) 36);

    }

    public static void lettersDiff() {
        System.out.println((char) 'c' - (char) 'a');
        System.out.println((char) 'z' - (char) 'a');
    }

    public static void addCharsAndStrings() {
        char char1 = 'x';
        char char2 = 'y';
        char char3 = 'z';
        String string1 = "z";
        String string2 = "y";

        System.out.println(char1 + char2 + char3); // 363
        System.out.println(char1 + char2 + string2); //241y
        System.out.println(char1 + string1 + char3); //xzz

    }

}
