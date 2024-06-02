package ec.clicka.algorithms.code.challenges;

import ec.clicka.util.ArrayUtil;

/**
 * INSTRUCTIONS:
 * - Change insertion sort so that it uses recursion
 * - Sort the usual example array
 * - You can start with the existing code
 */
public class CodeChallenge2 {
    public static void main(String[] args) {

        int[] numbers = {20,35,-15,7,55,1,-22};

        insertionSort(numbers, numbers.length);
        System.out.println(ArrayUtil.printArray(numbers,0,numbers.length));
    }

    public static void insertionSort(int[] input, int numItems) {

        if (numItems < 2) {
            return;
        }

        insertionSort(input, numItems - 1);
        System.out.println("num items: " + numItems);
        int newElement = input[numItems-1];
        int i;
        for (i = numItems-1; i > 0 && input[i - 1] > newElement; i--) {
            input[i] = input[i - 1];
        }
        input[i] = newElement;
        System.out.println(ArrayUtil.printArray(input,0,input.length));
        System.out.println("-------------------------");
    }
}
