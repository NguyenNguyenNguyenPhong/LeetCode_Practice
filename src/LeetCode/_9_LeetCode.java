package LeetCode;

import java.util.Scanner;

public class _9_LeetCode {
    public static boolean isPalindrome(int x) {
//        String temp = Integer.toString(x);
//        int[] numbers = new int[temp.length()];
//
//        for(int i = 0; i < temp.length(); i++){
//            numbers[i] = temp.charAt(i) - '0';
//        }
//
//        int n = numbers.length;
//        for(int i = 0; i < n/2; i++){
//            if(numbers[i] != numbers[n-i-1]){
//                return false;
//            }
//        }
//        return true;
        int n = x;
        if(n > 0 && n /10 == 0) return true;
        if (n == 0) return true;
        int temp = 0;
        while(x > 0){
            int nums = x % 10;
            temp = (temp *10) + nums;
            x /= 10;
        }
        if(temp == n) return true;
        else return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(isPalindrome(x));
    }
}
