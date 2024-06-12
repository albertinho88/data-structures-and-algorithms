package ec.clicka.codeChallenges;

import java.util.HashMap;

public class AnagramsMain {
    public static void main(String[] args) {
        String word1 = "listen";
        String word2 = "silent";
        System.out.println(word1 + " and " + word2 + (areAnagrams(word1, word2)?" are ":" are not ") + "anagrams");

        word1 = "binary";
        word2 = "brainy";
        System.out.println(word1 + " and " + word2 + (areAnagrams(word1, word2)?" are ":" are not ") + "anagrams");
    }

    public static boolean areAnagrams(String word1, String word2) {

        if (word1.length() != word2.length()) {
            return false;
        }

        HashMap<Character, Integer> w1HashMap = new HashMap<>();
        for (int i=0;i<word1.length();i++) {
            w1HashMap.put(word1.charAt(i), w1HashMap.getOrDefault(word1.charAt(i), 0) + 1);
        }

        HashMap<Character, Integer> w2HashMap = new HashMap<>();
        for (int i=0;i<word2.length();i++) {
            w2HashMap.put(word2.charAt(i), w2HashMap.getOrDefault(word2.charAt(i), 0) + 1);
        }

        for (Character key : w1HashMap.keySet()) {
            if (!w2HashMap.containsKey(key) || w2HashMap.get(key) != w1HashMap.get(key)) {
                return false;
            }
        }

        return true;
    }
}
