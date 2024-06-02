package ec.clicka.algorithms.sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] numbers = new int[7];
        numbers[0] = 20;
        numbers[1] = 35;
        numbers[2] = -15;
        numbers[3] = 7;
        numbers[4] = 55;
        numbers[5] = 1;
        numbers[6] = -22;

        for (int lastUnsortedIndex = numbers.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (numbers[i] > numbers[largest]) {
                    largest = i;
                }
            }
            swap(numbers, lastUnsortedIndex, largest);
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

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
