package com.anthonyramnarain;

/*
Problem1: Implement the following method to sort the columns in a two dimensional array. A new array is returned and the original array is intact.

public static double[][] sortColumns(double[][] m)

        • Create a class called ColumnsSort.

        • Write the above given method to sort the individual columns of the array.

        • Create a 3 x 3 two dimensional array of doubles with default values in the static main method.

        • Prompt the user to enter nine double values less than one and greater than zero with three digits after the decimal point in the main method to fill a 3 x 3 array to test the method.

        • Sort the columns of the array using the method you wrote.

        • Remember that original array you created and passed as the argument to the method should not be changed.

        • You need to create a deep copy of the original array for sorting.

        • The only way to make a deep copy is to copy every entry of the original array one by one to the new array.

        • Write a method called printArray to print the original unsorted array and the sorted array.

        • Print the original array one more time to prove that it has not been changed.

        Problem 2: Write a program to print to the screen three integers that are passed as Strings from the operating system command line.

        • You will be passing three integer values in the String[] args array.

        • In order to use them, you have to program the static main method using args[0], args[1] and args[2] to print the integers.

        • Before printing convert the strings to integers so that you can practice converting Strings to integers.
*/
import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        //Declaring an two dimensional double type matrix of size 3X3
        double matrix[][]=new double[3][3];

        //Scanner class object is used to read the numbers entered by the user
        Scanner keyboard = new Scanner(System.in);

        //This nested for loop will get the values entered by the user and populate them in an array
        System.out.println("Enter a 3-by-3 matrix in an row :");
        for(int i=0;i<3;i++)
        {

            for(int j=0;j<3;j++)
            {
                //Getting the values entered by the user
                matrix[i][j]=keyboard.nextDouble();
            }
        }

        //Calling the method by passing the 3X3 matrix as argument
        sortRows(matrix);

        //Displaying the 3X3 matrix after sorting the matrix based on the rows
        System.out.println("The row-sorted array is :");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }

    /* This method will sort the two dimensional array based on the rows     */
    private static double[][] sortRows(double[][] matrix) {
        //This Logic will Sort the Array of elements in Ascending order
        double temp;

        //This nested for loop will sort the 2-D array based on the rows
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[0].length-1; j++)
            {
                if (matrix[i][j] > matrix[i][j+1])
                {
                    temp = matrix[i][j];
                    matrix[i][j] = matrix[i][j+1];
                    matrix[i][j+1] = temp;
                }
            }
        }
        return matrix;


    }

}
