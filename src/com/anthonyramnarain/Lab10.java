package com.anthonyramnarain;

/*Write a subclass of a an existing class using the keyword extends.
        • To write a constructor using the keyword super to use the constructor
        of the superclass to set the instance variable that are common to both
        super and subclasses.
        • To write methods for only those instance variable that are unique to
        the subclass.
        • To override super class toString() method to include new data in the
        subclass.
        Problem 1: Create a base class called vehicle That has the manufacturer’s
        name (type String), number of cylinders in the engine(type int), owner
        (type Person given in chapter 8 of your book).
        • Create a class called Truck that is derived from Vehicle and has additional
        properties: The load capacity in tons (type double), towing
        capacity in tons(type double).
        • iGive both of these classes reasonable complements of constructors, and
        accessor methods, and an equals method as well.*/

class Person{
    String name;

    public Person(){
        name = "No name yet";
    }
    public Person(String intialName){
        name = intialName;
    }
    public void setName(String newName){
        name = newName;
    }
    public String getName(){
        return name;
    }
    public void writeOutput(){
        System.out.println("Name: " + name);
    }
    public boolean hasSameName(Person otherPerson){
        return this.name.equalsIgnoreCase(otherPerson.name);
    }
}

class Vehicle{
    private String manufacturerName;
    private int numOfCylinders;
    private Person owner;

    public Vehicle(String mnName, int cylinders, Person person){
        manufacturerName = mnName;
        numOfCylinders = cylinders;
        owner = person;
    }
    public void setManufacturerName(String mName){
        manufacturerName = mName;
    }
    public void setNumOfCylinders(int cylinders){
        numOfCylinders = cylinders;
    }
    public void setOwner(Person newOwner){
        owner = newOwner;
    }
    public String getManufacturerName(){
        return manufacturerName;
    }
    public int getNumOfCylinders(){
        return numOfCylinders;
    }
    public Person getOwner(){
        return owner;
    }
    public void writeOutput(){
        System.out.println("\nManufacturer name: " + manufacturerName);
        System.out.println("Number of cylinders: " + numOfCylinders);
        System.out.println("Owner name: " + owner.getName());
    }
    public boolean equals(Vehicle otherVehicle){
        return this.manufacturerName
                .equalsIgnoreCase(otherVehicle.manufacturerName)
                && this.numOfCylinders == otherVehicle.numOfCylinders
                && this.owner.hasSameName(otherVehicle.getOwner());
    }
}
class Truck extends Vehicle{
    private double loadCapacity;
    private double towingCapacity;

    Truck(String mName, int cylinders, Person owner,
          double load, double towingCapacity){
        super(mName, cylinders, owner);
        loadCapacity = load;
        towingCapacity = towingCapacity;
    }
    public void setLoadCapacity(double load){
        loadCapacity = load;
    }
    public void setTowingCapacity(double tow){
        towingCapacity = tow;
    }
    public double getLoadCapacity(){
        return loadCapacity;
    }
    public double getTowingCapacity(){
        return towingCapacity;
    }
    public void writeOutput(){
        super.writeOutput();
        System.out.println("Load Capacity       : " +
                loadCapacity + " tons");
        System.out.println("Towing Capacity     : " +
                towingCapacity + " tons");
    }
    public boolean equals(Truck otherTruck){
        return super.equals(otherTruck)
                && this.loadCapacity == otherTruck.loadCapacity
                && this.towingCapacity == otherTruck.towingCapacity;
    }
}
public class Lab10{
    public static void main(String[] args){
        System.out.println("Truck 1 Details: ");
        Person ownderJoe = new Person("Smoth Joe");
        Truck tataTruck = new Truck("TATA", 12, ownderJoe,
                30.2, 50);
        tataTruck.writeOutput();

        System.out.println("\nTruck 2 Details: ");
        Person ownerGeorge = new Person("George");
        Truck toyotaTruck = new Truck("Toyota", 20, ownerGeorge,
                100.1, 200);
        toyotaTruck.writeOutput();

        System.out.println("\nAre both trucks are the same: "
                + tataTruck.equals(toyotaTruck));
    }
}