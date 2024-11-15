public class minElementSortedArr {
    public static int minimumElement(int nums[]){
        int n = nums.length;
        int start = 0;
        int end = n -1;

        while (start<end){

            int mid = start + (end-start) /2;

            if (mid > 0 && nums[mid] < nums[mid - 1]) {
                return nums[mid];
            }


            if (nums[mid] > nums[end]) {
                // Minimum is in the right part
                start = mid + 1;
            } else {
                // Minimum is in the left part (or could be mid)
                end = mid;
            }
        }

        return nums[start];
    }

    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2};
        System.out.println(minimumElement(nums));
    }
}
