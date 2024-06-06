package ec.clicka.algorithms.sorting;

import ec.clicka.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BucketSort {
    public static void main(String[] args) {
        int[] intArray = {54,46,83,66,95,91,43};

        bucketSort(intArray);

        System.out.println(ArrayUtil.printArray(intArray));
    }

    public static void bucketSort(int[] input) {
        List<Integer>[] buckets = new List[10];

        for (int i=0; i<buckets.length;i++) {
            // using array lists for the buckets
            //buckets[i] = new ArrayList<Integer>();

            // using linked lists for the buckets
            buckets[i] = new LinkedList<>();
        }

        // scattering phase
        for (int i = 0; i<input.length;i++) {
            buckets[hash(input[i])].add(input[i]);
        }

        for (List bucket : buckets) {
            Collections.sort(bucket);
        }

        // gattering phase
        int j=0;
        for (int i=0; i<buckets.length; i++) {
            for (int value : buckets[i]) {
                input[j++] = value;
            }
        }

    }

    private static int hash(int value) {
        return value / (int) 10;
    }
}
