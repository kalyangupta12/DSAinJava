package leetcode;

import java.util.Arrays;

public class ZigzagConversion_6 {
    public static String convert(String s, int numRows) {
        if (s.isEmpty() || s.length() == 0) {
            return "";
        }
        if (s.length() == 1 || numRows == 1) {
            return s;
        }
        String[] arr = new String[numRows];
        Arrays.fill(arr, "");
        int row = 0;
        boolean down = true;
        for (int i = 0; i < s.length(); i++) {
            arr[row] += String.valueOf(s.charAt(i));

            if (row == numRows - 1) {
                down = false;
            } else if (row == 0) {
                down = true;
            }

            if (down) row++;
            else row--;

        }
        return String.join("", arr);
    }
    public static void main(String[] args) {
        String str = convert("PAYPALISHIRING", 2);
        System.out.println(str);
    }
}
