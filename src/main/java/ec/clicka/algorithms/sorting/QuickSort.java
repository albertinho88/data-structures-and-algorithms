package ec.clicka.algorithms.sorting;

import ec.clicka.util.ArrayUtil;

public class QuickSort {
    public static void main(String[] args) {
        int[] numbers = new int[7];
        numbers[0] = 20;
        numbers[1] = 35;
        numbers[2] = -15;
        numbers[3] = 7;
        numbers[4] = 55;
        numbers[5] = 1;
        numbers[6] = -22;

        quickSort(numbers, 0, numbers.length);

        System.out.println(ArrayUtil.printArray(numbers, 0, numbers.length));
    }

    public static void quickSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }

        System.out.println(ArrayUtil.printArray(input, 0, input.length));
        int pivotIndex = partition(input, start, end);
        //System.out.println("pivot: " + input[pivotIndex] + ", start: " + start + ", end: "+ end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);
    }

    public static int partition(int[] input, int start, int end) {
        // This is using the first element as the pivot
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {

            //NOTE:empty loop body
            while (i < j && input[--j] >= pivot) ;
            if (i < j) {
                input[i] = input[j];
            }

            //NOTE:empty loop body
            while (i < j && input[++i] <= pivot) ;
            if (i < j) {
                input[j] = input[i];
            }
        }

        input[j] = pivot;
        return j;
    }


}
