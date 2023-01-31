package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class _448_Leetode {
    public static List<Integer> findDisappearedNumbers(int[] nums) {

        ArrayList<Integer> results = new ArrayList<>();
        boolean isAppear[] = new boolean[nums.length +1];
        for(int i = 0; i < nums.length; i++){
            isAppear[nums[i]] = true;
        }
        for(int i = 1; i <= nums.length; i++){
            if(isAppear[i] == false){
                results.add(i);
            }
        }
        return  results;
    }

    public static void main(String[] args) {

    }
}
