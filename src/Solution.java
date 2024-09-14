import java.util.*;
import java.util.stream.IntStream;


//1732. Find the Highest Altitude
//Easy
//Time Complexity : O(N)
//Space Complexity : O(1)


class Solution {
    public int largestAltitude(int[] gain) {
        int max=0;
        int sum=0;
        for(int i=0;i<gain.length;i++)
        {
            sum += gain[i];
            max = Math.max(max, sum);
        }

        return max;
    }
}
