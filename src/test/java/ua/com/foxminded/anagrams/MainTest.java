package ua.com.foxminded.anagrams;

import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    void main_shouldPrintCompleteAnagram_ofInputString() {
        Main.main(new String[]{"as1d"});
        Main.main(new String[]{"as1d gh65r"});
    }
}