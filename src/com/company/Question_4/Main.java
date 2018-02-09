package com.company.Question_4;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /*
        1. In this main method initialize a List as an ArrayList.
        Add 6 values of your choosing to this ArrayList.
        2. Create a new method in this class called displayArray that takes a List parameter.
        3. Have this new method use a ForEach loop to iterate through the ArrayList and display each item to the user.
         */


        List<String> person = new ArrayList<String>();
        addList(person);
        displayArray(person);



    }

    public static void displayArray(List<String> person) {

        System.out.println("Your list of 6 names:\n");

        for (String s : person) {
            System.out.println(s);
        }
    }

    public static void addList(List<String> person) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Add 6 names to our list");

        for (int i = 0; i < 6; i++){
            person.add(scan.nextLine());
        }
    }
}
