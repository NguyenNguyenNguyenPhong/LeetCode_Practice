package LeetCode;

public class _1299_LeetCode {

    public static int[] replaceElements(int[] arr) {
        int n = arr.length;

        for(int i = n-2; i >= 0; i--){

               arr[i] = Math.max(arr[i], arr[i+1]);

        }

        for(int i = 1; i < n; i++){
            arr[i-1] = arr[i];
        }
        if(n > 0){
            arr[n-1] = -1;
        }
        return arr;
    }

    public static void main(String[] args) {
        int a[] = {1, 27, 2,3 , 345,3 ,34};
        replaceElements(a);
        for(int i : a){
            System.out.print(i + " ");
        }
    }
}
