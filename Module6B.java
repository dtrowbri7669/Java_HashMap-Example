/*
 * Donald Trowbridge
 * Module 6 Programming Project
 * Part B
 * 
 * Accepts user input of numbers 1-9 and creates a histrogram of the how many times
 * a number was entered.
 */


import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class Module6B
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);//Obj to collect user input
        Map<Integer, String> NMap = new HashMap<>();//Creates a hash map
        int response;//to hold user input
        System.out.println("Enter a number from 1 to 9. Enter -1 to exit.");
        //sets all keys in hash map to value of zero
        setHistogramKeys(NMap);
        do{//collects user input until user enters -1
            response = input.nextInt(); //assings user input to response var
            //logic decision based on users input
            if(response < 1 && response != -1)// response if input is lower than 1
                System.out.println("\nYou have entered a number less than 1 that"
                        + "is not '-1'.\nPlease enter a number from 1 to 9.");
            
            else if(response >9)//response if input is higher than 9
                System.out.println("\nYou have entered a number greater than 9.\n"
                        + "Please enter a number from 1 to 9.");
            else if(response >= 1 && response <= 9)//if number is between 1 and 9
            {
                System.out.printf("\nThe number %d has been added to the list.%n"
                        + "Please enter another number.%n", response);
                    String count = NMap.get(response);//gets current count
                    count = count + "*";//adds one to count
                    NMap.put(response, count);//sets count to new value
            }
        }while(response != -1);//breaks loop with -1
        displayHistogram(NMap);//displays histogram of user input.
    }
    //create the hashmap keys 1-9
    public static void setHistogramKeys(Map<Integer, String> NMap)
    {
      for(int i = 1; i <=9; i++)//loops each digit and assigns eash key a blank value
            NMap.put(i, "");  
    }
    
    //displays hashmap in a histogram
    public static void displayHistogram(Map<Integer, String> NMap)
    {
        System.out.println("\nNumber  Occurrences");
        for(int i = 1; i <=9; i++)//loops through hash map and displays values
            System.out.printf("%-7d %s%n", i, NMap.get(i));
    }
}
