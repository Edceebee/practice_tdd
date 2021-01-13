package com.nonsopracticetdd.tdd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplesTestTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatValueCanAcceptInput() {
        Multiples input = new Multiples();
        // given that
        input.setNumber1(2);
        input.setNumber2(3);

        assertEquals(2, input.getNumber1());
        assertEquals(3, input.getNumber2());
    }

    @Test
    void testThatMultipleIsFunctioning() {
        Multiples newMultiples = new Multiples();
        // given that

        newMultiples.setNumber1(2);
        newMultiples.setNumber2(4);

        newMultiples.setMultiple(newMultiples.getNumber1(), newMultiples.getNumber2());
        assertFalse(false, newMultiples.getMultiple());

    }
}


