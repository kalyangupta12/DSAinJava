# Find Closest Number to Zero

## Problem Statement
Given an integer array `nums`, return the number closest to `0`. If there are multiple numbers with the same absolute difference from `0`, return the **positive** number.

## Approach
- Initialize `closest` with the first element of `nums`.
- Iterate through `nums` and compare absolute values.
- If the current number is closer to `0`, update `closest`.
- If two numbers have the same absolute difference, choose the **positive** one.
- Return `closest`.

## 🚀 Complexity Analysis
- **Time Complexity:** `O(n)`, since we traverse the array once.
- **Space Complexity:** `O(1)`, as we use a single variable.

## 🔍 Dry Run Example

### **Input:** `nums = [-4, -2, 1, 4, 8]`
| Step | `num` | `Math.abs(num)` | `Math.abs(closest)` | Update `closest`? | `closest` Value |
|------|------|---------------|----------------|-----------------|--------------|
| 1    | -4   | 4             | 4              | No              | -4           |
| 2    | -2   | 2             | 4              | ✅ Yes           | -2           |
| 3    | 1    | 1             | 2              | ✅ Yes           | 1            |
| 4    | 4    | 4             | 1              | No              | 1            |
| 5    | 8    | 8             | 1              | No              | 1            |

### **Output:** `1`

## ✅ Test Cases
```java
public static void main(String[] args) {
    Solution sol = new Solution();
    
    System.out.println(sol.findClosestNumber(new int[]{-4, -2, 1, 4, 8})); // Output: 1
    System.out.println(sol.findClosestNumber(new int[]{2, -2, -3, 3})); // Output: 2
    System.out.println(sol.findClosestNumber(new int[]{-10, -5, 5, 10})); // Output: 5
    System.out.println(sol.findClosestNumber(new int[]{0, -1, 1})); // Output: 0
}
```