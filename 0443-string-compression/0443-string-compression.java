class Solution {
    public int compress(char[] chars) {
        int write = 0;
        int count = 1;
        for(int i =1;i<chars.length;i++){
            if(chars[i] == chars[i-1]){
                count++;
            }else {
                chars[write++] = chars[i-1];
                if(count > 1) {
                    String  s = String.valueOf(count);
                    for(char ch:s.toCharArray()){
                        chars[write++] = ch;
                    }
                }
                count = 1;
            }
        }
        chars[write++] = chars[chars.length - 1];

        if (count > 1) {
            String s = String.valueOf(count);
            for (char ch : s.toCharArray()) {
                chars[write++] = ch;
            }
        }
        return write;
    }
}