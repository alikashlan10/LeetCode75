import java.util.ArrayList;
import java.util.List;

//605.CanPlaceFlowers
//Easy
//Time Complexity : O(N)


public class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int FlowersCntr =0 ;
        if(flowerbed.length ==1 )
        {
            if(flowerbed[0]==0)
                return true;
        }
        for(int i=0;i<flowerbed.length;i++) {
            if(i==flowerbed.length-1)
            {
                if(flowerbed[i]==0 && flowerbed[i-1] ==0)
                    FlowersCntr++;
                flowerbed[i]=1;
            }
            else if (i==0){
                if(flowerbed[i]==0 && flowerbed[i+1]==0)
                {
                    FlowersCntr++;
                    flowerbed[i]=1;
                }
            }
            else{
                if(flowerbed[i]==0 && flowerbed[i+1]==0 && flowerbed[i-1]==0 ) {
                    FlowersCntr++;
                    flowerbed[i]=1;
                }
            }
        }
        return n<=FlowersCntr;
    }
}
