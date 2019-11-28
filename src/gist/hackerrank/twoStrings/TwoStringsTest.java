package gist.hackerrank.twoStrings;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoStringsTest {
    TwoStrings twoStrings = new TwoStrings();

    @Test
    void twoStrings() {
        assertEquals("YES",twoStrings.twoStrings("hello", "world"), "Hello WOrld has substring");
        assertEquals("NO",twoStrings.twoStrings("hi", "world"), "Hi world has no substring");
    }
}