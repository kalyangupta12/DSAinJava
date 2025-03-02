package leetcode;

public class StringtoIntegerAtoI_8 {
    public static int myAtoi(String s) {
        if (s == null || s.isEmpty()) return 0;

        int i = 0, n = s.length(), sign = 1, num = 0;

        // Step 1: Ignore leading spaces
        while (i < n && s.charAt(i) == ' ') i++;

        // Step 2: Handle sign if present
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // Step 3: Convert number and handle overflow
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // Check overflow (Integer.MAX_VALUE = 2147483647, Integer.MIN_VALUE = -2147483648)
            if (num > (Integer.MAX_VALUE - digit) / 10)
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;

            num = num * 10 + digit;
            i++;
        }

        return num * sign;

    }

    public static void main(String[] args) {
        System.out.println(myAtoi(" +42"));       // Output: 42
        System.out.println(myAtoi("   -42abc"));  // Output: -42
        System.out.println(myAtoi("4193 with"));  // Output: 4193
        System.out.println(myAtoi("words 987"));  // Output: 0
        System.out.println(myAtoi("-91283472332"));// Output: -2147483648
    }
}
