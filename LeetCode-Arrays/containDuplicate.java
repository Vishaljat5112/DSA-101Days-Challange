import java.util.HashSet;
public class containDuplicate {
    public static boolean duplicate(int nums[]){
        HashSet<Integer> seen = new HashSet<>();

        for (int num: nums){
            if (seen.contains(num)){
                return true;
            }
            seen.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,1};
        System.out.println(duplicate(nums));

    }
}
