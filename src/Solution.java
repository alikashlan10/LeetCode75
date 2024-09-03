import java.util.*;
import java.util.stream.IntStream;


//1456. Maximum Number of Vowels in a Substring of Given Length
//medium
//Time Complexity : O(N)
//Space Complexity : O(1)


class Solution {
    public int maxVowels(String s, int k) {

        StringBuilder sb = new StringBuilder(s);
        int max = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        //determine number of vowels in first window
        for (int i = 0; i < k; i++) {
            if(isVowel(sb.charAt(i)))
                max++;
        }



        int left = 0;
        int right = k-1;

        int curr= max;
        while(right+1 < s.length()) {


            if(isVowel(sb.charAt(left)))
                curr--;

            right ++;
            left ++;


            if(isVowel(sb.charAt(right)))
                curr++;

            max = Math.max(max, curr);
        }


        return max;
    }

    public boolean isVowel(char ch) {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            return true;
        else
            return false;
    }
}
