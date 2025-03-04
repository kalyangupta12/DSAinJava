package leetcode;

public class CheckIfAnArraySortedOrNot_1527 {
    public static boolean check(int[] nums) {
        int count = 0, n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i+1)% n] && ++count > 1)
                return false;
        }
        return count <= 1;
    }
    public static void main(String[] args) {
        System.out.println(check(new int[]{1,2,3,4,5,6,7,8,9}));
        System.out.println(check(new int[]{3,4,5,1,2}));
        System.out.println(check(new int[]{2,1,3,4}));
    }
}
