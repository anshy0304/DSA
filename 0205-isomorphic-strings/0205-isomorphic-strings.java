class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] s1 = new int[256];
        int[] t1 = new int[256];
        for(int i = 0;i<s.length();i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(s1[a] == 0 && t1[b] == 0) {
                s1[a] = b;
                t1[b] = a;
            } else if(s1[a] != b && t1[b] != a) return false;
        }
        return true;
     }
}