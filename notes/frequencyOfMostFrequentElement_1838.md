# Max Frequency of an Element After Increment Operations

## **Problem Statement**
Given an integer array `A` and an integer `k`, we can increment any element of the array at most `k` times. We need to find the **maximum frequency** of any element after performing the operations optimally.

## **Approach**
- Sort the array in ascending order.
- Use a **Sliding Window** (Two Pointer) technique:
  - Expand the window by adding elements and tracking their sum.
  - If increasing all numbers in the window to `A[j]` exceeds `k`, shrink the window from the left.
  - Keep track of the maximum valid window size.

## **Algorithm**
1. **Sort the array** to ensure we always increase smaller values to match a higher value.
2. **Iterate through the array** using two pointers (`i` and `j`):
   - Add `A[j]` to `sum`.
   - Check if `sum + k` is enough to make all elements in `[i, j]` equal to `A[j]`.
   - If not, shrink the window from the left (`i++`).
   - Update `res` with the maximum window size.

## **Complexity Analysis**
- Sorting takes **O(N log N)**.
- The sliding window runs in **O(N)**.
- Overall time complexity: **O(N log N)**.

## **Code**
```java
import java.util.*;

class Solution {
    public int maxFrequency(int[] A, int k) {
        int res = 1, i = 0, j;
        long sum = 0;
        Arrays.sort(A);
        for (j = 0; j < A.length; ++j) {
            sum += A[j];
            while (sum + k < (long) A[j] * (j - i + 1)) {
                sum -= A[i];
                i += 1;
            }
            res = Math.max(res, j - i + 1);
        }
        return res;
    }
}
```

## **Dry Run**
Let's dry-run the code with an example:

### **Example Input**
```java
A = [3, 9, 6, 2, 8]
k = 4
```

### **Step-by-Step Execution**
| Step | Sorted `A` | `i` | `j` | `sum` | `(A[j] * (j - i + 1))` | `sum + k` | `res` | Action |
|------|-----------|----|----|------|-----------------|----------|------|---------|
| 1    | `[2, 3, 6, 8, 9]` | 0  | 0  | 2    | `2 * 1 = 2`  | `2 + 4 = 6` | 1 | Expand |
| 2    | `[2, 3, 6, 8, 9]` | 0  | 1  | 5    | `3 * 2 = 6`  | `5 + 4 = 9` | 2 | Expand |
| 3    | `[2, 3, 6, 8, 9]` | 0  | 2  | 11   | `6 * 3 = 18` | `11 + 4 = 15` | 2 | Shrink (`i++`) |
| 4    | `[2, 3, 6, 8, 9]` | 1  | 2  | 9    | `6 * 2 = 12` | `9 + 4 = 13` | 2 | Expand |
| 5    | `[2, 3, 6, 8, 9]` | 1  | 3  | 17   | `8 * 3 = 24` | `17 + 4 = 21` | 2 | Shrink (`i++`) |
| 6    | `[2, 3, 6, 8, 9]` | 2  | 3  | 14   | `8 * 2 = 16` | `14 + 4 = 18` | 2 | Expand |
| 7    | `[2, 3, 6, 8, 9]` | 2  | 4  | 23   | `9 * 3 = 27` | `23 + 4 = 27` | 3 | Expand |

### **Final Output**
`res = 3` → The maximum frequency we can achieve is **3**.

## **Edge Cases Considered**
1. **All elements are the same** → Already at max frequency.
2. **`k` is 0** → No modifications allowed, return the highest natural frequency.
3. **Sorted descending array** → Sorting step ensures correctness.
4. **All unique elements** → Need to use `k` optimally to increase any one frequency.

---

Happy Coding! 🚀