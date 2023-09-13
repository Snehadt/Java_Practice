package src;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public static String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }

        Map<Character, Integer> targetFreq = new HashMap<>();
        for (char c : t.toCharArray()) {
            targetFreq.put(c, targetFreq.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        int right = 0;
        int required = targetFreq.size();
        int formed = 0;

        // Keep track of the characters and their frequencies in the current window
        Map<Character, Integer> windowFreq = new HashMap<>();

        // Variables to store the minimum window substring
        int minLength = Integer.MAX_VALUE;
        int start = 0;

        while (right < s.length()) {
            char currentChar = s.charAt(right);
            windowFreq.put(currentChar, windowFreq.getOrDefault(currentChar, 0) + 1);

            // Increment the formed count if the character is required and its frequency matches
            if (targetFreq.containsKey(currentChar) && targetFreq.get(currentChar).equals(windowFreq.get(currentChar))) {
                formed++;
            }

            // Try to contract the window from the left
            while (left <= right && formed == required) {
                char leftChar = s.charAt(left);

                // Update the minimum window substring if a shorter length is found
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    start = left;
                }

                // Decrement the frequency of the character at the left pointer
                windowFreq.put(leftChar, windowFreq.get(leftChar) - 1);

                // If the character is required and its frequency becomes less than the target frequency,
                // decrease the formed count
                if (targetFreq.containsKey(leftChar) && windowFreq.get(leftChar) < targetFreq.get(leftChar)) {
                    formed--;
                }

                left++;
            }

            right++;
        }

        if (minLength == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + minLength);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s, t));  // Output: "BANC"
    }
}
