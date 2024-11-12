public class productOfArr {
    public static int[] productExceptSelf(int nums[]){
       int prefix[] = new int[nums.length];
       int suffix[] = new int[nums.length];
       int n = nums.length;

       prefix[0] =1;
       for (int i =1; i< nums.length; i++){
           prefix[i] = prefix[i-1] * nums[i-1];
       }

       suffix[suffix.length -1] = 1;
       for (int i = suffix.length-2; i>=0; i--){
          suffix[i] = suffix[i+1] * nums[i+1];
       }

       int result[] = new int[nums.length];
       for (int i =0; i< result.length; i++){
           result[i] = prefix[i] *  suffix[i] ;
       }

       for (int i =0 ; i< nums.length; i++){
           System.out.print(result[i] + " ");
       }

       return result;
    }


    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
      productExceptSelf(nums);
    }
}
