package LeetCode;

public class _509_LeetCode {
    public static int fib(int n) {
        int [] a = new int[n+5];
        a[0] = 0; a[1] = 1;
        for(int i = 2; i <= n; i++){
            a[i] = a[i-1] + a[i-2];
        }
        return a[n];
    }

    public static void main(String[] args) {
        System.out.println(fib(5));
    }
}
