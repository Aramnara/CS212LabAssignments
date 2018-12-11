package com.anthonyramnarain;

/*Write a generic static method.
        Problem 1: Write a static generic method called insertionSort. The
        method an array of data type <E> return an array of type E. Remember,
        all objects have to of comparable type. Call your class GenericInsertionSort
        without any type parameter. There are only two methods in the class. Both
        are static methods. One is static main(), and the other insertionSort(). Only
        the header line of the method has type parameters. This way, you could
        create all data types that implement Comparable interface (this is hint).
        Test your method with using Integer and String data types*/

import java.util.Arrays;

public class Lab23 {
    public static <T extends Comparable<T>> void insertionSort(T a[])
    {
        int n = a.length;

        for (int i = 1; i < n; i++)
        {
            T target = a[i];
            int j = i - 1;

            while (j >= 0 && target.compareTo(a[j]) < 0)
            {
                a[j + 1] = a[j];
                j--;
            }
            a[j+1] = target;
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {5, 9, 2, 1, 6};
        System.out.println("Original array: " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

}
