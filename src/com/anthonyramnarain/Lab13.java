package com.anthonyramnarain;

/*
Modify the Student class that is given in you textbook in chapter 8,
        so that it implements Comparable interface. Define the CompareTo()
        method to order Student objects based on the value in student number.
        In a main method create an array of at least five Student objects. Sort
        them using Array.sort() method and output the students. They should
        be listed by ascending student number. Next modify the compareTo
        method so it orders Student objects based on the lexicographic ordering
        of the name variable. Without modification to the main method, the
        program should now output the students ordered by name.
        • Practice writing abstract class.
        Problem 2: There are 5 exercises on pages 663-664 beginning at exercise
        10 that are all related to an abstract class that contains a single abstract
method . I typed the first two so that you can do in the lab. However, you
        should practice all 5 to get better understanding of the abstract class and
how to turn it into an interface.
        • Create an abstract class DiscountPolicy. It should have a single
abstract method computeDiscount that will return the discount for the
        purchase of a given number of a single item. The method has two
        parameters, count and itemCost.
        • Since the question doesn’t specify anything else, it essentially is like an
interface.
        • Derive a class BulkDiscount from DiscountPolicy, as described
        above.
        • It should have a constructor that has two parameters, minimum and
        percent.
        • It should define the method computeDiscount so that if the purchased
        of an item is more than minimum, the discount is percent percent.

*/
import java.util.Arrays;
public class Lab13 {
    public static void main(String[] args){
        Student[] stds = new Student[5];
        stds[0] = new Student("Allen", 111);
        stds[1] = new Student("Paul", 999);
        stds[2] = new Student("Stanley", 555);
        stds[3] = new Student("Mark", 333);
        stds[4] = new Student("Zuckerburg", 444);

        Arrays.sort(stds);
        for (Student std:stds)
            System.out.println(std);
    }
}
class Student extends Person implements Comparable{
    private int studentNumber;
    public Student(){
        super();
        studentNumber = 0;
    }
    public Student(String initialname, int initialStudentNumber){
        super(initialname);
        studentNumber = initialStudentNumber;
    }
    public int getStudentNumber(){
        return studentNumber;
    }
    public void setStudentNumber(int newStudentNumber){
        studentNumber = newStudentNumber;
    }
    public void writeOutput(){
        System.out.println("Name: " + getName());
        System.out.println("Student Number: " + studentNumber);
    }
    public boolean equals(Student otherStudent){
        return this.hasSameName(otherStudent) &&
                (this.studentNumber == otherStudent.studentNumber);
    }
    public int compareTo(Object object){
        if((object != null) && (object instanceof  Student)){
            Student otherStudent = (Student)object;

            if(studentNumber>otherStudent.studentNumber)
                return 1;
            else
            if(studentNumber<otherStudent.studentNumber)
                return -1;
            else
                return 0;
        }
        return -1;
    }
    public String toString(){
        return "Name: " + getName() +
        "\nStudent number: " + studentNumber;
    }
}
