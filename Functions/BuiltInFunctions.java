import java.net.SocketTimeoutException;
import java.sql.SQLNonTransientConnectionException;
import java.util.Random;
import java.util.Scanner;

import javax.xml.transform.Source;

public class BuiltInFunctions {
    public static void main(String[] args) {
        /**
         * Scenario 1
         * Find a built in function that prints the message on the console
         * 
         * 
         */
        System.out.println("PRINT A MESSAGE");
        String message = "Welcome to Visual Studio Code";
        System.out.println(message);
        System.out.println("_____________________________\n");

        /**
         * Scenario 2
         * Find the built in function that returns the length of a string (ctrl+f)
         */

         System.out.println("LENGTH OF A STRING");
        String example = "Java";

        int length = example.length(); // public int length()
        System.out.println(length);
       System.out.println("_____________________________\n");

        /**
         * Scenario 3
         * Find a built in function that converts a string to lowercase
         */
System.out.println("LOWER CASE");
        String text = "HELLO";
        String lowerCase = text.toLowerCase();
        System.out.println(lowerCase);
System.out.println("_____________________________\n");
        /**
         * Scenario 4
         * Find built in function that checks if a string starts with a specified
         * prefix
         */
        String word; 
        //String prefix = "un";
        System.out.println("PREFIX");
Scanner scan = new Scanner (System.in);
System.out.println("Enter a word: ");
word = scan.nextLine();

if(word.startsWith("un")){
    System.out.println("Word beings with the specified prefix");

} else 
System.out.println("Word does not start with the specified prefix");
System.out.println("_____________________________\n");

        /*
         * Scenario 5
         * Find a built in function that replaces all occurrences of a specified
         * character in a string with
         * another character
         */
        System.out.println("REPLACING A CHARACTER");

        String hello = "Hello, how are you ?";

        char oldChar = 'o';

        char newChar = 'r';

        String replacedString = hello.replace(oldChar, newChar);
        System.out.println(replacedString);
        System.out.println("_____________________________\n");


        
     /*
         * Scenario 6
         * Find a built in function that calculates the square root of a number
         * 
         * 
         *
         */
 double number ;
  System.out.println("SQUARE ROOT ");
 Scanner scann = new Scanner (System.in);
 System.out.println("Enter a number: ");
number = scann.nextDouble();
double squareRoot = Math.sqrt(number); 
System.out.println(squareRoot);
System.out.println("_____________________________\n");


/*
     * Scenario 7 
     * Find a built in function that calculates the power of a number 
     * 
     */
double num ; 
double power; 
System.out.println("POWER OF A NUMBER");
Scanner Scan = new Scanner(System.in);
System.out.println("Enter a number: ");
num = Scan.nextDouble();
Scanner SCAN = new Scanner(System.in);
System.out.println("Enter a power: ");
power = SCAN.nextDouble();

double OUT = Math.pow(num, power);
System.out.println(OUT);
System.out.println("_____________________________\n");



    /* 
 * Scenario 8 
 * Find a built in function that generates a random number between 0.0 (inclusive) and 1.0 (exclusive)
 */
double number3; 
System.out.println("RANDOM NUMBER");
double RANDOM = Math.random();
System.out.println(RANDOM);
System.out.println("_____________________________\n");









/*
  * Scenario 9 
  Find a built in function that returns the larger number of two numbers
  */
double num1 = 299.4;
double num2 = 934.5;
double MAX ; 
System.out.println("MAXIMUM NUMBER");
MAX = Math.min(num1, num2);
System.out.println("the max number out of both is : "+ MAX);
System.out.println("_____________________________\n");





  
  

    }


    
    

 


    
   

 
}
