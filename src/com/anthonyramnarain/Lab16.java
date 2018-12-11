package com.anthonyramnarain;

/*Read file name from the command line arguments.
        • Open and read data from the file.
        • Find the smallest and numbers from the list.
        • Remove all the duplicates from the list and store the numbes in an
        array.
        • Create a new file and write data from the array to the file.
        • The new file should have no duplicate numbers.
        • The file has one number per line. try catch blocks with text files*/

import java.io.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Lab16 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        String strLine = "";
        Set<Integer> set = new HashSet<Integer>();
        System.out.println("Enter input file name: ");
        String input = sc.next();
        System.out.println("Enter output file name: ");
        String output = sc.next();

        try {
            LineNumberReader reader = new LineNumberReader(new InputStreamReader(new FileInputStream(input), "UTF-8"));
            while (((strLine = reader.readLine()) != null)){
                set.add(Integer.valueOf(strLine));
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }

        java.io.File outFile = new java.io.File ( output );
        FileOutputStream fos = new FileOutputStream(outFile);
        PrintStream ps = new PrintStream(fos);
        System.setOut(ps);
        Iterator it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}