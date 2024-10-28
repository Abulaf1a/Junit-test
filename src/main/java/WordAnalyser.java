import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class WordAnalyser {
    public String[] findLongestWords(String text) {
        // TODO: Implement the logic to find the longest word(s) in the given text
        String[] allWordsinText = text.split(" ");
        ArrayList<String> allWordsinTextArrayList = (ArrayList<String>) Arrays.asList(allWordsinText);
        String[] wordsToReturn;

        String longestWord = allWordsinTextArrayList.getFirst();
        for(int i=1;i< allWordsinTextArrayList.size();i++){
            if(allWordsinTextArrayList.get(i).length() > longestWord.length()){
                longestWord = allWordsinTextArrayList.get(i);
            }


        }
        return new String[]{""};
    }

    public Map<Character, Integer> calculateLetterFrequency(String text) {
        // TODO: Implement the logic to calculate the frequency of each letter in the given text
        return null;
    }
}