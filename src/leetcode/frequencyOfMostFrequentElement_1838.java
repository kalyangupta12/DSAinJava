package leetcode;
import java.util.*;
public class frequencyOfMostFrequentElement_1838 {
    public static int maxFrequency(int[] A, int k) {
        int res = 1, i = 0, j;
        long sum = 0;
        Arrays.sort(A);
        for (j = 0; j < A.length; ++j) {
            sum += A[j];
            while (sum + k < (long)A[j] * (j - i + 1)) {
                sum -= A[i];
                i += 1;
            }
            res = Math.max(res, j - i + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {3, 9, 6};
        System.out.println(maxFrequency(arr, 2)); // O
    }
}
