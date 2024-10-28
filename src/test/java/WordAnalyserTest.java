import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class WordAnalyserTest {

    static WordAnalyser analyser;
    @BeforeAll
     static void setup(){
        analyser = new WordAnalyser();
    }

    //not null check

    @Test
    @DisplayName("returns longest word/words when passed in a sentence as input")
    void testFindLongestWords_returnsLongestWord() {
        String input = "This is some example test texmple data - come up with your own!";
        String[] longestWords = analyser.findLongestWords(input);

        assertEquals("example",longestWords[0]);
        assertEquals("texmple",longestWords[1]);



    }
    //Todo
    //check for non null

    @Test
    @DisplayName("returns Map of frequency of each letter when passed in a sentence as input")
    void testCalculateLetterFrequency_returnsFrequencyOfLettersInText() {
        String inputText = "Hello world!";
        Map<Character, Integer> characterIntegerMap = analyser.calculateLetterFrequency(inputText);
        assertEquals(3, characterIntegerMap.get('l'));


    }
}