class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int ans=0;
        // for(int i=0;i<n;i++)
        // {
        //     HashSet<Character>set=new HashSet<>();
        //     for(int j=i;j<n;j++)
        //     {
        //         char ch=s.charAt(j);
        //         if(set.contains(ch)){
        //             break;
        //         }
        //         set.add(ch);
        //         ans=Math.max(ans,j-i+1);
        //     }
        // }
        int i=0;
        int j=0;
        int []freq=new int[256];
        while(j<n)
        {
            char ch=s.charAt(j);
            freq[ch]++;
            j++;
            while(i<j && freq[ch]>1)
            {
                char ch2=s.charAt(i);
                freq[ch2]--;
                i++;
            }
            ans=Math.max(ans,j-i);
        }
        return ans;
    }
}