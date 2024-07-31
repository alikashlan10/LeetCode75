import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//345.Reverse vowels of a string
//Easy
//Time Complexity : O(N)
//Space Complexity : O(N)


public class Solution {
    public String reverseVowels(String s) {

        Stack<Character> placeHolder = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'
                    || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U'){
                placeHolder.push(s.charAt(i));
            }
        }

        //int pointer=0;
        StringBuilder reversed = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'
               || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U'){
                if(!placeHolder.isEmpty()){}
                reversed.setCharAt(i,placeHolder.pop());
            }
            else{
                reversed.setCharAt(i,s.charAt(i));
            }
        }

        return reversed.toString();
    }
}
