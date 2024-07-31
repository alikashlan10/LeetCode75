import java.util.*;

//151.Reverse words of string
//Medium
//Time Complexity : O(N)
//Space Complexity : O(N)


public class Solution {
    public String reverseWords(String s) {
        // Trim the input string and split by one or more spaces
        List<String> words = Arrays.asList(s.trim().split("\\s+"));

        // Reverse the list of words
        Collections.reverse(words);

        // Join the words back into a single string with a space separator
        return String.join(" ", words);
    }
}
