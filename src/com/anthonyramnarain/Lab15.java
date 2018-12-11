package com.anthonyramnarain;

/*Problem 1: Write a program that will write the Gettysburg Address to
        a text file. Place each sentence on separate line of file.
        • First find Gettysburg Address from the internet.
        • Create a file named gettysburg.txt in your program. This is your
        fileName.
        • You need to import from Java API java.io.PrintWriter, java.io.FileStreamWriter,
        java.io.FileNotFoundException.
        • You create a PrintWriter variable call output or outputStream and set
        it to null.
        • open the try block. Inside, create a PrintWriter object by giving the
        fileName as an argument and assign it to the variable output or outputStream.
        Now your file is connected to the output stream and ready
        for writing data to it.
        • We use println, and print statements to write to the file. In place of
        system.out just type output.println or outputStream.println to write
        to the file.
        • Count how many sentences are there in the Gettysburg Address.
        • Now enter each sentence of the Gettysburg Address on separate line
        i.e, at the end of each sentence type a newline character.
        • After typing all the lines, you can close the try block and open catch
        block and use (FileNotFoundException ex) and complete the exception
        handling, and close the curly brace.
        • Write finally block where you close the PrintWriter object just as we
        close the Scanner object.
        • close your file.
        • You do not know if your file has what you have typed. For that you
        need to open the same file and read and print all lines.
        • In order to read from a file, you need to repeat the beginning steps of
        writing to a file.
        • You use scanner to read from the file.
        • Create an inputStream or input variable and set it to null.
        • Use the same same file that created and attach it to the Scanner in the
        try block just as you did with PrintWriter by typing the file name as
        an argument to the Scanner constructor.
        • To read you have to use two statements.
        • You begin a while block.
        • The boolean condition is (inputStream.hasNextLine()). What we are
        say is while there is data to read, get nextLine.
        • Create a String variable called line and assigned to it the line you read
        by using the statement inputStream.nextLine().
        • Then print this line on the screen using System.out.println().
        • After the while loop, close the try block and open catch block and catch
        FileNotFoundException.
        • Now you can close the Scanner object after the catch block.
        • Test your program
        */


import java.io.*;
import java.util.*;

public class Lab15 {
    public static void main(String[] args) throws Exception {

        //PrintWriter object
        PrintWriter outputStream = null;

        /* Writing data to file */
        try {
            //Opening file for writing
            outputStream = new PrintWriter(new File("d:\\Java\\gettysburg.txt"));

            outputStream.println("Four score and seven years ago our fathers brought forth on this continent, a new nation, conceived in Liberty, and dedicated to the proposition that all men are created equal.");

            outputStream.println("Now we are engaged in a great civil war, testing whether that nation, or any nation so conceived and so dedicated, can long endure.");

            outputStream.println("We are met on a great battle-field of that war.");
        }
        catch(FileNotFoundException ex) {
            System.out.println(ex);
        }
        finally {
            //Closing PrintWriter
            outputStream.close();
        }

        /* Reading data from file */

        //PrintWriter object
        Scanner inputStream = null;

        /* Reading data from file */
        try {
            //Opening file for reading
            inputStream = new Scanner(new File("d:\\Java\\gettysburg.txt"));

            //Reading lines
            while(inputStream.hasNextLine()) {
                System.out.println(inputStream.nextLine());
            }
        }
        catch(FileNotFoundException ex) {
            System.out.println(ex);
        }
        finally {
            //Closing Scanner
            inputStream.close();
        }
    }
}