package LeetCode;

public class _941_LeetCode {
    public static boolean validMountainArray(int[] arr) {
        int n = arr.length;
        int indexMax = indexOfMaxElement(arr);
        if(indexMax == 0 || indexMax == n-1) return false;
        for(int i = 0; i < indexMax; i++){
            if(arr[i] >= arr[i+1]) return false;
            break;
        }
        for (int j =n-1; j > indexMax; j--){
            if(arr[j] >= arr[j-1]) return false;
            break;
        }
        return true;
    }

    public static int indexOfMaxElement(int[] arr){
        int indexMax = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > arr[indexMax]) indexMax = i;
        }
        return indexMax;
    }

    public static void main(String[] args) {
        int a[] = {3,5,5};
        System.out.println(validMountainArray(a));


    }
}
