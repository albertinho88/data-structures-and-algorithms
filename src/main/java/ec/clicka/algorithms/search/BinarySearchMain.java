package ec.clicka.algorithms.search;

import ec.clicka.util.ArrayUtil;

import java.util.Arrays;

public class BinarySearchMain {
    public static void main(String[] args) {
        int[] intArray = {55,35,20,7,1,-15,-22, 25,5,-8,6,12};
        System.out.println(ArrayUtil.printArray(intArray));
        System.out.println("Searched value position: " + recursiveBinarySearch(intArray, 35));
        System.out.println("Searched value position: " + recursiveBinarySearch(intArray, -15));
        System.out.println("Searched value position: " + recursiveBinarySearch(intArray, 55));
        System.out.println("Searched value position: " + recursiveBinarySearch(intArray, 105));

    }

    public static int recursiveBinarySearch(int[] input, int value) {
        Arrays.sort(input);
        return recursiveBinarySearch(input, value, 0, input.length);
    }

    public static int recursiveBinarySearch(int[] input, int value, int start, int end) {
        if (start >= end) {
            return -1;
        }

        int midpoint = (start + end) / 2;

        if (input[midpoint] == value) {
            return midpoint;
        }else if (input[midpoint] < value) {
            return recursiveBinarySearch(input, value, midpoint + 1, end);
        } else {
            return recursiveBinarySearch(input, value, start, midpoint);
        }
    }

    public static int iterativeBinarySearch(int[] input, int value) {
        Arrays.sort(input);
        int start = 0;
        int end = input.length;

        while (start < end) {
            int midpoint = (start + end) / 2;
            System.out.println("midpoint : " + midpoint);
            if (input[midpoint] == value) {
                return midpoint;
            } else if (input[midpoint] < value) {
                start = midpoint + 1;
            } else {
                end = midpoint;
            }
        }

        return -1;
    }
}
