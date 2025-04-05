import java.util.*;
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        // Create a map to store the last position of each character
        HashMap<Character, Integer> charIndex = new HashMap<>();
        int maxLength = 0;
        int start = 0;  // Start of our sliding window
        
        // Move end pointer through the string
        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
            
            // If we've seen this character before and it's in our current window
            if (charIndex.containsKey(currentChar) && charIndex.get(currentChar) >= start) {
                // Move start to position after the last occurrence
                start = charIndex.get(currentChar) + 1;
            }
            
            // Update the last position of current character
            charIndex.put(currentChar, end);
            
            // Update maxLength if current window is longer
            maxLength = Math.max(maxLength, end - start + 1);
        }
        
        return maxLength;
    }

    public static void main(String[] args) {
        LengthOfLongestSubstring solution = new LengthOfLongestSubstring();
        
        // Test cases
        String[] tests = {
            "abcabcbb",  // Expected: 3 ("abc")
            "bbbbb",     // Expected: 1 ("b")
            "pwwkew",    // Expected: 3 ("wke")
            "",          // Expected: 0
            "a",         // Expected: 1
            "au",        // Expected: 2
            "aab",       // Expected: 2 ("ab")
            "dvdf"       // Expected: 3 ("vdf")
        };
        
        for (String test : tests) {
            System.out.println("Input: " + test);
            System.out.println("Output: " + solution.lengthOfLongestSubstring(test));
            System.out.println("-------------------");
        }
    }
}
