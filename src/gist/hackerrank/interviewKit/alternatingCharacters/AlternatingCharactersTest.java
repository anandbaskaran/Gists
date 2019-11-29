package gist.hackerrank.interviewKit.alternatingCharacters;

import static org.junit.jupiter.api.Assertions.*;

class AlternatingCharactersTest {

    private AlternatingCharacters alternatingCharacters = new AlternatingCharacters();


    @org.junit.jupiter.api.Test
    void alternatingCharacters() {
        assertEquals(0, alternatingCharacters.alternatingCharacters("ABABABAB"));
        assertEquals(4, alternatingCharacters.alternatingCharacters("AAABBB"));

    }
}