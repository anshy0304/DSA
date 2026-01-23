class Solution {
    public int hours(int piles[], int k){
        int hrs = 0;
        for(int i=0;i<piles.length;i++){
            hrs += Math.ceil(1.0*piles[i]/k);
        }
        return (int)hrs;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        
        for(int i:piles){
             max = Math.max(max,i);
             
             };

            
        int start = 1;
        int ans = -1;
        while(start <= max){
            int k = start + (max - start)/2;
            long hrs = hours(piles,k);
            if(hrs <= h){
                ans = k;
                max = k-1;
            }
           else start = k + 1;
        }
        return ans;
        
        
    }
}