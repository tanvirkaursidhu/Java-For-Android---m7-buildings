package mooc.vandy.java4android.buildings.logic;

import java.io.FileNotFoundException;

import mooc.vandy.java4android.buildings.ui.OutputInterface;

/**
 * This Neighborhood utility class provides static helper methods the
 * print a Building List and calculate the area of a Building list.
 * A utility class in Java should always be final and have a private
 * constructor.
 */
public final class Neighborhood { //final class

    // TODO - Put your code here.
     private Neighborhood()// private constructor
    {

    }
    public static void print(Building[] buildings, String header, OutputInterface out) // static method
    {
         // System.out.println(header);
         // for(int i =0;i<buildings.length;i++){
         //    System.out.println(buildings[i]);
         // }
    }

     public static int calcArea(Building[] buildings) // static method
    {
        int sum = 0;
        for(int i =0;i<buildings.length;i++){
            sum = sum + (buildings[i].calcLotArea());
        }
        return sum; //return total lot area
    }


    
}
