package ec.clicka.stacks.codeChallenges;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Locale;

/**
 * INSTRUCTIONS:
 * - Using a stack, determine whether a string is a palindrome
 * - Strings may contain punctuation and spaces. They should be ignored. Case should be ignored.
 * - Examples:
 *      1. "I did, did I?" is a palindrome
 *      2. "Racecar" is a palindrome
 *      3. "hello" is not a palindrome
 */
public class StackCodeChallenge1 {
    public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string) {
        LinkedList<Character> stack = new LinkedList<>();
        StringBuilder stringNoPunctuation = new StringBuilder(string.length());
        String lowerCase = string.toLowerCase();

        for (int i=0; i < lowerCase.length(); i++) {
            char c = lowerCase.charAt(i);
            if (c >= 'a' && c <= 'z') {
                stringNoPunctuation.append(c);
                stack.push(c);
            }
        }

        StringBuilder reversedString = new StringBuilder(stack.size());
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }

        return stringNoPunctuation.toString().equalsIgnoreCase(reversedString.toString());
    }
}
