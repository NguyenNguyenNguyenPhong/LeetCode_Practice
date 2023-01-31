package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _15_LeetCode {
    public static List<Integer> threeSum(int[] nums) {
        List<Integer> list = new ArrayList<>();

        Arrays.sort(nums);
        int len = nums.length;
        for(int i = 0; i < len-1; i++){
            for (int j = i+1; j < len; j++){
                int temp = nums[i] +nums[j];
                int result = binarysearch(nums, -temp, 0, len);
                if(result != -1){
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(result);
                }
            }
        }
        return list;
    }

    public static int binarysearch(int[] nums, int target, int l, int r){
        int left = 0;
        int right = nums.length-1;
        int middle = (left+right)/2;
        while (left <= right){
            if(nums[middle] == target) return nums[middle];
            else if(nums[middle] > target) binarysearch(nums, target, left, middle-1);
            else binarysearch(nums, target, middle+1, right);
        }
        return -1;
    }
}
