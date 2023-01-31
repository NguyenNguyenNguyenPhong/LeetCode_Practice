package LeetCode;

public class _283_LeetCode {
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int a[] = new int[n];

        int curIndex = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] != 0){
                a[curIndex] = nums[i];
                curIndex++;
            }
        }
        for(int i = curIndex; i < n; i++){
            a[i] = 0;
        }
        for(int i = 0; i < n; i++){
            nums[i] = a[i];
        }
    }

    public static void main(String[] args) {
        int a[]= {0,1,0,3,12};
        moveZeroes(a);
        for(int i : a){
            System.out.print(i + " ");
        }
    }
}
