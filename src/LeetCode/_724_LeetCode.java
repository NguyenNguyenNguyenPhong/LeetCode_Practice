package LeetCode;

public class _724_LeetCode {
    public static int pivotIndex(int[] nums) {
        int len = nums.length;
        if(len == 1) return 0;
        if(len== 0) return -1;
        int[] sumLeft = new int[len];
        int [] sumRight = new int[len];
        for(int i = 0; i < len; i++){
            int j = len-1-i;
            sumLeft[i] = (i==0) ? nums[i] :(sumLeft[i-1] + nums[i]);
            sumRight[j] =(j == len-1) ? nums[j] : (sumRight[j+1] + nums[j]);
            //System.out.print(sumRight[i] + " ");
        }

        for(int i = 0; i < len; i++){
            if(i == 0){
                if(sumRight[i] == 0) {return i;}
            }else if(i == len-1){
                if(sumLeft[len-2] == 0) {return i;}
            }else {
                if(sumLeft[i-1] == sumRight[i+1]) {return i;}
            }
        }
      return -1;
    }

    public static void main(String[] args) {
        int a[] = {2,1,-1};
        System.out.println(pivotIndex(a));
    }
}
