import java.util.ArrayList;
import java.util.List;

//1431.1431. Kids With the Greatest Number of Candies
//Easy
//Time Complexity : O(N)
//Space complexity : O(N)


public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        //sort array to get max element
        int max = -1 ;
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i] > max)
                max = candies[i];
        }

        List<Boolean> result = new ArrayList<>();
        //building result
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]+extraCandies >= max)
                result.add(true);
            else
                result.add(false);
        }

        return result;
    }
}
