package ec.clicka.hashtables.codeChallenges;

import ec.clicka.util.ArrayUtil;

public class HashingCodeChallenge1 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        System.out.println(ArrayUtil.printArray(nums));

        int[] numsToAdd = {59382,43,6894,500,99,-58};
        for(int i=0; i < numsToAdd.length; i++) {
            nums[hash(numsToAdd[i])] = numsToAdd[i];
        }

        System.out.println(ArrayUtil.printArray(nums));
    }

    public static int hash(int value) {
        return Math.abs(value % 10);
    }
}
