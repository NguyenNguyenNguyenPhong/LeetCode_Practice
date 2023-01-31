package LeetCode;

import com.sun.source.tree.BreakTree;

import java.util.Arrays;

public class _977_LeetCode {
    public static int[] sortedSquares(int[] nums) {
        for(int i = 0;i < nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) {
        int a[] = {1, 5, 32, -3, 24, 4};
        sortedSquares(a);
        for(int i : a){
            System.out.println(i);
        }
    }
}
