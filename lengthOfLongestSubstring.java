import java.util.*;
class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0, start = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++) {
           char currentChar = s.charAt(i);
           if(map.containsKey(currentChar)){
            start = map.get(currentChar) + 1;
           }
           map.put(currentChar,i);
           maxLength = Math.max(maxLength, i - start + 1);
           
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
