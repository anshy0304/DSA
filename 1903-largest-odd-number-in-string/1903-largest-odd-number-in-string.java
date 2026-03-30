class Solution {
    public String largestOddNumber(String num) {
        if(num.charAt(num.length()-1)%2 != 0) return num;
        StringBuilder sb = new StringBuilder();
        int i = num.length()-1;
        for(;i>=0;i--){
            char ch = num.charAt(i);
            if(ch%2!=0){
                break;
            }
        }
        sb.append(num.substring(0,i+1));
        return sb.toString();
    }
}