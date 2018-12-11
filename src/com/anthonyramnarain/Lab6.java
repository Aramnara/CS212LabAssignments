package com.anthonyramnarain;

/*Problem 1
        1. Use the BankAccount class that you wrote in the last lab.
        2. If you only wrote default constructor last time, add the following constructors:
        (1) With two parameters, name and balance (2) with a single
        parameter double balance, (3) with single parameter, int balance, (4)
        with single parameter String balance. This last one you have use the
        Double class method parseDouble() to convert String to double to assign
        to the balance.
        3. Similarly, deposit and withdraw methods can be overloaded each time
        changing the data type of the input amount. Add both of these methods
        using int amount, and String amount.
        4. Write an equals method to check if two BankAccounts are equal.
        5. Finally write a toString method,
        Problem 2:
        Write a class named Employee that has the following:
        • name. The name field references a String object that holds the employee’s
        name.
        idNumber. The idNumber is the int variable that holds the employee’s
ID number.
• department. The department references a String Object that holds the
name of the Employee’s department.
• position. The position variable references a String Object that holds
the employee’s job title.
• salary. The salary variable refernces a double value that holds the
employee’s salary.
The class should have the following constructors.
• A constructor that accepts Employee’s name, employee’s ID number,
employee’s department, employees job title and employee’s salary.
• A constructor that accepts employee’s name, employee’s ID number.
In this case, set the department, position to ”” and salary to 0.
• A constructor that accepts employee’s name, Employee’s ID number,
and employee’s salary. In this case set the department and the position
to empty string.
• A default constructor which assigns all the string instance variables to
null, and ID number and salary to 0.
Think about what methods this class needs and write write them for
accessing and changing these instance variables. Once you have written the
class, write a EmployeeDemo class that creates three Employee objects with
the following data.
Name ID Number Department Position Salary $:
hline Susan Mayers 47899 Accounting Vice President 500,000
Mark Jones 39119 IT Programmer 250,000
Joy Rogers 81774 Manufacturing Engineer 350,000
The program should store this data in three objects and then display the
data for each employee on the screen. You could store data in this format in
toString method.
Finally write an equals method to check if two employee objects are equal.
Problem 3
Write a name called Car that has the following fields.
• YearModel. It is an int type that represents the year the car is made.
• make. The make field refers to a String Object that holds the make of
the car.
• speed. The speed field is an int that holds the speed of the car.
It should have the following constructors and methods.
• Constructor. The constructor should accept the yearModel, and the
make as the parameters. The speed should be set to 0.
• Accessors. Appropriate accessor methods should get the stored values
in object’s yearModel, make, and speed field.
• accelerate(). The accelerate method should add 5 to the speed every
time it is called.
• brake(). The brake method should subtract 5 from the speed every
time it is called.
• toString(). The toString method that displays the state of the object.
Demonstrate the class in a program that creates a Car object, and then
calls the accelerate method five times. After each call to the accelerate
method, get the current speed of the car and display it. Then call the brake
method five times. After each call to the brake, get current speed of the car
and display it.
Problem 4
Now on your own, think about a credit card and come up with the instance
variables and the method you need. After that, write a class called
CrediCard. You have a whole week to work on this. Please practice writing
classes for the problems at the end of chapter 5 in your book.
        */
public class Lab6 {
}
