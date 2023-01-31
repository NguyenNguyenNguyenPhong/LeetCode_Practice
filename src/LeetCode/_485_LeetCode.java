package LeetCode;

public class _485_LeetCode {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 1){
                count = 0;
            }else {
                count++;
                max = Math.max(max, count);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int a[] = {1, 0, 1, 1, 1, 1, 1, 1, 4, 6};
        System.out.println(findMaxConsecutiveOnes(a));

    }
}
