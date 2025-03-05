package leetcode;

public class findclosesttozero_2239 {
    public static int findClosestNumber(int[] nums) {
        int closest = nums[0]; // Start with the first number

        for (int num : nums) {
            if (Math.abs(num) < Math.abs(closest)) {
                closest = num; // Update closest if this number is nearer to zero
            } else if (Math.abs(num) == Math.abs(closest) && num > closest) {
                closest = num; // If tie, pick the positive number
            }
        }

        return closest;
    }

    public static void main(String[] args) {
        System.out.println(findClosestNumber(new int[]{-4, -2, 1, 4, 8})); // Output: 1
        System.out.println(findClosestNumber(new int[]{2, -2, -3, 3})); // Output: 2
        System.out.println(findClosestNumber(new int[]{-10, -5, 5, 10})); // Output: 5
        System.out.println(findClosestNumber(new int[]{0, -1, 1})); // Output: 0
    }
}
