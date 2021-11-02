package ua.com.foxminded.anagrams;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnagramTest {
    private Anagram anagram = new Anagram();

    @Test
    public void checkExpected_NullPointerException() throws NullPointerException {
        assertThrows(NullPointerException.class,
                () -> {
                    anagram.reverseWords(null);
                });

    }

    @Test
    public void reverseWords_shouldMakeAnagram_ofInputText() {
        String actual = anagram.reverseWords("qwe123rty");
        String expected = "ytr123ewq";
        assertEquals(expected, actual);
    }

    @Test
    public void reverseWords_shouldOutPutAnagram() {
        String actual = anagram.reverseWords("qwe123rty");
        String expected = "qwe123rty";
        assertNotSame(expected, actual);
    }

    @Test
    public void reverseWords_shouldSaveSpaces() {
        String actual = anagram.reverseWords("asd fgh qwe zxc");
        String expected = "dsa hgf ewq cxz";
        assertEquals(expected, actual);
    }
}