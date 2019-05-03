package com.stackroute.practice02;

import org.junit.*;

import static org.junit.Assert.*;

public class PowerOfFourTest {
    private static PowerOfFour powerOfFour;


    @BeforeClass
    public static void setUp() throws Exception {
        powerOfFour=new PowerOfFour();
    }

    @AfterClass
    public static void tearDown() throws Exception {
        powerOfFour=null;
    }

    @Test
    public void testPowerOfFourCheck() {    //test case to check if the number is power of four or not

        assertEquals("testPowerOfFourCheck(),Checking if the number is power of four does not return the correct output"
                , new String("The number is a power of four"), powerOfFour.powerOfFourCheck(64));

        assertNotEquals("testPowerOfFourCheck(),Checking if the number is power of four does not return the correct output"
                , new String("The number is a power of four"), powerOfFour.powerOfFourCheck(122));


    }

}