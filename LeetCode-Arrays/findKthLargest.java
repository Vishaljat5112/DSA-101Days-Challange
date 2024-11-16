import java.util.*;
public class findKthLargest {
        public static int largest(int nums[], int k){
        //remove duplicates by using hastset
            HashSet<Integer> set = new HashSet<>();
            //put array value in hashset SET
            for (int num : nums){
                set.add(num);
            }

         //creat a array to store hashset
         int result[] = new int[set.size()];
            int index =0;
            for (int num:set){
                result[index] = num;
                index++;
            }

            //sort the array and return the kth element
            Arrays.sort(result);
            return result[result.length -k];
        }
    public static void main(String[] args) {
            int nums[] = {1,2,3,4,5};
            int k =2;
        System.out.println(largest(nums, k ));
    }
}
