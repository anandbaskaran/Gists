package gist.hackerrank.codility.brackets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BracketsTest {
    private Brackets brackets = new Brackets();
    @Test
    void solution() {
        assertEquals(1, brackets.solution("{[()()]}"));
        assertEquals(0, brackets.solution("([)()]"));
    }
}