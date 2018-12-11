package com.anthonyramnarain;

import java.util.Date;
import java.util.Scanner;

/*
Problem 1
1. Define a class named BankAccount.
2. The class has two instance variables: Account holder’s name, a String
and balance, a double.
3. It has a default constructor, a constructor without any parameters.
4. Now think about the methods you need, to get the balance and the
name.
5. Similarly, how do you set the balance?
6. Do you need to change the account holder’s name? Why?
7. How can we change our bank balance? What methods can we think of
to change the balance in addition to simply setting a new value?
8. What constraints do we have to put in these methods?
9. Finally write a toString() method
Problem 2:
Write a class named Employee that has the following:
• name. The name field references a String object that holds the employee’s
name.
• idNumber. The idNumber is the int variable that holds the employee’s
ID number.
department. The department references a String Object that holds the
name of the Employee’s department.
• position. The position variable references a String Object that holds
the employee’s job title.
• salary. The salary variable references a double value that holds the
employee’s salary.
The class should have a default constructor.
Think about what methods this class needs and write write them for
accessing and setting and changing these instance variables. Once you have
written the class, write a EmployeeDemo class that creates three Employee
objects with the following data.
Name ID Number Department Position Salary $:
hline Susan Mayers 47899 Accounting Vice President 500,000
Mark Jones 39119 IT Programmer 250,000
Joy Rogers 81774 Manufacturing Engineer 350,000
The program should store this data in three objects and then display the
data for each employee on the screen.
Problem 3
Write a class called Car that has the following fields.
• YearModel. It is an int type that represents the year the car is made.
• make. The make field refers to a String Object that holds the make of
the car.
• speed. The speed field is an int that holds the speed of the car.
It should have a default constructor and methods.
• A second Constructor that should accept the yearModel, and the make
as the as parameters. The speed should be set to 0.
• Accessors. Appropriate accessor methods should get the stored values
in object’s yearModel, make, and speed field.
 */

//account class
class BankAccount {
    //variables for an account
    public int id;
    public double balance;
    public Date dateCreated;
    public static int nextId = 1;
    public double annualInterestRate;

    /*Account() initializes the id, balance, and interest rate.
    The constructor takes parameter balance to set the balance in the 10
    accounts to be $100*/
    BankAccount(double balance) {
        id = nextId;
        this.balance = 100;
        nextId++;
        dateCreated = new Date();
        annualInterestRate = 4.5;
    }

    //getter method getId returns id
    public int getId() {
        return id;
    }

    //getter method getBalance returns balance;
    public double getBalance() {
        return balance;
    }

    //getter method getDateCreated returns dateCreated
    public Date getDateCreated() {
        return dateCreated;
    }

    //getter method getAnnualInterestRate returns annualInterestRate
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    //getter method getMonthlyInterestRate returns the monthly interest rate
    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12;
    }

    //getter method for getMonthlyInterest
    public double getMonthlyInterest() {
        return (annualInterestRate / 100) / 12;
    }

    //withdraw method subtracts user input from balance
    public void withdraw(double amount) {
        balance -= amount;
    }

    //deposit method adds user input to balance
    public void deposit(double amount) {
        balance += amount;
    }

    //toString method returns id. balance, dateCreated
    public String toString() {
        return "Account ID: " + id +
                " Balance: " + balance +
                " Date Created: " + dateCreated;
    }
}

/*Main class uses the Scanner class to take input from the user
main() uses a for loop to loop through the 10 accounts, asks
the user for input for an id, validates the id, and uses a while
loop to call displayMenu() each time user input is received.*/
public class Lab5 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(20000);
        acc1.id = 1122;
        acc1.balance = 20000;
        acc1.annualInterestRate = 4.5;
        acc1.withdraw(2500);
        acc1.deposit(3000);
        System.out.print("\nThe balance for the new Account is " + acc1.getBalance());
        System.out.print("\nThe monthly interest rate is " + acc1.getMonthlyInterest());
        System.out.print("\nCreated on " + acc1.getDateCreated());

        BankAccount[] accounts = new BankAccount[10];
        for (int i = 1; i < 11; i++) {
            accounts[i - 1] = new BankAccount(i);
        }
        System.out.print("\nEnter an id (1 - 10): ");
        int id = in.nextInt();
        if (id < 1 || id > 10) {
            id = incorrectId(id);
        }
        while (true) {
            displayMenu();
            System.out.print("Enter a choice: ");
            int choice = in.nextInt();

            if (choice == 4) {
                System.out.printf("%nEnter an id (1 - 10): ");
                id = in.nextInt();
                if (id < 1 || id > 10) {
                    id = incorrectId(id);
                }
            }
            performChoice(id, choice, accounts);
        }
    }

    //incorrectId() takes parameter int id to check if the user input for
    // selected id is valid
    public static int incorrectId(int id) {
        Scanner in = new Scanner(System.in);
        while (id < 1 || id > 10) {
            System.out.print("Please enter a valid id: ");
            id = in.nextInt();
            System.out.println();
        }
        return id;
    }

    //performChoice() takes int id, int choice, and the array of accounts. It uses
    //a switch statement to switch between balance, withdraw, deposit
    public static void performChoice(int id, int choice, BankAccount[] accounts) {
        Scanner in = new Scanner(System.in);
        switch (choice) {
            case 1:
                System.out.printf("your current balance is $%.1f%n",
                        accounts[id - 1].getBalance());
                break;
            case 2:
                System.out.print("Enter the amount you want to withdraw: ");
                accounts[id - 1].withdraw(in.nextDouble());
                break;
            case 3:
                System.out.print("Enter the amount you want to deposit: ");
                accounts[id - 1].deposit(in.nextDouble());
                break;
            default:
                break;
        }
    }

    //displayMenu() method prints the menu each time user input is received
    public static void displayMenu() {
        System.out.printf("%nMain menu%n");
        System.out.println("1: check balance");
        System.out.println("2: withdraw");
        System.out.println("3: deposit");
        System.out.println("4: exit");
    }
}