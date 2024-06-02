package ec.clicka.algorithms.sorting;

import ec.clicka.util.ArrayUtil;

public class MergeSort {
    public static void main(String[] args) {
        int[] numbers = new int[7];
        numbers[0] = 20;
        numbers[1] = 35;
        numbers[2] = -15;
        numbers[3] = 7;
        numbers[4] = 55;
        numbers[5] = 1;
        numbers[6] = -22;

        System.out.println(ArrayUtil.printArray(numbers, 0, 7));
        mergeSort(numbers, 0, numbers.length);

        System.out.println(ArrayUtil.printArray(numbers, 0, 7));
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
        System.out.println("merge: " + ArrayUtil.printArray(input, 0, input.length) + ", start: " + start + ", mid: " + mid + ", end: " + end);
        if (input[mid - 1] <= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] temp = new int[end - start];

        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }

}
