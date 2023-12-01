package org.untitled;

public class Wrappers {

    public static void convertStringsToInt() {
        String number1 = "5";
        String number2 = "3";
        int result = Integer.parseInt(number1) + Integer.parseInt(number2);
        System.out.println(result);
    }

    public static void convertStringsToDoubles() {
        String number1 = "5.3";
        String number2 = "3.2";
        double result = Double.parseDouble(number1) + Double.parseDouble(number2);
        System.out.println(result);
    }

    public static void extractNumbersFromStrings() {
        String string1 = "abc11";
        String string2 = "9xyz";
        String string3 = "abc7xyz";

        // Extract numbers from strings
        int num1 = Integer.parseInt(string1.replaceAll("\\D+", ""));
        int num2 = Integer.parseInt(string2.replaceAll("\\D+", ""));
        int num3 = Integer.parseInt(string3.replaceAll("\\D+", ""));

        System.out.println(num1 + num2 + num3);

    }


}
