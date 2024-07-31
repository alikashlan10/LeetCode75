import java.util.*;

//238.ProductOfArrayExceptSelf
//Medium
//Time Complexity : O(N)
//Space Complexity : O(1)
// beats 99.96 %


class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] res = new int[length];

        res[0] = 1;

        //left (prefix)
        for (int i = 1; i < length; i++) {
            res[i] = nums[i - 1] * res[i - 1];
        }

        // Calculate the right (suffix) product and combine it with the left product
        int rightProduct = 1;
        for (int i = length - 1; i >= 0; i--) {
            res[i] = res[i] * rightProduct;
            rightProduct *= nums[i];
        }

        return res;
    }
}

