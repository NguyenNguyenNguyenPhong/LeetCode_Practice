package LeetCode;

import java.util.Scanner;

public class _69_LeetCode {
    public static int mySqrt(int x) {
        int ans;
        ans = (int) Math.sqrt(x);
        return ans;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(mySqrt(x));
    }
}
