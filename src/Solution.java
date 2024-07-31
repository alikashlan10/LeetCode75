import java.util.ArrayList;
import java.util.List;

//1431.1431. Kids With the Greatest Number of Candies
//Easy
//Time Complexity : O(N)
//Space complexity : O(N)


public class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int FlowersCntr =0 ;
        for(int i=0;i<flowerbed.length;i++) {
            if(flowerbed[i]==0 && flowerbed[i+1]==0 && flowerbed[i-1]==0 ) {
                FlowersCntr++;
            }
        }
        return n==FlowersCntr;
    }
}
