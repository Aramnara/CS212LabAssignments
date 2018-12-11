package com.anthonyramnarain;

/*
Problem 1 Design a class named AnalyzeArray. The class contains:
        • An int[] array named data that stores integer values.
        • A constructor that receives an integer array n as a parameter and
        assigns to the variable data.
        • Write a method named analyze() that does the following:
        1
        1. Instantiates (creates an object) the inner class named MinMaxAv.
        2. A println statement that prints the minimum value stored in the
        array data by calling the min() method of the inner class MinMaxAv.
        3. Write a println statement that calls the inner class’ max() method
        to find the max value stored in the array.
        4. Print the average of the array values stored by calling the average()
        method of the inner class.
        5. End the method.
        • Create a private inner class named MinMaxAv.
        • This class has 3 methods. Write all the three.
        • The min() method to find and return the minimum value stored in the
        array data[].
        • The max() method that finds and returns the max value stored in the
        array data[].
        • The average() method returns the average of all the values stored in
        the array data[].
        • End the inner class.
        Write a client code to test the class
*/
import java.util.Random;

 class AnalyzeArray {

    private int array[];
    private int count;

    public AnalyzeArray(int size) {
        setCount(size);
        array = new int[size];
        Random rand = new Random();
        for (int i = 0; i < count; i++) {
            array[i] = (rand.nextInt(10));
        }
    }

    public AnalyzeArray(int[] array) {
        setArray(array);
        setCount(array.length);
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int findMin() {

        int min = array[0]; // Set min to the first element
        for (int i = 1; i < count; i++) {
            // Reassign min if there is a smaller element
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min; // Return the smallest element
    }

    public int findMax() {

        int max = array[0]; // Set max to the first element
        for (int i = 1; i < count; i++) {
            // Reassign max if there is a largest element
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max; // Return the largest element
    }

    private int calcSum() {

        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum = sum + array[i];
        }
        return sum; // Return the largest element
    }

    public double calcAverage() {
        double average;
        average = calcSum() / count;
        return average;
    }

    public String toString() {
        String output = "[ ";
        for (int i = 0; i < count; i++) {
            output += array[i];
            if (i != count - 1) {
                output += ", ";
            }
        }
        return output + " ]";
    }
}

public class Lab8 {

    public static void main(String[] args) {

        // Create an Arrays object using the first constructor
        AnalyzeArray arr1 = new AnalyzeArray(5);
        // Print the contents of the array in arr1
        System.out.println(arr1);
        // Call findMin, findMax, and calcAverage on arr1 and print their values
        System.out.println("Min: " + arr1.findMin());
        System.out.println("Max: " + arr1.findMax());
        System.out.println("Average: " + arr1.calcAverage());
        System.out.println();

        int array[]={1,2,3};
        AnalyzeArray arr2 = new AnalyzeArray(array);
        // Print the contents of the array in arr1
        System.out.println(arr2);
        // Call findMin, findMax, and calcAverage on arr1 and print their values
        System.out.println("Min: " + arr2.findMin());
        System.out.println("Max: " + arr2.findMax());
        System.out.println("Average: " + arr2.calcAverage());
        System.out.println();
    }

}