package com.anthonyramnarain;

/*
Write a generic class
Problem 1: Write a generic class called Point<T>. The class has two
        Coordinates x and y, each of type T. Write a default constructor where x
        and y are set to null. Write a second constructor with two parameters. Write
        get and set methods for each parameter, finally a toString method and an
        equals method which takes a Point<T> object. Remember the data type
        here is T. You need to use T where you normally use the data type. Try
        and see if you can write a distance method by passing another Point<T>
object. Write a PointDemo class and create four instances of the Point class,
        two with Integer data type and the other two with Double data type. Print
        all four objects and check if the two Integer and the two Double objects are
        equal.
        Problem 2: If you want to calculate the distance between two Point<T>
objects how should you modify the type parameter? Make the required
        changes and write the distance method.
*/


class Point<T extends Number>{
    T x, y;
    Point(){
        x=null;
        y=null;
    }
    Point(T x, T y){
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }

    public double getDistance(Point p){
        return Math.sqrt((this.x.doubleValue()-p.x.doubleValue())*(this.x.doubleValue()-p.x.doubleValue()) + (this.y.doubleValue()-p.y.doubleValue())*(this.y.doubleValue()-p.y.doubleValue()));
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
public class Lab22{
    public static void main(String[] args) {
        Point a1 = new Point(1,3);
        Point a2 = new Point(2,4);
        Point a3 = new Point(0.0,5.0);
        Point a4 = new Point(3.5,5.9);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println("a1-a2 "+a1.getDistance(a2));
        System.out.println("a3-a4 "+a3.getDistance(a4));
    }
}