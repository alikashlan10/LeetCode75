import java.util.*;
import java.util.stream.IntStream;

//1679.max number of k sum pairs
//medium
//Time Complexity : O(N)
//Space Complexity : O(1)


class Solution {
    public int maxOperations(int[] nums, int k) {
        int ops = 0 ;
        int left = 0;
        int right = nums.length - 1;
        Arrays.sort(nums);
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == k) {
                right--;
                left++;
                ops++;
            }
            else if (sum < k)
                right--;
            else left++;
        }
        return ops;
    }
}
