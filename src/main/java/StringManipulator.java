public class StringManipulator {
    public  String reverseString(String input) {

        // TODO: Implement the logic to reverse the input string

        StringBuilder sb = new StringBuilder(input);
        StringBuilder reversedString = sb.reverse();
        return reversedString.toString();
    }



    public boolean isPalindrome(Object input) {
        // TODO: Implement the logic to check if the input string is a palindrome
        return input.equals(reverseString((String) input));
        // (A palindrome = same forwards as backwards)
    }
}