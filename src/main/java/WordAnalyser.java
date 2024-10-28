import java.util.*;

public class WordAnalyser {

    public String[] findLongestWords(String text) {
        // TODO: Implement the logic to find the longest word(s) in the given text
        if (text == null || text.isEmpty()) {
            return new String[]{}; // Return empty array if input is null or empty
        }


        {
            String[] allWordsinText = text.split(" ");
            List<String> allWordsinTextArrayList = Arrays.asList(allWordsinText);
            List<String> wordsToReturn = new ArrayList<>();

            int maxlength = 0;
           // wordsToReturn.add(allWordsinTextArrayList.getFirst());
            for (String eachWord : allWordsinTextArrayList) {
                if (eachWord.length() > maxlength) {
                    maxlength = eachWord.length();
                    wordsToReturn.clear();
                    wordsToReturn.add(eachWord);
                } else if (eachWord.length() == maxlength) {
                    wordsToReturn.add(eachWord);
                }

            }

            for(String word: wordsToReturn){
                System.out.println(word);
            }
            return wordsToReturn.toArray(new String[0]);
        }
    }

        public Map<Character, Integer> calculateLetterFrequency (String text){
            // TODO: Implement the logic to calculate the frequency of each letter in the given text
            Map<Character,Integer> letterFrequencyMap= new HashMap<>();
            for(int i=0; i< text.length();i++){
                if(letterFrequencyMap.containsKey(text.charAt(i))){
                    letterFrequencyMap.replace(text.charAt(i),letterFrequencyMap.get(text.charAt(i))+1);
                }
                else {
                    letterFrequencyMap.put(text.charAt(i), 1);
                }
            }
            return letterFrequencyMap;
        }

}