package ec.clicka.queues.codeChallenges;

import java.util.LinkedList;

/**
 * INSTRUCTIONS:
 * - Using a stack and a queue, determine whether a string is a palindrome
 * - Strings may contain punctuation and spaces. They should be ignored. Case should be ignored.
 * - Examples:
 *      1. "I did, did I?" is a palindrome
 *      2. "Racecar" is a palindrome
 *      3. "hello" is not a palindrome
 */
public class QueueCodeChallenge1 {
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
        LinkedList<Character> queue = new LinkedList<>();
        String lowerCase = string.toLowerCase();

        for (int i=0; i < lowerCase.length(); i++) {
            char c = lowerCase.charAt(i);
            if (c >= 'a' && c <= 'z') {
                stack.push(c);
                queue.addLast(c);
            }
        }

        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.removeFirst())) {
                return false;
            }
        }

        return true;
    }
}
