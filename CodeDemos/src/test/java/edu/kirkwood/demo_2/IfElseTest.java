package edu.kirkwood.demo_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IfElseTest {

    @Test
    void getGrade() {
        assertEquals("A", IfElse.getGrade(90));
    }
}