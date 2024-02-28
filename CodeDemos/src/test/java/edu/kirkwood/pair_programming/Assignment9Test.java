package edu.kirkwood.pair_programming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Assignment9Test {
    @Test
    void getSum() {
        assertEquals(3, Assignment9.getSum(1, 2));
        assertEquals(3.3, Assignment9.getSum(1.1, 2.2), 1);
    }
}