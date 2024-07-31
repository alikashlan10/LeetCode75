import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//345.Reverse words of string
//Medium
//Time Complexity : O(N)
//Space Complexity : O(N)


public class Solution {
    public String reverseWords(String s) {


      StringBuilder sb = new StringBuilder();
      Stack<String> stack = new Stack<>();
      s = s.trim();

      for (int i = 0; i < s.length(); i++) {
          if (s.charAt(i) == ' ' && s.charAt(i - 1) != ' '){

              stack.push(sb.toString());
              sb = new StringBuilder();

          } else if (i+1 == s.length()) {
              sb.append(s.charAt(i));
              stack.push(sb.toString());
              sb = new StringBuilder();
          }else if(s.charAt(i) == ' '){
              continue;
          }
          else{
              sb.append(s.charAt(i));
          }
      }
      StringBuilder res = new StringBuilder();
      while (!stack.isEmpty()) {
          res.append(stack.pop());
          res.append(" ");
      }

        res.deleteCharAt(res.length() - 1);

        return res.toString();
    }
}
