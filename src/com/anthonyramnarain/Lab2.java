package com.anthonyramnarain;

import java.util.Scanner;
public class Lab2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two integers");
        int p, q;
        p = scan.nextInt();
        q = scan.nextInt();
        System.out.println("Enter two doubles separated be space");
        double x, y;
        x = scan.nextDouble();
        y = scan.nextDouble();
        System.out.println("You entered " + x + " and " + y);
        String fullname;
        System.out.println("Enter your full name");
        fullname = scan.nextLine();
        //print name in reverse.
        int len = fullname.length(); //String method to get the string length

/*The following for loop prints the charactersn fullName in reverse.
However, what we printed is not a String. If you want to convert
it back to String, you need to convert each character to String.*/

        for (int i = len - 1; i >= 0; i--)
            System.out.print(fullname.charAt(i));
        System.out.println();
        System.out.println("Enter two words");
        String s1, s2;
        s1 = scan.next();
        s2 = scan.next();
        System.out.println("You entered the words /" + s1 + " and /" + s2);
        System.out.println("The Strings " + s1 + " and " + s2 + " are equal: " +
                s1.equals(s2)); //String equals method

        System.out.print("Enter a temperature in Fahrenheit degrees: ");
        Scanner scanner = new Scanner(System.in);
        float fahrenheit = scanner.nextFloat();
        float celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + " Fahrenheit degrees is " + celsius + " Celsius degrees");
    }
}