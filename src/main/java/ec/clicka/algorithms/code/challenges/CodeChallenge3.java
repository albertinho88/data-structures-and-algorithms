package ec.clicka.algorithms.code.challenges;

import ec.clicka.util.ArrayUtil;

/**
 * INSTRUCTIONS:
 * - Sort the following values using radix sort: "bcdef", "dbaqc", "abcde", "omadd","bbbbbb"
 * - All values are in lowercase, so don't worry about uppercasing/lowercasing the values
 * - You can use the existing code
 */
public class CodeChallenge3 {
    public static void main(String[] args) {
        String[] stringsArray = {"bcdef", "dbaqc", "abcde", "omadd","bbbbb"};
        System.out.println(ArrayUtil.printArray(stringsArray, 0,stringsArray.length));
        radixSort(stringsArray, 127, 5); // 127 is the number of characters at the ASCII table
    }

    public static void radixSort(String[] input, int radix, int width) {
        for (int i=width-1; i >= 0; i--) {
            radixSingleSort(input, i, radix);
            System.out.println(ArrayUtil.printArray(input,0, input.length));
        }
    }

    public static void radixSingleSort(String[] input, int position, int radix) {
        int numItems = input.length;
        int[] countArray = new int[radix];

        for (String value : input) {
            countArray[getAsciiValue(position, value)]++;
        }

        // Adjust the count array
        for (int j=1; j<radix;j++) {
            countArray[j] += countArray[j-1];
        }

        String[] temp = new String[numItems];
        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
            temp[--countArray[getAsciiValue(position, input[tempIndex])]] = input[tempIndex];
        }

        for (int tempIndex = 0; tempIndex < numItems; tempIndex++) {
            input[tempIndex] = temp[tempIndex];
        }
    }

    public static int getAsciiValue(int position, String value) {
        return value.charAt(position);
    }
}
