import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class WordAnalyserTest {

    static WordAnalyser analyser;
    @BeforeEach
      void setup(){
        analyser = new WordAnalyser();
    }

    //not null check

    @Test
    @DisplayName("returns longest word/words when passed in a sentence as input")
    void testFindLongestWords_returnsLongestWord() {
        String input = "This is some example test texmpyuyule data - come up with your own!";
        String[] longestWords = analyser.findLongestWords(input);

        assertEquals("texmpyuyule",longestWords[0]);


        String input2 = "Package this code as library";
        String[] longestWords1 = analyser.findLongestWords(input2);

        assertEquals("Package",longestWords1[0]);
        assertEquals("library", longestWords1[1]);

        String emptyInput="";
        String[] longestWords2 = analyser.findLongestWords(emptyInput);
        Assertions.assertNotNull(longestWords2);


    }

    @Test
    @DisplayName("returns empty Array if null or empty string is passed")
    void testFindLongestWords_retursEmptyStringArrayifNullStringPassed() {

        String emptyInput="";
        String[] longestWords2 = analyser.findLongestWords(emptyInput);
        Assertions.assertNotNull(longestWords2);
    }


    @Test
    @DisplayName("returns Map of frequency of each letter when passed in a sentence as input")
    void testCalculateLetterFrequency_returnsFrequencyOfLettersInText() {
        String inputText = "Hello world!";
        Map<Character, Integer> characterIntegerMap = analyser.calculateLetterFrequency(inputText);
        assertEquals(3, characterIntegerMap.get('l'));
        assertNull( characterIntegerMap.get('q'));
    }
}