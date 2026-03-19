class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int i=0;i<32;i++){
            int one = 0;
            int temp =(1<<i);
            for(int n:nums){
                if((n&temp) == 0){}
                else one++;
            }
            if(one%3 == 1) ans = ans |temp;
        }
        return ans;
    }
}