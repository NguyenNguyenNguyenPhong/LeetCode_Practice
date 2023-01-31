package LeetCode;

public class _905_LeetCode {
    public static int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        // i is index odd number
        // j is index even number
        int i = 0, j = n - 1;
        while (i < j) {
            if (nums[i] % 2 != 0) {
                if (nums[j] % 2 == 0) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                }else j--;
            } else {
                i++;
            }
        }
        return nums;
    }
        public static void main (String[]args){
            int a[] = {1, 2, 3, 4, 5, 6};
            sortArrayByParity(a);
            for (int i : a) {
                System.out.print(i + " ");
            }
        }
}
