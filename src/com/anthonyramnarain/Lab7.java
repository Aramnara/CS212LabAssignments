package com.anthonyramnarain;

import static com.anthonyramnarain.MyInteger.parseInt;

/*Problem 1 Design a class named MyInteger. The class contains:
        • An int data field named value that stores an int value represented by
        this object.
        • A constructor that creates a MyInteger object for the specified int
        value.
        • A getter method that returns the int value.
        • The methods isEven(), isOdd(), isPrime() that return true if the
        value in this object is even, odd, or prime, respectively.
        • The static methods isEven(int), isOdd(int), isPrime(int) that return
        true if the specified value is even, odd, or prime respectively.
        • The static methods isEven(MyInteger), isOdd(MyInteger), isPrime(MyInteger)
        that return true if the specified value is even,
        odd, or prime respectively.
        • The method equals(MyInteger) and equals(int) that return true if the
        value in this object is equal to the specified value.
        • A static method parseInt(String) that converts a String to an int and
        returns the value.
        Write a client code to test the class and all its methods.*/
//Lab
public class Lab7 {
    public static void main(String[] args) {

        MyInteger m1 = new MyInteger(283);

        System.out.println("MyInteger m1: " + m1);

        int i = parseInt("283");

        System.out.println("Parsing resulted in: " + i);

        MyInteger m2 = new MyInteger(i);

        System.out.println("M2: " + m2);

        System.out.println("M1.equals(M2): " + m1.equals(m2));
    }
}

class MyInteger {

    private int value;

    public int getValue() {

        return value;

    }

    public void setValue(int value) {

        this.value = value;

    }

    public MyInteger(int value) {

        this.value = value;

    }

    boolean isEven() {

        return (value % 2 == 0);

    }

    boolean isOdd() {

        return (value % 2 == 1);

    }

    boolean isPrime() {

        for (int i = 2; i < value / 2; i++) {

            if (value % i == 0) {

                return false;

            }

        }

        return true;

    }

    static boolean isEven(int v) {

        MyInteger m = new MyInteger(v);

        return m.isEven();

    }

    static boolean isOdd(int v) {

        MyInteger m = new MyInteger(v);

        return m.isOdd();

    }

    static boolean isPrime(int v) {

        MyInteger m = new MyInteger(v);

        return m.isPrime();

    }

    static boolean isEven(MyInteger m) {

        return m.isEven();

    }

    static boolean isOdd(MyInteger m) {

        return m.isOdd();

    }

    static boolean isPrime(MyInteger m) {

        return m.isPrime();

    }

    boolean equals(int m) {

        return (m == value);

    }

    boolean equals(MyInteger m) {

        return (m.value == value);

    }

    static int parseInt(char[] chArray) {

        int value = 0;

        for (char ch : chArray) {

            value = value * 10 + (int) (ch - '0');

        }

        return value;

    }

    static int parseInt(String s) {

        return parseInt(s.toCharArray());

    }

    @Override

    public String toString() {

        return value + "";

    }

}
