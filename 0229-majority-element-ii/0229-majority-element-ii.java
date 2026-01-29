class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1 = 0,c2=0;
        int count1 = 0,count2 = 0;
        for(int n:nums){
            if(c1 == n) {
                count1++;
            }
            else if(c2 == n){
                count2++;
            }
            else if(count1 == 0){
                c1 = n;
                count1=1;
            }else if(count2==0){
                c2 = n;
                count2 = 1;
            }
            else {
                count1--;
                count2--;
            }
        }
        count1 =0;
        count2 = 0;
        for(int n:nums){
            if(n == c1)count1++;
            else if(n == c2) count2++;
        }
        List<Integer> ans = new ArrayList<>();
        if (count1 > nums.length / 3) ans.add(c1);
        if (count2 > nums.length / 3) ans.add(c2);

        return ans;
    }
}