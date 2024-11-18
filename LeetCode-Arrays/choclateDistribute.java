import java.util.Arrays;
public class choclateDistribute {
        public static int distribution(int arr[], int m){
            //here in first step we sort the array
            Arrays.sort(arr);
            //now make the pair
            int n = arr.length;
            int minidiff = Integer.MAX_VALUE;
            //using loops

            for (int i = 0; i <= arr.length - m; i++) {

                //another loop for pairs
                int diff = arr[i + m - 1] - arr[i];

                minidiff = Math.min(minidiff, diff);

            }

            return minidiff;
        }
    public static void main(String[] args) {
        int arr[] = {7, 3, 2, 4, 9, 12, 56};
        int m = 3;
        System.out.println(distribution(arr, m));
    }
}
