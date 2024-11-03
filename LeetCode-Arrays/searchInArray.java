public class searchInArray {
    public static int searchInsert(int[] num, int target) {
        int index =0;
        int length = num.length;
        for (int i = 0; i<num.length; i++){
            index = i;

            if (num[i]==target){
                System.out.println(i);
                return i;
            } else if (target < num[i]) {
                System.out.println(i);
                return i;


            }else if (target > num[length-1]){
                   System.out.println(num.length);
                return length;
            }

        }
        return 0;
    }

    public static void main(String[] args) {
        int num[] = {1,3,5,6};
        int target = 7;
        searchInsert(num, target);
    }
}