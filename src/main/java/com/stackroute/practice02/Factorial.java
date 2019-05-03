package com.stackroute.practice02;


import java.util.Scanner;

//7. Write a program to list all the factorials, that can be expressed as an int (i.e., 32-bit
//signed integer). Your output shall look like:
//Int Factorials:
//The factorial of 1 is 1
//The factorial of 2 is 2
//..........
//The factorial of 12 is 479001600
//he factorial of 13 is out of range
//Modify your program and add a method called longFactorial to list all the factorial that can
//be expressed as a long (64-bit signed integer).The maximum value for long is kept in a
//constant called Long.MAX_VALUE.
//your output shall look like:
//Long Factorials:
//The factorial of 1 is is 1.
//The factorial of 2 is is 2.
//..........
//The factorial of 20 is is 2432902008176640000.
//The factorial of 21 is out of range
public class Factorial {
    public static void main(String[] args) {
        int fact=1,i,j;
        for(i=1;i<Integer.MAX_VALUE;i++)
        {
            for(j=1;j<=i;j++)           //condition for factorial
            {
                fact=fact*j;
            }

            if(i==13)
            {
                System.out.println("The factorial of this number is out of range"); //print statement if number is equal to 13 and break
                break;
            }

            System.out.println("The factorial of the number "+i+ " is "+fact);  //print the factorial
            fact=1;


        }

longFactorial();
    }

    public static void longFactorial()    {
        long fact=1,i,j;
        for(i=1;i<Long.MAX_VALUE;i++)
        {
            for(j=1;j<=i;j++)
            {
                fact=fact*j;
            }

            if(i==21)
            {
                System.out.println("The factorial of this number is out of range");     //print statement if number is equal to 21 and break
                break;
            }

            System.out.println("The factorial of the number "+i+ " is "+fact);  //print factorial output
            fact=1;


        }

    }
}
