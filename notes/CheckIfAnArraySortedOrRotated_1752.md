# Check if an Array is a Rotated Sorted Array

## Problem Statement
Given an array `nums`, determine whether it is a rotated sorted array. A rotated sorted array is defined as an array that was initially sorted in non-decreasing order and then some elements were moved from the beginning to the end.

## Approach
The function iterates through the array and counts how many times an element is greater than the next element. If this count exceeds 1, the array is not a rotated sorted array.

## Implementation
```java
class Solution {
    public boolean check(int[] nums) {
        int count = 0, n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i+1) % n] && ++count > 1)
                return false;
        }
        return count <= 1;
    }
}
```

## Dry Run

### Example 1
**Input:**
```java
nums = [3, 4, 5, 1, 2]
```
**Dry Run Table:**

| Index (`i`) | `nums[i]` | `nums[(i+1) % n]` | `nums[i] > nums[(i+1) % n]` | `count` |
|------------|-----------|--------------------|-----------------------------|---------|
| 0          | 3         | 4                  | No                          | 0       |
| 1          | 4         | 5                  | No                          | 0       |
| 2          | 5         | 1                  | Yes                         | 1       |
| 3          | 1         | 2                  | No                          | 1       |
| 4          | 2         | 3                  | No                          | 1       |

**Output:** `true`

### Example 2
**Input:**
```java
nums = [2, 1, 3, 4]
```
**Dry Run Table:**

| Index (`i`) | `nums[i]` | `nums[(i+1) % n]` | `nums[i] > nums[(i+1) % n]` | `count` |
|------------|-----------|--------------------|-----------------------------|---------|
| 0          | 2         | 1                  | Yes                         | 1       |
| 1          | 1         | 3                  | No                          | 1       |
| 2          | 3         | 4                  | No                          | 1       |
| 3          | 4         | 2                  | Yes                         | 2       |

**Output:** `false`

## Complexity Analysis
- **Time Complexity:** `O(n)` because we traverse the array once.
- **Space Complexity:** `O(1)` as we use only a few extra variables.

## Edge Cases Considered
- Already sorted array.
- Completely unsorted array.
- Single-element or two-element arrays.
- Rotated at different points.

## Summary
This function efficiently checks if an array is a rotated sorted array by ensuring that there is at most one decreasing pair. If more than one such instance is found, the function returns `false`.

