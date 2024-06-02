package ec.clicka;

public class Main {
    public static void main(String[] args) {

        int[] arrayNumbers = new int[7];
        arrayNumbers[0] = 22;
        arrayNumbers[1] = 3;
        arrayNumbers[2] = 5;
        arrayNumbers[3] = 7;
        arrayNumbers[4] = -9;
        arrayNumbers[5] = 11;
        arrayNumbers[6] = -22;

        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] == 7) {
                System.out.println("The index is " + i);
                break;
            }
        }


    }
}