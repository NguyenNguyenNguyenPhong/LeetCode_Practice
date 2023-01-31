package LeetCode;

import java.util.Arrays;

public class _1051_LeetCode {

    public static int heightChecker(int[] heights) {
        int n = heights.length;
        int[] coppyArray = new int[n];

        for(int i = 0; i < n; i++){
            coppyArray[i] = heights[i];
        }

        Arrays.sort(coppyArray);
        int countMin = 0;
        for(int i = 0; i < n; i++){
            if(coppyArray[i] != heights[i]) countMin ++;
        }

        return countMin;
    }

    public static void main(String[] args) {
        int a[] = {1,1,4,2,1,3};
        System.out.println(heightChecker(a));

    }

}
