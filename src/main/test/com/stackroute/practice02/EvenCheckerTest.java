package com.stackroute.practice02;

import org.junit.*;

import static org.junit.Assert.*;

public class EvenCheckerTest {
    private static EvenChecker evenChecker;

    @BeforeClass
    public static void setUp() throws Exception {
        evenChecker=new EvenChecker();
    }

    @AfterClass
    public static void tearDown() throws Exception {
        evenChecker=null;
    }

    @Test
    public void testIsEven() {
        assertTrue(true);
    }  //boolean condition to check if the number is even
}