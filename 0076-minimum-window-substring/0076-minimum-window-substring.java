// class Solution {
//     public String minWindow(String s, String t) {
//         int len_t = t.length();
        
//          int count = 0;

//         int i = 0;
//         int j = i;
//         String ans = "";
//         while(i<s.length() && j<s.length()){
//             if (t.contains(String.valueOf(s.charAt(j)))) {
//                 count++;
//                 if(count == len_t){
//                     String window = s.substring(i,j+1);
//                     if(ans.isEmpty() || ans.length() > window.length()){
//                         ans = window;
//                     }
//                     count = 0;
//                     i = j+1;
                    
//                 }
                
//                 j++;
                
//             }else {
//                 i++;
//                 j++;
//             }
//         }
//         return ans;
//     }
// }\


class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        int[] need = new int[128];
        int[] have = new int[128];

        // count frequency of t
        for (char c : t.toCharArray()) {
            need[c]++;
        }

        int required = t.length();  // total chars needed
        int count = 0;              // how many matched
        int i = 0, j = 0;
        String ans = "";

        while (j < s.length()) {
            char c = s.charAt(j);

            // if this char is needed
            if (need[c] > 0) {
                if (have[c] < need[c]) {
                    count++; // we satisfied one more char
                }
                have[c]++;
            }

            // when we have all chars, try to shrink
            while (count == required) {
                String window = s.substring(i, j + 1);
                if (ans.isEmpty() || window.length() < ans.length()) {
                    ans = window;
                }

                char left = s.charAt(i);
                if (need[left] > 0) {
                    have[left]--;
                    if (have[left] < need[left]) {
                        count--;
                    }
                }
                i++;
            }

            j++;
        }

        return ans;
    }

    
}
