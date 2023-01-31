package LeetCode;

import java.util.List;

public class _77_Leetcode {
//    public List<List<Integer>> combine(int n, int k) {
//
//    }
    static int n = 4, m = 2;
    static int[] a = new int[100];

    public static void print(){
        for (int i = 1; i <= m; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static void Try(int k){
        for (int i = a[k-1] + 1; i <= n - m + k; i++){
            a[k] = i;
            if(k == m){
                print();
            }
            else Try(k+1);
        }
    }
    public static void main(String[] args) {
        //n = 4; m = 2;
        a[0] = 0;
        Try(1);
    }
}
