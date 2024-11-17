public class plusOne {
    public static int plus(int num[]){
        int length = num.length;


       num[length-1] += 1;
        System.out.print("[");
        for (int i = 0; i<num.length; i++){
            System.out.print( num[i]);
            if (i<num.length-1){
                System.out.print(",");
            }

        }
        System.out.print("]");
        return 0;
    }

    public static void main(String[] args) {
        int num[] = {1,2,3};
        plus(num);
    }
}
