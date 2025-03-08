### Dry Run of `findMaxConsecutiveOnes` Method

#### **Input:**
`nums = [1, 1, 0, 1, 1, 1]`

#### **Step-by-step Execution:**
| Index (`i`) | `nums[i]` | `cnt` (Consecutive 1s Count) | `maxcnt` (Max Consecutive 1s) |
|------------|----------|----------------------|----------------------|
| 0          | 1        | 1                    | 1                    |
| 1          | 1        | 2                    | 2                    |
| 2          | 0        | 0 (reset)            | 2                    |
| 3          | 1        | 1                    | 2                    |
| 4          | 1        | 2                    | 2                    |
| 5          | 1        | 3                    | 3                    |

#### **Final Output:**
`3` (The maximum consecutive 1s in the array)

---

### **README for `findMaxConsecutiveOnes`**
#### **Problem Statement**
Given a binary array `nums`, return the maximum number of consecutive `1`s in the array.

#### **Approach**
1. Initialize `cnt` to track the current streak of consecutive `1`s.
2. Initialize `maxcnt` to store the maximum count of consecutive `1`s.
3. Iterate through `nums`:
    - If `nums[i] == 1`, increment `cnt` and update `maxcnt` accordingly.
    - If `nums[i] == 0`, reset `cnt` to 0.
4. Return `maxcnt` as the final result.

#### **Complexity Analysis**
- **Time Complexity:** \(O(n)\) → Since we traverse the array once.
- **Space Complexity:** \(O(1)\) → Uses only constant extra space.

#### **Example Usage**
```java
class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println(sol.findMaxConsecutiveOnes(nums)); // Output: 3
    }
}
```

This method efficiently finds the longest streak of consecutive `1`s in a binary array. 🚀