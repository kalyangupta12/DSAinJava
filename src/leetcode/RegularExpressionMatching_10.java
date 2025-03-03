package leetcode;

public class RegularExpressionMatching_10 {
    public boolean isMatch(String s, String p) {
        // Base case: if the pattern is empty, the string must also be empty to match
        if (p.isEmpty()) {
            return s.isEmpty();
        }

        // Check if the first characters match (or if the pattern has a '.')
        boolean firstMatch = !s.isEmpty() && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.');

        // If the pattern has a '*' (and is at least 2 characters long)
        if (p.length() >= 2 && p.charAt(1) == '*') {
            // Case 1: Treat 'a*' as zero occurrences (skip the '*' and its preceding character)
            // Case 2: Treat 'a*' as one or more occurrences (if the first characters match)
            return isMatch(s, p.substring(2)) || (firstMatch && isMatch(s.substring(1), p));
        } else {
            // If there's no '*', just move to the next character in both the string and the pattern
            return firstMatch && isMatch(s.substring(1), p.substring(1));
        }
    }
    public static void main(String[] args) {
        boolean match = new RegularExpressionMatching_10().isMatch("aa", "aa.*");
        System.out.println("match = " + match);
    }
}
