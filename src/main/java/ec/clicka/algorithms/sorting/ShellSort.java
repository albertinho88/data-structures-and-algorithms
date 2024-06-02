package ec.clicka.algorithms.sorting;

public class ShellSort {
    public static void main(String[] args) {
        int[] numbers = new int[7];
        numbers[0] = 20;
        numbers[1] = 35;
        numbers[2] = -15;
        numbers[3] = 7;
        numbers[4] = 55;
        numbers[5] = 1;
        numbers[6] = -22;

        int gap = numbers.length/2;

        for (gap = numbers.length/2; gap > 0; gap /= 2) {
            for (int i=gap; i < numbers.length; i++) {
                int newElement = numbers[i];
                int j=i;
                while (j >= gap && numbers[j-gap] > newElement) {
                    numbers[j] = numbers[j-gap];
                    j -= gap;
                }
                numbers[j] = newElement;
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }
}
