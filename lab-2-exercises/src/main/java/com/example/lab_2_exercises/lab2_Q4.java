package com.example.lab_2_exercises;


// 4) Write a Java program to test if a given string contains the specified sequence of char values.

public class lab2_Q4
{
    public static void main(String[] args)
    {
        String s1 = "Hello World";
        String s2 = "o World";

        System.out.println(strContains(s1, s2));
    }

    private static Boolean strContains(String string, String substring)
    {
        int string_len = string.length();
        int substring_len = substring.length();
        if (string_len < substring_len)
        {
            return false;
        }


        // "Hello World", "World";

        int j = 0;
        for (int i = 0; i < string_len; i++)
        {
            if (substring.charAt(j) == string.charAt(i))
            {
                j += 1;
            }
            else
            {
                j = 0;
            }
            if (j == substring_len)
            {
                return true;
            }
        }
        return false;
    }
}

