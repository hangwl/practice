package org.untitled;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraysAndLists {

    // ARRAYS
    private static final String[] bestFriends = {
            "David",
            "Bob",
            "Charles",
            "Adam",
            "Ethan"
    };

    private static void displayFriendCount() {
        System.out.println(bestFriends.length);
    }

    private static void printFriendNames() {
        for (String name : bestFriends) {
            System.out.println(name);
        }
    }

    private static void replaceFriend(int index, String newFriend) {
        if (index >= 0 && index < bestFriends.length) {
            bestFriends[index] = newFriend;
        } else {
            System.out.println("Invalid index");
        }
    }

    private static void sortArray() {
        Arrays.sort(bestFriends);
    }

    private static void displayFriend(int index) {
        if (index >= 0 && index < bestFriends.length) {
            System.out.println(bestFriends[index]);
        } else {
            System.out.println("Invalid index");
        }
    }

    public static void doSection_1() {
        displayFriendCount();
        printFriendNames();
        replaceFriend(4, "Eason"); // Replacing fifth friend
        sortArray();
        displayFriend(0); // Displaying first friend
        displayFriend(bestFriends.length - 1); // Displaying last friend
        replaceFriend(1, null);
    }

    // ARRAYLISTS
    private static final ArrayList<String> shoppingBasket = new ArrayList<>();

    private static void addItems(String... items) {
        shoppingBasket.addAll(Arrays.asList(items));
    }

    private static void displayBasketSize() {
        System.out.println(shoppingBasket.size());
    }

    private static void displayItem(int index) {
        System.out.println(shoppingBasket.get(index));
    }

    private static void removeItem(String item) {
        shoppingBasket.remove(item);
    }

    private static void removeItem(int itemIndex) {
        shoppingBasket.remove(itemIndex);
    }

    private static void sortBasket() {
        Collections.sort(shoppingBasket);
    }

    private static void displayBasketItems() {
        for (String item : shoppingBasket) {
            System.out.println(item);
        }
    }

    public static void doSection_2_1() {
        addItems("milk", "cereals", "apples", "oranges", "bread");
        displayBasketSize();
        displayItem(0);
        displayItem(4);
        removeItem("bread");
        displayBasketSize();
        removeItem(3);
        displayBasketItems();
        addItems("potatoes", "olive oil", "chicken");
        sortBasket();
        displayItem(0);
        displayItem(shoppingBasket.size()-1);
    }

    private static final ArrayList<Integer> salaries = new ArrayList<>();

    private static void addSalaries(int... newSalaries) {
        for (int salary : newSalaries) {
            salaries.add(salary);
        }
    }

    private static void displayHighestSalary() {
        System.out.println(Collections.max(salaries));
    }

    private static void displayLowestSalary() {
        System.out.println(Collections.min(salaries));
    }

    private static void displayNumberOfPeopleEarning(int salary) {
        int count = Collections.frequency(salaries, salary);
        System.out.println(count);
    }

    private static void sortSalaries() {
        Collections.sort(salaries);
    }

    private static void displayMedianSalary() {
        Collections.sort(salaries);

        if (salaries.isEmpty()) {
            System.out.println("No salaries available.");
            return;
        }

        int size = salaries.size();
        double median;
        if (size % 2 == 0) {
            // Average of the two middle numbers for an even-sized list
            median = (salaries.get(size / 2 - 1) + salaries.get(size / 2)) / 2.0;
        } else {
            // Middle number for an odd-sized list
            median = salaries.get(size / 2);
        }

        System.out.println(median);
    }

    private static void reverseSortSalaries() {
        Collections.reverse(salaries);
    }

    private static void displaySalaryAtIndex(int index) {
        System.out.println(salaries.get(index));
    }

    public static void doSection_2_2() {
        addSalaries(75000, 25000, 42000, 30000, 55000, 42000, 39000);
        displayHighestSalary();
        displayLowestSalary();
        displayNumberOfPeopleEarning(42000);
        sortSalaries();
        displayMedianSalary();
        reverseSortSalaries();
        displaySalaryAtIndex(0);
        displaySalaryAtIndex(salaries.size()-1);
    }

}
