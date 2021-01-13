package com.nonsopracticetdd.tdd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testValuesCanAcceptNumbers(){
        Addition addition=new Addition();
        addition.setNumber1(23);
        addition.setNumber2(10);
        assertEquals(23,addition.getNumber1());
        assertEquals(10,addition.getNumber2());
    }
    @Test
    void testValuesCanBeAdded(){
        Addition addition= new Addition();
        addition.setNumber1(3);
        addition.setNumber2(3);
        addition.setSum(addition.getNumber1(),addition.getNumber2());
        assertEquals(6,addition.getSum());

    }
}