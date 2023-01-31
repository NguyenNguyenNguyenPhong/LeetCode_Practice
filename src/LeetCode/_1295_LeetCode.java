package LeetCode;

public class _1295_LeetCode {

    public  static int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            int temp = (int)(Math.log10(nums[i])) +1;
            if(temp % 2 == 0) {count++;}
        }
        return count;
    }

    public static void main(String[] args) {
        int a[] = {1234, 354, 247742, 8475896, 454};
        System.out.println(findNumbers(a));
    }
}
