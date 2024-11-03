public class two_sum {
    public static int[] two_sum (int array[] , int target){
        //for first number
        for (int i = 0; i<=array.length-1; i++){
            //for second number
            for (int j = i+1; j<=array.length-1; j++){
                //sum of i and j
                if (array[i] + array[j] == target){
                    System.out.println("[" + array[i] +","+ array[j] +"] ");
                }
            }
        }
        return new int[]{};

    }
    public static void main(String[] args) {
        int array[] = {2,4,6,8,10};
        int target = 6;
        two_sum(array , target);

    }
}
