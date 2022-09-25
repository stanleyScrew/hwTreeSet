import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    public java.lang.System System;
    protected String text;
    protected Set<String> words = new HashSet<>();

    public WordsChecker(String text) {
        this.text = text;
        String[] parts = text.split("\\P{IsAlphabetic}+");
        for (String word : parts) {
            words.add(word);
        }

    }

    public boolean hasWord(String queryWord) {
        return words.contains(queryWord);
    }
}

