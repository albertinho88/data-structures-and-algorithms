package ec.clicka.algorithms.code.challenges;

import ec.clicka.util.ArrayUtil;

/**
 *  INSTRUCTIONS:
 * - Modify the merge sort algorithm so that it sorts integers in DESCENDING order
 * - Use the usual example array
 * - Start with existing code
 */
public class CodeChallenge1 {
    public static void main(String[] args) {
        int[] numbers = {20,35,-15,7,55,1,-22};
        System.out.println(ArrayUtil.printArray(numbers, 0, numbers.length));
        mergeSort(numbers, 0, numbers.length);
        System.out.println(ArrayUtil.printArray(numbers, 0, numbers.length));
    }

    public static void mergeSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }
        int mid = (start + end) / 2;

        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

    public static void merge(int[] input, int start, int mid, int end) {
        if (input[mid - 1] >= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] temp = new int[end - start];

        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] >= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }
}
