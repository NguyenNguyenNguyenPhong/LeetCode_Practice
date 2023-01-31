package LeetCode;

import java.util.ArrayList;
import java.util.Stack;

public class Reverse_Integer {

    public static int reverse(int x) {
// INT_MAX: 2147483647
        // INT_MIN: -2147483648
        int result = 0;

        while (x != 0) {
            int mod = x % 10;

            if (result > 214748364 || (result == 214748364 && mod > 7)) {
                return 0;
            }
            if (result < -214748364 || (result == -214748364 && mod == -9)) {
                return 0;
            }

            result = 10 * result + mod;
            x /= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1234));
    }
}
