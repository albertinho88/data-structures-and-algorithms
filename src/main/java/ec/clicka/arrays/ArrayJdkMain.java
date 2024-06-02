package ec.clicka.arrays;

import ec.clicka.util.ArrayUtil;

import java.util.Arrays;

public class ArrayJdkMain {
    public static void main(String[] args) {
        int[] numbers = new int[7];
        numbers[0] = 20;
        numbers[1] = 35;
        numbers[2] = -15;
        numbers[3] = 7;
        numbers[4] = 55;
        numbers[5] = 1;
        numbers[6] = -22;

        //Arrays.sort(numbers);
        //Arrays.sort(numbers, 1 ,4);
        Arrays.parallelSort(numbers);
        System.out.println(ArrayUtil.printArray(numbers, 0, numbers.length));
    }
}
