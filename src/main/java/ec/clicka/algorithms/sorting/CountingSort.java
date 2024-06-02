package ec.clicka.algorithms.sorting;

import ec.clicka.util.ArrayUtil;

import java.lang.reflect.Array;

public class CountingSort {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};

        System.out.println(ArrayUtil.printArray(numbers, 0, numbers.length));
        countingSort(numbers, 1,10);
        System.out.println(ArrayUtil.printArray(numbers, 0, numbers.length));
    }

    public static void countingSort(int[] input, int min, int max) {
        int[] countArray = new int[(max - min) + 1];

        for (int i = 0; i < input.length; i++) {
            countArray[input[i] - min]++;
        }

        int j = 0;
        for (int i = min; i <= max; i++) {
            while (countArray[i-min] > 0) {
                input[j++]=i;
                countArray[i-min]--;
            }
        }

    }
}
