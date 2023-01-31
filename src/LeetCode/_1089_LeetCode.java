package LeetCode;

public class _1089_LeetCode {
    public static void duplicateZeros(int[] arr) {
        int[] b = new int[arr.length];
        for(int i = 0, j = 0; i < arr.length && j < b.length; i++){
            if(arr[i] == 0){
                b[j] = arr[i];

                int k = j+1;
                if(k < b.length){
                    b[k] = arr[i];
                }

                j += 2;
            }else{
                b[j] = arr[i];
                j+= 1;
            }
        }
        for(int i = 0; i < arr.length; i++){
            arr[i] = b[i];
        }
    }

    public static void main(String[] args) {
        int a[] = {1, 0, 2, 3, 0, 0, 4, 0};
        duplicateZeros(a);
        for(int i : a){
            System.out.print(i + " ");
        }
    }
}
