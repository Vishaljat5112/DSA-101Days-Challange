public class maxProduct {
    public static int product(int nums[]){
        int n = nums.length;
        int leftProduct = 1;
        int rightProduct =1;
        int ans = nums[0];
        //calculating suffix and prefix
        for (int i =0; i<n; i++){
            //update 1 if value is 0
            leftProduct = leftProduct ==0 ? 1: leftProduct;
            rightProduct = rightProduct ==0 ? 1: rightProduct;
            //product
            leftProduct *= nums[i];
            rightProduct *= nums[n - 1 - i];

            ans = Math.max(ans ,Math.max(rightProduct, leftProduct));
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = {2,3,-2,4};
        System.out.println(product(nums));
    }
}
