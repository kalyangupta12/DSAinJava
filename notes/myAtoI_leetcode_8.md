# myAtoi - String to Integer Conversion in Java

## 🚀 Overview
This project implements a function `myAtoi(String s)` that converts a given string into an integer, similar to the behavior of `atoi()` in C.

## 🛠️ How It Works
- **Trims leading spaces**
- **Handles optional '+' or '-' sign**
- **Extracts valid numeric digits**
- **Stops conversion on encountering a non-digit**
- **Handles integer overflow properly**

## 💡 Dry Run Example
**Input:** `"   -42abc"`  
**Steps:**
1. Ignore spaces → `"-42abc"`
2. Detect `'-'` sign → `sign = -1`
3. Extract digits → `42`
4. Stop at `'a'` → Return `-42`

**Output:** `-42`

## 📊 Detailed Execution Trace

Let's trace through the execution of the function with input `"   -42abc"`:

| Step | i | char | Condition | Action | num | sign | Explanation |
|------|---|------|-----------|--------|-----|------|-------------|
| Start | 0 | ' ' | s.charAt(i) == ' ' | i++ | 0 | 1 | Skip leading space |
| 2 | 1 | ' ' | s.charAt(i) == ' ' | i++ | 0 | 1 | Skip leading space |
| 3 | 2 | ' ' | s.charAt(i) == ' ' | i++ | 0 | 1 | Skip leading space |
| 4 | 3 | '-' | s.charAt(i) == '-' | sign = -1, i++ | 0 | -1 | Detect negative sign |
| 5 | 4 | '4' | Character.isDigit(s.charAt(i)) | num = 0*10 + 4, i++ | 4 | -1 | Process first digit |
| 6 | 5 | '2' | Character.isDigit(s.charAt(i)) | num = 4*10 + 2, i++ | 42 | -1 | Process second digit |
| 7 | 6 | 'a' | !Character.isDigit(s.charAt(i)) | Break loop | 42 | -1 | Stop at non-digit |
| Return | - | - | - | Return num * sign | - | - | Final result: -42 |

## 📌 Code
```java
public class Main {
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

            // Check overflow
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
```

## 🔄 Execution Flow Diagram

```
Input: "   -42abc"
↓
Check if input is null or empty? NO
↓
Initialize: i=0, n=9, sign=1, num=0
↓
Skip spaces: i becomes 3
↓
Check for sign at i=3: Found '-', set sign=-1, i becomes 4
↓
Process digits:
  ↓
  i=4, char='4': num = 0*10 + 4 = 4, i becomes 5
  ↓
  i=5, char='2': num = 4*10 + 2 = 42, i becomes 6
  ↓
  i=6, char='a': Not a digit, exit digit processing loop
↓
Return: num * sign = 42 * (-1) = -42
```

## 🔥 Features
- ✅ Handles leading spaces
- ✅ Supports positive & negative numbers
- ✅ Stops at non-numeric characters
- ✅ Prevents integer overflow
- ✅ Runs in O(n) time complexity

## 📌 Edge Cases

| Input | Output | Explanation |
|-------|--------|-------------|
| "42" | 42 | Normal case |
| " -42" | -42 | Leading spaces |
| "4193 with" | 4193 | Stops at non-numeric |
| "words 987" | 0 | No valid number |
| "-91283472332" | -2147483648 | Handles overflow |

## ⚙️ Overflow Example

For the input `"-91283472332"`, let's trace how overflow is handled:

| Step | num | digit | Check | Result | Explanation |
|------|-----|-------|-------|--------|-------------|
| ... | 214748364 | 8 | 214748364 > (2147483647-8)/10 | false | No overflow yet |
| ... | 2147483644 | 7 | 2147483644 > (2147483647-7)/10 | true | Overflow detected |
| Return | - | - | - | INT_MIN (-2147483648) | Return MIN_VALUE since sign is negative |