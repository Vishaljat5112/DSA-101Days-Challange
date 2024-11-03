public class Solution {
    public int maxSubArray(int[] numbers) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        boolean allNegative = true;
        int closestNegative = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            cs += numbers[i];

            // Check if there is any non-negative number
            if (numbers[i] >= 0) {
                allNegative = false;
            }

            // Update closest negative if the current number is negative and closer to zero
            if (numbers[i] < 0 && numbers[i] > closestNegative) {
                closestNegative = numbers[i];
            }

            // Reset current sum to 0 if it's negative
            if (cs < 0) {
                cs = 0;
            }

            ms = Math.max(cs, ms);
        }

        // If all numbers are negative, return the closest-to-zero negative number
        if (allNegative) {
            ms = closestNegative;
        }

        System.out.println(ms);
        return ms;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = {-2, -1};
        System.out.println("Max Subarray Sum is: " + solution.maxSubArray(numbers));
    }
}

