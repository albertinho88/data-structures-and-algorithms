package ec.clicka.codeChallenges;

import java.util.LinkedList;
import java.util.List;

/**
 * For this challenge, the input is a string of words, and the output should be the words in reverse but with the letters in the original order.
 * For example, the string “Dog bites man” should output as “man bites Dog.”
 *
 * After you’ve solved this challenge, try adding sentence capitalization and punctuation to your code.
 * So, the string “Codecademy is the best!” should output as “Best the is Codecademy!”
 */
public class WordReversalMain {
    public static void main(String[] args) {
        String wordToReverse = "Dog bites man";
        System.out.println(wordToReverse);
        System.out.println(reverseWord(wordToReverse));

        wordToReverse = "Codecademy is the best";
        System.out.println(wordToReverse);
        System.out.println(reverseWord(wordToReverse));

    }

    public static String reverseWord(String word) {
        StringBuilder reversedWord = new StringBuilder();
        String[] words = word.split(" ");
        LinkedList<String> stack = new LinkedList<>();
        for (int i=0; i<words.length;i++) {
            stack.push(words[i]);
        }
        while (!stack.isEmpty()) {
            reversedWord.append(stack.pop() + " ");
        }

        return reversedWord.toString();
    }
}
