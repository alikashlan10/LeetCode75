import java.util.*;
import java.util.stream.IntStream;

//643. Maximum Average Subarray i
//easy
//Time Complexity : O(N)
//Space Complexity : O(1)


class Solution {
    public double findMaxAverage(int[] nums, int k) {
        //determine first window's avg value and sum
        double sum=0;
        for(int i=0;i<k;i++)
            sum += nums[i];
        double maxAvg = sum/k;

        //in case array only has one possible window
        if(k==nums.length) return maxAvg;


        int right = k;
        int left =1;

        while (right< nums.length){
            sum  += nums[right] ;
            sum -= nums[left-1];
            right++;
            left++;
            maxAvg = Math.max(sum/k,maxAvg);
        }

        return maxAvg;


    }
}
