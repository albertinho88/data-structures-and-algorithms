package ec.clicka.algorithms.factorial;

public class Factorial {
    public static void main(String[] args) {
        int count = 10;
        int factorial = 1;

        for (int num = 0; num <= count; num++) {
            System.out.println(num + "! = " + recursiveFactorial(num));
        }
    }

    public static int recursiveFactorial(int num) {
        if (num == 0) { // breaking condition or base case, it's a must for recursion
            return 1;
        }
        return num * recursiveFactorial(num - 1);
    }

    public static int iterativeFactorial(int num) {
        if (num == 0) {
            return 1;
        }
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
