class Solution {
    String finl ="";
    public void permutation(StringBuilder ans,String[] nums,int n){
        if(finl.length() > 0) return;
        if(n == 0) {
            boolean found = false;
            for(int i=0;i<nums.length;i++){
                if(nums[i].equals(ans.toString())){ found = true;break;}
            }
            if(!found) finl = ans.toString();
            return ;
        }
        int k = ans.length();
        permutation(ans.append("0"),nums,n-1);
        ans.setLength(k);
        permutation(ans.append("1") ,nums,n-1);
        ans.setLength(k);
    }


    public String findDifferentBinaryString(String[] nums) {
        int n = nums[0].length();
        StringBuilder ans = new StringBuilder();
        
        permutation(ans,nums,n);
        return finl;
    }
}