class Solution {
    public boolean isVowel(char s){
        if(s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u' || s == 'A' || s == 'E' || s == 'I' || s == 'O' ||s == 'U') return true;
        return false;
    }
    public String reverseVowels(String s) {
        List<Character> list = new ArrayList<>();
        for(char ch:s.toCharArray()){
            if(isVowel(ch)) list.add(ch);
        }
        Collections.reverse(list);
        StringBuilder sb = new StringBuilder();
        int j = 0;
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                sb.append(list.get(j));
                j++;
            }else  sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}