
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.commons.util.StringUtils;

import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {
   static StringManipulator strManipulation;
    @BeforeAll
    static  void createStringManipulatorObject(){
        strManipulation = new StringManipulator();

    }

    @ParameterizedTest
    @ValueSource(strings ={"mom","dad"})
    @DisplayName("returns true when a palindrome string is passed as input")
    void testIsPalindrome(Object input) {

        assertTrue(strManipulation.isPalindrome(input));
    }


    @ParameterizedTest
    @ValueSource(strings ={"cat","java"})
    @DisplayName("returns false when a non palindrome string is passed to the method")
    // reverseString is tested as part of palindrome
    void testIsNotAPalindrome(String input) {

        //Assert
        assertFalse(strManipulation.isPalindrome(input));

    }

    @Test
    @DisplayName("returns reversed string when given a string as input")
    void testreverseString_returnsReveresedString(){
        //arrange
        String strToReverse = "problem";

        //act
        String ReversedString = strManipulation.reverseString(strToReverse);
        //assert
        assertEquals("melborp",ReversedString);
    }


}