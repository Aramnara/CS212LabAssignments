package com.anthonyramnarain;
/*
    Problem 1:
• Create a base class called Person That has one instance variable called
name (type String).
• Create two derived classes, a class called Doctor and a class called
patient.
• A Doctor record has the doctor’s name (defined in Person class)- and
the specialty as a String (for example Pediatrics, Obstetrics, General
Practitice, and so on), and an office-visit fee of type double.
• A Patient record has the patient’s name (defined in the class Person),
and identification number, SSN as a String.
• A Billing class named Billing. A Billing object will contain a Patient
Object and a Doctor object.
• Give your classes a reasonable complement of constructors and accessor
methods, a toString method to display the patient name, the doctor’s
name and the bill and an equals method as well.
• First write a driver program to test all your methods
• Then Write a test program that creates at least two patients, at least
two doctors, and at least two Billing records.
• Then Display the total income from the Billing records.

}*/
public class Lab11 {
    public static void main(String[] args) {

    }

}
class Person
{
    //data member
    protected String name;

    //setter and getter methods
    public void setName(String pname)
    {
        this.name=pname;
    }

    public String getName()
    {
        return name;
    }

    //constructor method
    public Person(String pname)
    {
        this.name=pname;
    }

    //display method
    public void display()
    {
        System.out.println("\n Person name :"+getName());
    }

    //compares two person objects have same name
    public boolean hasSameName(Person p)
    {
        return name.equalsIgnoreCase(p.name);
    }
}
//------------------------------------------------------------------------------

//Patient class
class Patient extends Person
{
    //data members
    private int patientId;

    //constructor
    public Patient(String pname,int pid)
    {
        super(pname);
        patientId =pid;
    }

    //setter and getter for patientId
    public void setPatientId(int pid)
    {
        patientId=pid;
    }

    public int getPatientId()
    {
        return patientId;
    }

    public void display()
    {
        System.out.println("\n Identification Number    "+patientId);
        System.out.println("\n Patient name             " + name);
    }
}

//--------------------------------------------------------------------------------

//Doctor class
class Doctor extends Person
{
    //data memebers
    private String speciality;
    private float visitFee;

    //Cosntructor
    public Doctor(String name,String special,float fees)
    {
        super(name);
        speciality=special;
        visitFee=fees;
    }


    //getter and setters for speciality
    public void setSpeciality(String splty)
    {
        speciality =splty;
    }

    public String getSpeciality()
    {
        return speciality;
    }

    //getters and setters for VisitFee
    public void setVisitFee(float fees)
    {
        visitFee = fees;
    }

    public float getVisitFee()
    {
        return visitFee;
    }

    // method compare two doctor objects are equal
    public boolean equals(Doctor d)
    {
        boolean res=((name.equalsIgnoreCase(d.name)) && (speciality.equalsIgnoreCase(d.speciality)) && ( visitFee == d.visitFee ));
        return res;
    }

    //display method
    public void display()
    {
        System.out.println("\n Name                    "+name);
        System.out.println("\n Speciality              "+speciality);
        System.out.println("\n Office Visit Fee       $ "+visitFee);
        System.out.println("\n TotalIncome      $ "+ String.format ("%.2f", Billing.getTotalIncome()));
        System.out.println("\n----------------------------------------------");
        Billing.setTotalIncome(0.0);
    }
}

//---------------------------------------------------------------------------------------------

//Billing class
class Billing
{
    static double totalIncome;
    //getter for totalIncome

    public static void setTotalIncome(double x)
    {
        totalIncome =x;
    }
    public static double getTotalIncome()
    {
        return totalIncome;
    }
    public Billing(Doctor d,Patient p)
    {
        totalIncome += d.getVisitFee();
    }
}

//---------------------------------------------------------------------------------

//BillingRecordDemo class
public class BillingRecordDemo{

    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);

        Patient p1 = new Patient("John Brook", 110453);
        Patient p2 = new Patient("Samantha Oliver", 921123);
        Patient p3 = new Patient("Ryan Badr", 118922);
        Patient p4 = new Patient("Mona Sharma", 211156);

        Doctor d1 = new Doctor("Garry Allen", "Internal Medicine", 245.90f);
        Doctor d2 = new Doctor("Sarah Elder", "Surgery", 425.75f);

        Billing b1 = new Billing(d1 , p1);
        Billing b2 = new Billing(d1 , p2);

        d1.display();

        Billing b3 = new Billing(d2 , p3);
        Billing b4 = new Billing(d2 , p4);
        Billing b5 = new Billing(d2 , p1);

        d2.display();

    }

}