import java.util.*;
public class minMaxinArr {
    public static void getMinMax(int[] arr) {
        // Initialize min and max
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;

        // Traverse the array to find min and max
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        System.out.println(min + " " + max);

        // Return the result as a Pair

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        getMinMax(arr);
    }
}
