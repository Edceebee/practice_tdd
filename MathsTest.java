package com.nonsopracticetdd.tdd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathsTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatValueCanAcceptNumber(){
        Maths input = new Maths();
        // given that
        input.setNumber1(50);
        input.setNumber2(25);
        assertEquals(50, input.getNumber1());
        assertEquals(25, input.getNumber2());
    }

    @Test
    void testThatValuesCanBeMultiplied(){
        Maths multiplication = new Maths();
        //given that
        multiplication.setNumber1(4);
        multiplication.setNumber2(2);

        multiplication.setMultiplication(multiplication.getNumber1(), multiplication.getNumber2());
        assertEquals(8, multiplication.getMultiplication());
    }

    @Test
    void testThatValuesCanBeDivided(){
        Maths division = new Maths();
        //given that
        division.setNumber1(6);
        division.setNumber2(2);
        //when
        division.setDivision(division.getNumber1(), division.getNumber2());
        assertEquals(3, division.getDivision());
    }

    @Test
    void testThatValuesCanBeAdded(){
        Maths addition = new Maths();
        //given that
        addition.setNumber1(4);
        addition.setNumber2(4);

        //when
        addition.setAddition(addition.getNumber1(), addition.getNumber2());
        assertEquals(6, addition.getAddition());

    }

    @Test
    void testThatValuesCanBeSubtracted(){
        Maths subtraction = new Maths();
        //given that
        subtraction.setNumber1(5);
        subtraction.setNumber2(4);

        subtraction.setSubtraction(subtraction.getNumber1(), subtraction.getNumber2());
        assertEquals(1, subtraction.getSubtraction());
    }
}