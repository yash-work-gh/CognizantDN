package com.example;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import com.example.Calculator;

import static org.junit.Assert.*;

import java.beans.Transient;

public class CalculatorAAATest {
    
    private Calculator calculator;

    @Before 
    public void setUp(){
        //Arrange
        calculator = new Calculator();
        System.out.println("Setup Executed.");
    }

    @After
    public void tearDown(){
        //Teardown
        calculator=null;
        System.out.println("Teardown executed.");
    }

    @Test
    public void testAdditionWithNegative(){
        //Act
        int result = calculator.add(-3,7);

        //Assert
        assertEquals("-3 + 7 should be 4",4,result);
    }
}
