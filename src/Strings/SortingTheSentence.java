package Strings;
//https://leetcode.com/problems/sorting-the-sentence/description/
public class SortingTheSentence {
    public static void main(String[] args) {
        String s = "is2 This1 sentence4 first3";
        String res = sortSentence(s);
        System.out.println(res);
    }
        static String sortSentence(String s) {
            String[] words = s.split(" ");
            String[] bucket = new String[words.length];
            for (String word : words) {
                // Get 0th-based index from the word
                int index = Character.getNumericValue(word.charAt(word.length() - 1)) - 1;
                // Store the original word without a numeric value
                bucket[index] = word.substring(0, word.length() - 1);
            }

            return String.join(" ", bucket);
        
    }
}
