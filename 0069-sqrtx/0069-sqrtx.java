class Solution {
    public int mySqrt(int x) {
        // return (int)Math.sqrt(x);
        long start = 0;
        long end = x;
        if(x == 1) return 1;
        while(start<=end){
            long mid = start + (end - start)/2;
            long sq = (mid*mid);
            if(sq == x){
                return (int)mid;
            }
            if((sq) > x){
                if((mid-1)*(mid-1) < x) return (int)mid-1;
                end = mid -1;

            }else start = mid+1;
        }
        return 0;
    }
}