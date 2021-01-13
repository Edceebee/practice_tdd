
package com.nonsopracticetdd.tdd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositiveAndNegativeTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatValueCanAcceptInput(){

        PositiveAndNegative input = new PositiveAndNegative();
        //given that
        input.setNumber(7);

        assertEquals(7, input.getNumber());
    }

    @Test
    void testThatValueCanDetectPositiveIntegers() {
        PositiveAndNegative positive = new PositiveAndNegative();
        //given that
        positive.setNumber(-2);

        positive.setPositive(positive.getNumber());
        assertTrue(false, positive.getPositive());
    }

    @Test
    void testThatValueCanDetectNegativeNumbers(){
        PositiveAndNegative negative = new PositiveAndNegative();
        //given that
        negative.setNumber(-5);
        negative.setNegative(negative.getNumber());
        assertTrue(true, negative.getNegative());

    }

}