package ec.clicka.algorithms.sorting;

import ec.clicka.util.ArrayUtil;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {20,35,-15,7,55,1,22};

        for (int lastUnsortedIndex = numbers.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (numbers[i] > numbers[i+1]) {
                    swap(numbers, i, i+1);
                }
            }
        }

        System.out.println(ArrayUtil.printArray(numbers));
    }

    public static void swap(int[] numbers, int i, int j) {
        if (i == j) {
            return;
        }

        int tempNumber = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = tempNumber;
    }
}
