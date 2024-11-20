public class reverseArr {
    public static void reverseArray(int arr[]) {
        int first = 0;
        int last = arr.length - 1;
        while (first < last) {
            //swap first and last
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        reverseArray(arr);
    }
}
