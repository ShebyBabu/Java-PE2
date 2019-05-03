package com.stackroute.practice02;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
//import static org.junit.Assert.assertEquals;
import org.junit.Test;
//        import com.stackroute.datamunger.DataMunger;

import static org.junit.Assert.*;

public class PalindromeCheckTest {

    private static PalindromeCheck palindromeCheck;

    @BeforeClass
    public static void setUp() throws Exception {
        // This methods runs, before running any one of the test case
       // This method is used to initialize the required variables
        palindromeCheck=new PalindromeCheck();
    }

    @AfterClass
    public static void tearDown() throws Exception {
        // This method runs, after running all the test cases
       // This method is used to clear the initialized variables
        palindromeCheck=null;
    }



    @SuppressWarnings("deprecation")
    @Test
    public void testStringPalindromeCheck() //test case to check if the string is palindrome or not
    {
        assertEquals("testStringPalindromeCheck(),Reversing the string does not return the correct output"
                , new String("The reversed string is malayalam and it is palindrome"), palindromeCheck.stringPalindromeCheck("malayalam"));

        assertEquals("testStringPalindromeCheck(),Reversing the string does not return the correct output"
                , new String("The reversed string is amma and it is palindrome"), palindromeCheck.stringPalindromeCheck("amma"));

        assertEquals("testStringPalindromeCheck(),Reversing the string does not return the correct output"
                , new String("The reversed string is otator and it is not palindrome"), palindromeCheck.stringPalindromeCheck("rotato"));

    }

    @Test
    public void testNumberPalindromeCheck()     //test case to check if the integer is palindrome or not
    {
        assertEquals("testNumberPalindromeCheck(),Reversing the number does not return the correct output"
                , new String("The reversed number is 12321 and it is palindrome"), palindromeCheck.numberPalindromeCheck(12321));

        assertEquals("testNumberPalindromeCheck(),Reversing the number does not return the correct output"
                , new String("The reversed number is 121 and it is palindrome"), palindromeCheck.numberPalindromeCheck(121));

  }
}
