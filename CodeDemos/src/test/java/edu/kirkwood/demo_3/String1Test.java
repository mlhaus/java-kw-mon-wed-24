package edu.kirkwood.demo_3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class String1Test {
    private String1 string1;

    @BeforeEach
    void setUp() {
        string1 = new String1();
    }

    @Test
    void helloName() {
        String expected = "Hello Bob!";
        String actual = string1.helloName("Bob");
        assertEquals(expected, actual);
    }

    @Test
    void makeOutWord() {
        String expected = "<<Yay>>";
        String actual = string1.makeOutWord("<<>>", "Yay");
        assertEquals(expected, actual);
        expected = "abYAYyz";
        actual = string1.makeOutWord("abyz", "YAY");
        assertEquals(expected, actual);
    }

    @Test
    void firstHalf() {
        assertEquals("Woo", string1.firstHalf("WooHoo"));
        assertEquals("", string1.firstHalf(""));
        assertEquals("Hello", string1.firstHalf("HelloThere"));
    }

    @Test
    void theEnd() {
        assertEquals("H", string1.theEnd("Hello", true));
        assertEquals("o", string1.theEnd("Hello", false));
        assertEquals("P", string1.theEnd("Pi", true));
        assertEquals("i", string1.theEnd("Pi", false));
    }

    @Test
    void endsLy() {
        assertEquals(true, string1.endsLy("oddly"));
        assertEquals(false, string1.endsLy("cat"));
        assertEquals(false, string1.endsLy(""));
    }

    @Test   
    void middleThree() {
        assertEquals("ell", string1.middleThree("Hello"));
        assertEquals("ter", string1.middleThree("Yesterday"));
    }

}