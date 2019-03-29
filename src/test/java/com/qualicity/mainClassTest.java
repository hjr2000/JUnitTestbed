package com.qualicity;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class mainClassTest {

    @Before
    public void beforeMethod(){
        System.out.println("Before!");
    }

    @Test
    public void testMoodAnalysis() throws  Exception {
        mainClass mainClass = new mainClass();
        String mood = mainClass.analyseMood();
        Assert.assertEquals(mood, "Happy");
        System.out.println("Here - 1!");
    }

    @Test
    public void testMoodAnalysisAgain() throws  Exception {
        mainClass mainClass = new mainClass();
        String mood = mainClass.analyseMood();
        Assert.assertNotEquals(mood, "Sad");
        System.out.println("Here - 2!");
    }
}