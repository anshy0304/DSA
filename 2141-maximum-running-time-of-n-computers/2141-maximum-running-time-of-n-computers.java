class Solution {
    boolean canRun(long i,int[] battery,int n){
        long total = 0;
        for(int b:battery){
            total += Math.min(i,b);
        }
        return total>= (long) i*n;
    }
    public long maxRunTime(int n, int[] battery) {
        long sum = 0;
        for(int i:battery){
            sum+=i;
        }

        long l = 0;
        long r = sum/n;

        while(l<r){
            long mid = r-(r-l)/2;
            if(canRun(mid,battery,n)){
                l = mid;
            }else {
                r = mid-1;
            }
        }
        return l;
    }
}