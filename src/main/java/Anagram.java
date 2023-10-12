import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Anagram {

    public static List<List<String>> findAnagramPairs(List<String> words) {
        List<List<String>> anagramsWords = new ArrayList<>();
        List<String> sortedWord = new ArrayList<>();
        for (String word : words){
            char[] charsArrays = word.toCharArray();
            Arrays.sort(charsArrays);
            String charArrayToString = new String(charsArrays);
            sortedWord.add(charArrayToString);
        }

        for (String word : sortedWord){
            List<String> words2 = compare(sortedWord, word, words);
            if (!anagramsWords.contains(words2)){
                anagramsWords.add(words2);
            }

        }
        return anagramsWords;
    }

    public static List<String> compare(List<String> sortedWords, String word, List<String> words){
        List<String> anagramSortedWord = new ArrayList<>();
        for (String word2 : sortedWords){
            if (word2.equals(word)){
                anagramSortedWord.add(word2);
            }
        }

        List<String> anagramWords = new ArrayList<>();
        for (String word3 : words) {
            char[] charsArrays = word3.toCharArray();
            Arrays.sort(charsArrays);
            String charArrayToString = new String(charsArrays);
            if (word3.length() == anagramSortedWord.get(0).length() && charArrayToString.equals(anagramSortedWord.get(0))){
                anagramWords.add(word3);
            }
        }

        return anagramWords;
    }



    public static void main(String[] args) {
        List<String> words = List.of("listen", "enlist", "triangle", "integral", "hello", "world", "act", "cat");
        List<List<String>> anagram = findAnagramPairs(words);
        System.out.println(anagram);
    }
}