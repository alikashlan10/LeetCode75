import java.util.ArrayList;
import java.util.List;

//605.CanPlaceFlowers
//Easy
//Time Complexity : O(N)


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
