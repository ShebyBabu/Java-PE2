package com.stackroute.practice02;

public class PalindromeCheck {

    public String stringPalindromeCheck(String word) {
        char[] wordArray = word.toCharArray();      //converting string to character array
        String reverseWord="";      //initilasing reverse wrod as string
        for(int i=wordArray.length-1;i>=0;i--){
            reverseWord=reverseWord+wordArray[i];       //entering each character into reverse word
        }
        if(reverseWord.equalsIgnoreCase(word))
        {
            return "The reversed string is "+reverseWord+ " and it is palindrome";      //printing if it is palindrome
        }
        else
            return "The reversed string is "+reverseWord+ " and it is not palindrome";  //printing if it is not palindrome

    }


    public String numberPalindromeCheck(int number)    {
        int remainder, sum=0;
        String originalNumber=Integer.toString(number);
        while(number>0)     //reversing the integer
        {
         remainder=number%10;
         sum=sum*10+remainder;
         number=number/10;
        }

        String reverseNumber=Integer.toString(sum);     //converting the number to string

        if(reverseNumber.equals(originalNumber))        //condition to check if it is palindrome
        {

            return "The reversed number is "+reverseNumber+ " and it is palindrome";
        }
        else
            return "The reversed number is "+reverseNumber+ " and it is not palindrome";





    }
}
