package LeetCode;

public class _704_LeetCode {

    public static int binary_Search(int[] a, int left, int right, int target){
        if(left > right) return -1;
        int mid = (left + right) /2;
        if(a[mid] == target) return mid;
        if(a[mid] > target) return binary_Search(a, left, mid, target);
        else return binary_Search(a, mid +1, right, target);
    }
    public static int search(int[] nums, int target) {
        return binary_Search(nums, 0, nums.length-1, target);
    }
    public static void main(String[] args) {
       int a[] = {1, 2, 3, 4, 5};
        System.out.println(search(a, 3));

    }

}
