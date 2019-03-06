package com.aashiq;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;


public class PersonTest {

    private Person aashiq = new Person("Aashiq");



    @Test //Testing Object equality
    public void getName() throws Exception{


        //if name is Aashiq
        assertEquals("Aashiq", aashiq.getName()); // will pass
    }

    @Test  //Testing Object Identity
    public void intTest() throws Exception {

        int eyes = 2;
        int ears = 2;

        // if(eyes == ears)
        assertSame(eyes, ears);    // will pass
    }

    @Test (timeout = 2000)//Testing Object Identity and added timeout
    public void intTest2() throws Exception {

        int nose = 1;
        int lips = 2;

        // if(nose != lips)
        assertNotSame(nose, lips);    // will pass
    }


    @Test (expected = IllegalStateException.class) //Testing Fail Test
    public void nameFail() throws Exception{
        aashiq.printGenderMessage();
    }

    @Ignore ("Adding Disable Test") //Added the Disable Test
    @Test
    public void genderDisable() throws Exception{
        aashiq.gender();
        String msg = aashiq.getGenderMessage();
        assertEquals("I am male", msg);
    }

    @Test //Adding test for false
    public void testUnhappyToStart() throws Exception{
        assertFalse(aashiq.isHappy());
    }

    @Test //Adding test for true
    public void testHappyToEnd() throws Exception{
        assertTrue(aashiq.isReallyHappy());
    }


}

