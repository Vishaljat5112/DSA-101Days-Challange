public class palindromeNumber {
    public boolean isPalindrome(int x) {
        // If the number is negative or ends with 0 (but isn't 0 itself), it's not a palindrome
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;
        int original = x;

        // Reverse the number until we get to the halfway point
        while (x > reversed) {
            // Take the last digit of x and add it to reversed
            reversed = reversed * 10 + x % 10;
            // Remove the last digit from x
            x /= 10;
        }

        // Check if the original half matches the reversed half
        // For even-length numbers, x == reversed
        // For odd-length numbers, x == reversed / 10 (to ignore the middle digit)
        return x == reversed || x == reversed / 10;
    }
}

