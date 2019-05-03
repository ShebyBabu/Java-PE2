package com.stackroute.practice02;


//5. Write a boolean method called isEven() in a class called EvenNumTest, which takes
//        an int as input and returns true if the input is even. The signature of the method is as
//        follows: public static boolean isEven(int number)

public class EvenChecker {



    public static boolean isEven(int number)
    {
        if(number%2==0)         //condition to check the number is even
            return true;

    else
        return false;
}

    public static void main(String[] args) {
        EvenChecker e=new EvenChecker();        //creating the instance of class
        System.out.println(e.isEven(20));
    }
}