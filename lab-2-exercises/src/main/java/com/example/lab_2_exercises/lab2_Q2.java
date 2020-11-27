package com.example.lab_2_exercises;

import java.util.ArrayList;
import java.util.List;


// 2) Write a Java program to create a new array list, add some colors (string) and print out the collection.

public class lab2_Q2
{
    public static void main(String[] args)
    {
        // make the list and add some colors to it
        List<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Grey");
        colors.add("White");

        // print out the list elements
        for (String color: colors)
        {
            System.out.println(color);
        }
    }
}
