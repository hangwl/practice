package org.untitled;

public class Datatypes {

    public static void doAll() {
        Datatypes.doStrings();
        Datatypes.doPrimitives();
        Datatypes.doChars();
        Datatypes.doWrappers();
    }


    public static void doStrings() {
        Strings.displaySimpleMessage();
        Strings.displayFullName();
        Strings.displayNameDetails();
        Strings.displaySentenceOperations();
    }

    public static void doPrimitives() {
        Primitives.displayFavouriteNumber();
        Primitives.addTwoInts(5, 3);
        Primitives.arithmeticOps();
        Primitives.divisionOps();
    }

    public static void doChars() {
        Chars.unicodeNums();
        Chars.lettersDiff();
        Chars.addCharsAndStrings();
    }

    public static void doWrappers() {
        Wrappers.convertStringsToInt();
        Wrappers.convertStringsToDoubles();
        Wrappers.extractNumbersFromStrings();
    }

}
