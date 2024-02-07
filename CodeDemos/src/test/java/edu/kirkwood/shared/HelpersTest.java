package edu.kirkwood.shared;

import org.junit.jupiter.api.Test;

import static edu.kirkwood.shared.Helpers.round;
import static org.junit.jupiter.api.Assertions.*;

class HelpersTest {

    @Test
    void roundBasic() {
        String expected = "3.14";
        String actual = round(3.14159, 2);
        assertEquals(expected, actual);

        expected = "3.142";
        actual = round(3.14159, 3);
        assertEquals(expected, actual);
    } // end roundBasic

    @Test
    void roundDown() {
        // 1 decimal place
        String expected = "3.1";
        String actual = round(3.12, 1);
        assertEquals(expected, actual);

        // 2 decimal places
        expected = "3.11";
        actual = round(3.112, 2);
        assertEquals(expected, actual);
    }
    
    @Test
    void roundUp() {
        // 1 decimal place
        String expected = "3.2";
        String actual = round(3.19, 1);
        assertEquals(expected, actual);

        // 2 decimal places
        expected = "3.12";
        actual = round(3.119, 2);
        assertEquals(expected, actual);
    }


}