package LeetCode;

public class Permutation_Sequence {
     static int[] a = new int[100];
     static boolean[] bMark  = new boolean[100];
     static int count = 0;
//    public String getPermutation(int n, int m) {
//
//    }
    public static void Try(int k, int n,int m){
        for(int i = 1; i <= n; i++){
            if(!bMark[i]){
                a[k] = i;
                bMark[i] = true;
                if(k == n ){
                    count ++;
                    if(count == m){
                       // System.out.println("hello");
                        print(a,n);
                    }
                    //print(a,n);
                }
                else Try(k+1, n,m);
                bMark[i] = false;
            }
        }
    }
    public static void print(int[] a, int n){
        for(int i = 1; i <= n; i++){
            System.out.print(a[i]);
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int n = 3;
        Try(1,3,4);
    }
}
