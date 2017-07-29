package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;




import static org.junit.Assert.*;

/**
 * Created by phillipdelia on 7/27/17.
 */
public class MethodsClassTest {



    @Before
    public void setUp() throws Exception {
        System.out.println("Setting up...");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Cleaning up");
    }


    @Test
    public void testBasicCase() throws Exception {
        System.out.println("Running basic test");
        assertTrue(MethodsClass.testBasicCase(1));
        assertFalse(MethodsClass.testBasicCase(2));
    }@Test
    public void testLargeNumbers () throws Exception {
        System.out.println("Testing large numbers");
        assertTrue(MethodsClass.testBasicCase(10000002));
        assertFalse(MethodsClass.testBasicCase(986974958));
    }

    @Test
    public void testMediumNumbers () throws Exception {
        System.out.println("Testing medium numbers");
        assertTrue(MethodsClass.testBasicCase(10));
        assertFalse(MethodsClass.testBasicCase(92));
    }

    @Test
    public void testNegativeNumbers () throws Exception {
        System.out.println("Testing negative values");
        thrown.expect(BadInputException.class);
        MethodsClass.testBasicCase(-1);
        MethodsClass.testBasicCase(-20000);
    }

    @Rule //Another annotation directed to JUnit
            ExpectedException expected = ExpectedException.none();



}