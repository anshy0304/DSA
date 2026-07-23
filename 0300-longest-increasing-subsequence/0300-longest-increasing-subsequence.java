class Solution {
 
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(list.isEmpty() || list.get(list.size()-1) < nums[i]){
                list.add(nums[i]);
            }
            else {
                int idx = -1;
                int l=0,r=list.size() - 1;
                while(l<=r){
                    int mid = l + (r - l) / 2;
                    if(list.get(mid) >= nums[i]){
                        idx = mid;
                        r = mid -1 ;
                    }else l = mid +1 ;
                }
            list.set(idx,nums[i]);
            }

        }
        return list.size();
    }
}