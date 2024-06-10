package ec.clicka.util;

public class ArrayUtil {

    public static String printArray(int[] arr) {
        return printArray(arr, 0, arr.length);
    }

    public static String printArray(int[] arr, int start, int end) {
        String printLn = "[ ";
        for (int i = start; i < end; i++) {
            printLn += arr[i];
            if (i < end -1) {
                printLn += " | ";
            }
        }
        printLn += " ]";
        return printLn;
    }

    public static String printArray(Object[] arr) {
        return printArray(arr, 0, arr.length);
    }

    public static String printArray(Object[] arr, int start, int end) {
        String printLn = "{";
        for (int i = start; i < end; i++) {
            printLn += arr[i] + ",";
        }
        printLn += "}";
        return printLn;
    }

}
