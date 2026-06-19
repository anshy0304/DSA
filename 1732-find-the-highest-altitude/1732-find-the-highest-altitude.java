class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int pre = 0;
        int max = Integer.MIN_VALUE;
        for(int i=1;i<n+1;i++){
            pre = pre + gain[i-1];
            max = Math.max(pre,max);
        }
        return max < 0?0:max;
    }
}