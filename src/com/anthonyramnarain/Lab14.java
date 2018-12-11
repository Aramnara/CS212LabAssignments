package com.anthonyramnarain;

/*Problem 1: Write a program that allows the use to find the remainder
        after division of two integer values. The remainder of x/y is x%y. Catch any
        exceptions thrown and allow the user to enter new values.
        • This exercise can throw two exceptions.
        • InputMismatchException and DivideByZeroException
        • Catch the Exceptions in two separate catch blocks.
        Problem 2: Write a class TimeOfDay that asks a user to enter a
        timeString to enter the time.
        •The string should be in the format ”hour:minute
        pm/am”. Only one of pm or am should be given.
        •The hour should be from 1 to 12, minute should be from 0 to 59. Both hour and minute should be
        integers. You need to parse the timeString to get hour and minute.
        •In this problem you can have InvalidHourException where hour is any number that
        is not from 1 to 12. Similarly, hour can’t be a double. You need similar two
        exceptions for minute.
        •Finally, timeString may not have am/pm which you can call InvalidFormattingException of the timeString.
        •Write all the Exception classes first. User defined Exception class needs to extend Exception
        class.
        •You need a default constructor where you provide a general sentence
        like invalid String. Then a second constructor with a specific error like, no
        am/pm info.*/
import java.io.*;
import java.util.Scanner;

public class Lab14 {
    public static void main(String[] args) throws Exception{
        try{
            char ch;
            do{
                System.out.println("Enter the first number: ");
                BufferedReader bufferedReader = new BufferedReader(
                        new InputStreamReader(System.in));
                String num1 = bufferedReader.readLine();
                Float val1 = Float.parseFloat(num1);
                System.out.println("Enter the second number: ");
                String num2 = bufferedReader.readLine();
                Float val2 = Float.parseFloat(num2);

                if((val2 == 0) || (val1 == 0)){
                    throw new ArithmeticException();
                }
                else{
                    Float result = val1 % val2;
                    System.out.println("Result: " + result);
                }
                System.out.println("Do you want to continue? (y/n) ");
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String s = br.readLine();
                ch = s.charAt(0);
            }while((ch == 'y') || (ch == 'Y'));
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException");
        }
    }
}