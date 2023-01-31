package LeetCode;

public class _66_LeetCode {
    public static int[] plusOne(int[] digits) {

        int n = digits.length;
        int sodu = 1;
        int i = n-1;

        while (i >= 0 && sodu > 0){
            int temp = digits[i] + sodu;
            digits[i] = temp %10;
            sodu = temp/10;
            i--;
        }
        if(sodu == 0) return digits;
        int[] b = new int[n+1];
        b[0] = sodu;
        for (i = 0; i < n; i++){
            b[i+1] = digits[i];
        }
        return b;
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        int b[] = plusOne(a);
        for(int i : b){
            System.out.print(i + " ");
        }
    }
}
