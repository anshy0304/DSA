class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] pre = new int[n+1];
        int max = Integer.MIN_VALUE;
        for(int i=1;i<n+1;i++){
            pre[i] = gain[i-1] + pre[i-1];
            max = Math.max(pre[i],max);
        }
        return max < 0?0:max;
    }
}