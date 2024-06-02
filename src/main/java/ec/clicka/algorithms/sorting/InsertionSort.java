package ec.clicka.algorithms.sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] numbers = new int[7];
        numbers[0] = 20;
        numbers[1] = 35;
        numbers[2] = -15;
        numbers[3] = 7;
        numbers[4] = 55;
        numbers[5] = 1;
        numbers[6] = -22;

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < numbers.length; firstUnsortedIndex++) {
            int newElement = numbers[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && numbers[i - 1] > newElement; i--) {
                numbers[i] = numbers[i - 1];
            }
            numbers[i] = newElement;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
