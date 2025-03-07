## **Understanding the Code:**
This Java method **`removeDuplicates`** is designed to remove duplicates from a **sorted** array `arr` **in-place** and return the length of the modified array containing unique elements.

### **Approach:**
1. **Two Pointers Technique**:
    - `i` (Slow Pointer): Marks the position of the last unique element.
    - `j` (Fast Pointer): Iterates through the array to check for unique elements.

2. **Iteration Process:**
    - Start from the second element (`j = 1`) and traverse till the end of the array.
    - If `arr[j] != arr[i]`, it means we found a new unique element.
    - Increment `i` and copy `arr[j]` to `arr[i]`.

3. **Final Output:**
    - `i + 1` is returned, as the **index `i` is zero-based**, but the length of the unique array is `i + 1`.

---

## **Dry Run Example**
### **Input:**
```java
arr = [1, 1, 2, 2, 3]
```
### **Execution Steps:**
| Step | `i` | `j` | `arr[i]` | `arr[j]` | Action |
|------|----|----|--------|--------|--------|
| 1    | 0  | 1  | 1      | 1      | No change (duplicate found) |
| 2    | 0  | 2  | 1      | 2      | `i++`, `arr[1] = 2` |
| 3    | 1  | 3  | 2      | 2      | No change (duplicate found) |
| 4    | 1  | 4  | 2      | 3      | `i++`, `arr[2] = 3` |

### **Final Output:**
- Modified `arr = [1, 2, 3, _, _]` (`_` denotes unused space).
- **Return value: `i + 1 = 3` (length of unique elements).**

---

## **Time & Space Complexity:**
- **Time Complexity:** `O(N)`, as we traverse the array once.
- **Space Complexity:** `O(1)`, since we modify the array in place.

---

## **README (Documentation)**
### **Function:**
```java
public int removeDuplicates(int[] arr)
```
- **Purpose:** Removes duplicates from a **sorted** array and returns the count of unique elements.
- **Input:**
    - `arr`: A **sorted** integer array.
- **Output:**
    - Returns the length of the modified array containing unique elements.
- **Constraints:**
    - `1 <= arr.length <= 10^5`
    - `-10^4 <= arr[i] <= 10^4`
    - Array must be **sorted** in non-decreasing order.

### **Example Usage:**
```java
class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1, 1, 2, 3, 3};
        int len = sol.removeDuplicates(arr);
        System.out.println("Unique length: " + len);
        
        // Printing unique elements
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
```
### **Output:**
```
Unique length: 3
1 2 3
```

Would you like me to refine it further or add edge cases? 🚀