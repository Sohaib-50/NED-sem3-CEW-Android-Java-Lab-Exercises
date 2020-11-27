package com.example.lab_2_exercises;


// 3) Write a Java program to remove the third element from the array list.

import java.util.ArrayList;
import java.util.List;

public class lab2_Q3
{
    public static void main(String[] args)
    {
        // make a new list and add items to it
        List<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Grey");
        colors.add("White");

        System.out.println("Original list: " + colors);

        removeThirdElement(colors);
        System.out.println("After removing 3rd element first time: " + colors);

        removeThirdElement(colors);
        System.out.println("After removing 3rd element second time: " +colors);
    }

    private static void removeThirdElement(List lst)
    {
        if (lst.size() >= 3)  // can't remove 3rd element from a list with less than 3 elements
        {
            lst.remove(2);
        }
    }
}
