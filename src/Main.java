import java.util.*;

public class Main {
    public static final String TEXT = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum";
    public static final String FL = "Ivanov Petrov Sidorov Makarov";


    public static void main(String[] args) {
        WordsChecker checker = new WordsChecker(TEXT);
        Map<Character, Integer> freqs = new HashMap<>();

        for (int i = 0; i < TEXT.length(); i++) {
            char c = TEXT.charAt(i);
            if (Character.isLetter(c)) {
                continue;
            }
            if (freqs.containsKey(c)) {
                freqs.put(c, freqs.get(c) + 1);
            } else {
                freqs.put(c, 1);
            }
        }

        int max = -1;
        char maxc = 0;
        for (Character c : freqs.keySet()) {
            int freq = freqs.get(c);
            if (freq > max) {
                max = freq;
                maxc = c;
            }
        }
        System.out.println("Максю частота у символа  " + maxc + ": " + max);
        WordsChecker text1 = new WordsChecker(TEXT);
        System.out.println(checker.hasWord("Hello"));
        System.out.println(checker.hasWord("amet"));

        PersonComparator cmpr = new PersonComparator(10);
        Collections.sort(FL, cmpr.compare());
        System.out.println();

    }

}