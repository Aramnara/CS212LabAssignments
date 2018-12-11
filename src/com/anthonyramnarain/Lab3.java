package com.anthonyramnarain;

/*
Problem 1:

        1. Create an array of integers called aRand of capacity 20.

        2. Populate the array in a method called populateArray(int[] array) where array is the one you just created. This method returns void.

        3. Write a method called calculateAverage(int[] array), which returns the average of the sum of the elements in the array. It should return a double.

        4. Write a method called printArray(int[] array) which prints the data.

        5. Write a method to sort the the array you created using selection sort. This method returns a void.

        6. Print the average, the unsorted array you created and the sorted array.

        Problem 2:

        1. Create an array of Strings called words. Use the following Strings to create the array: dawn, dusk, morning, evening, park, meet, at, flower, sun, moon

        2. Ask user to enter a string.

        3. Check if the user entered String is in the array you created.

        4. Use JOptionPane to get the input from the user and to print the output.

        5. You need to import javax.swing.JOptionPane;

        6. You need to use String str = JOptionPane.showInputDialog(”Enter a word”); to ask for a string.

        7. You will see a pop up window for a user to enter the data. After that you need to click ok for it to continue.

        8. You should write a full sentence to make tell whether the String is in the array. For this use

        9. JOptionPane.showMessageDialog(null, String - message);
*/

import javax.swing.*;
import java.util.Random;

public class Lab3 {

    //method to populate array
    static void populateArray(int[] array) {

        Random r = new Random();

        for (int i = 0; i < array.length; i++) {

            array[i] = r.nextInt() % 100;

            if (array[i] < 0) array[i] = array[i] * -1;

        }

    }

//method to calculate average

    static double calculateAverage(int[] array) {

        double sum = 0;

        for (int i = 0; i < array.length; i++) {

            sum = sum + (double) array[i];


        }

        return sum / array.length;//returning average

    }


//method to print array

    static void printArray(int[] array) {


        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");


        }

        System.out.println();

    }

//selection sort

    static void selectionsort(int array[]) {

        int n = array.length;


        for (int i = 0; i < n - 1; i++) {


            int min_idx = i;

            for (int j = i + 1; j < n; j++)

                if (array[j] < array[min_idx])

                    min_idx = j;


            int temp = array[min_idx];

            array[min_idx] = array[i];

            array[i] = temp;

        }

    }

    public static void main(String[] args) {


        //creating array of integers with capacity 20

        int aRand[] = new int[20];

        populateArray(aRand);

        double av = calculateAverage(aRand);//finding average


        System.out.println("Array before sorting :");

        printArray(aRand);

        System.out.println("Average :" + av);

        //sorting

        selectionsort(aRand);

        System.out.println("Array after sorting :");

        printArray(aRand);

        System.out.println("Average :" + av);

        String ar[] = {"dawn", "dusk", "morning", "evening", "park", "meet", "at", "flower", "sun", "moon"};

        String str = JOptionPane.showInputDialog("Enter a word");//asking usert to enter string

        //searching in array
        int i;
        for (i = 0; i < ar.length; i++) {
            if (ar[i].equals(str))
                break;

        }
        if (i == ar.length)
            str = str + " Not found";
        else
            str = str + " Found at index " + i;

        JOptionPane.showMessageDialog(null, str);
    }

}