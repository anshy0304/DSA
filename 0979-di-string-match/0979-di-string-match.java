class Solution {
    public int[] diStringMatch(String s) {
        int ans[] = new int[s.length()+1];
        int i = 0;
        int j = ans.length-1;
        for(int k=0;k<s.length();k++){
            if(s.charAt(k)  == 'I'){
                ans[k] = i;
                i++;
            }
            else{
                ans[k] = j;
                j--;
            }
        }
        ans[ans.length-1] = i;
        return ans;
    }
}