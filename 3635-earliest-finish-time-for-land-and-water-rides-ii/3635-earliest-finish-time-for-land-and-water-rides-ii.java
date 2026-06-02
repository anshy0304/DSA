class Solution {
    public int helper(int[] s, int[] sd){
        int time = Integer.MAX_VALUE;
        for(int i=0;i<sd.length;i++){
            time = Math.min(time,s[i]+sd[i]);
        }
        return time;
    }
    public int earliestFinishTime(int[] s, int[] sd, int[] w, int[] wd) {
        int st = helper(s,sd);
        int  wt = helper(w,wd);
        int min = Integer.MAX_VALUE;
        for(int i=0;i<wd.length;i++){
            min = Math.min(min,Math.max(st,w[i]) + wd[i]);
        }
        st = min;
        min = Integer.MAX_VALUE;
        for(int i=0;i<sd.length;i++){
            min = Math.min(min,Math.max(wt,s[i]) + sd[i]);
            
        }
        wt = min;
        return  Math.min(st,wt);
    }
}