/*
 * Donald Trowbridge
 * Module 6 Programming Project
 * Part A
 * 
 * This program takes creates an Array of 100 random float numbers and gets the 
 * average of those numbers
 */

package module6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Collection;
import java.util.Random;
import java.util.List;
import java.util.Iterator;


public class Module6 {

  
    public static void main(String[] args) 
    {
        //Random object  for creating random numbers.
       Random ran = new Random();
       //Float array for 100 float numbers.
       float[] fl = new float[100];
       //for loop to fill each Array element with a random float number
       for(int i = 0; i < 100; i++)
       {
           fl[i] = ran.nextFloat()*100;
       }
       //Declare ArrayList for float values
       List<Float> floatList = new ArrayList();
       //add numbers from float Array to ArrayList
       for(float f: fl)
           floatList.add(f);
       //Display absolute average of list
       System.out.printf("The absolute average is: %f.%nThis was calculate by "
               + "adding all numbers and then"
               + " dividing by the number of elements in the list.%n",
               absoluteAverage(floatList));
       //Display approximate average of list
       System.out.printf("%nThe approximate average of the list is: %f%n"
               + "This was calculated by adding the maximum value of the list and "
               + "the minimum value of the list and then divided by 2.%n"
               , approximateAverage(floatList));
    }
    //Method to calculate abosolute average of a list
    public static float absoluteAverage(List<Float> list)
    {
       float sum = 0;
       float average;
       //Iterator object to cycle through the List
       Iterator<Float> it = list.iterator();
       while(it.hasNext())//adds all numbers together
       {
           sum = sum + (float) it.next();
       }
       average = sum/(float) list.size();//calculates average of list
       return average; //returns average
    }
    //Method to calculate approximate average of a list
    public static float approximateAverage(List<Float> list)
    {
        float max = Collections.max(list);//gets highest number
        float min = Collections.min(list);//gets lowest number
        float result= (min + max)/2;//calculates average
        return result;//returns average
    }
    
}
