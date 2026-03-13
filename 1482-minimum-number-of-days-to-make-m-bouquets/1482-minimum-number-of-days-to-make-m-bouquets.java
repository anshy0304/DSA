class Solution {
    public boolean isValid(int[] arr,int mid,int k,int m){
        int s = 0;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
          if(arr[i] <= mid) {
            s++;
            if(s == k){
                sum++;
                s = 0;
            }
          }else s = 0;
        }
        return sum >= m;
    } 
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long)m * k > bloomDay.length) return -1;
        int st = Integer.MAX_VALUE;
        int end = Integer.MIN_VALUE;
        int ans = -1;
        for(int i:bloomDay) {
            st = Math.min(st,i);
            end = Math.max(end,i);;
        }
        while(st<=end){
            int mid = st + (end -st)/2;
            if(isValid(bloomDay,mid,k,m)) {
                ans = mid;
                end = mid-1;
            }else st = mid +1;
            
        }
        return ans;
    }
}