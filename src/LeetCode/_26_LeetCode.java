package LeetCode;

public class _26_LeetCode {
    public  static int removeDuplicates(int[] nums) {
        int currentIndex = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[currentIndex] != nums[i]){
                currentIndex++;
                nums[currentIndex] = nums[i];
            }
        }
        return currentIndex+1;
    }

    public static void main(String[] args) {
        int a[] ={0, 0, 0, 1, 1, 1, 3 ,3 ,4,5 ,5 ,6};
        System.out.println(removeDuplicates(a));
    }
}
