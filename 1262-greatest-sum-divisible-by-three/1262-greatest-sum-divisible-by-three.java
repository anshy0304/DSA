import java.util.*;

class Solution {
    public int maxSumDivThree(int[] nums) {
        int sum = 0;
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        for(int num:nums){
            sum+=num;
            if(num%3 == 1) l1.add(num);
            if(num%3 == 2) l2.add(num);

        }
        if(sum%3 == 0) return sum;
        Collections.sort(l1);
        Collections.sort(l2);
        int ans = 0;
        if(sum%3 == 1){
            int opt1 = l1.size()>0?sum - l1.get(0):Integer.MIN_VALUE;
            int opt2 = l2.size() >1?sum-l2.get(0)-l2.get(1):Integer.MIN_VALUE;
            ans = Math.max(opt1,opt2);
        }else {
             int opt1 = l2.size()>0?sum - l2.get(0):Integer.MIN_VALUE;
            int opt2 = l1.size() >1?sum-l1.get(0)-l1.get(1):Integer.MIN_VALUE;
            ans = Math.max(opt1,opt2);
        }
        return Math.max(ans,0);
    }
}
