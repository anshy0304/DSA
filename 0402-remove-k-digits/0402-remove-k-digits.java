class Solution {
    public String removeKdigits(String num, int k) {
        
        Stack<Character> st = new Stack<>();
        
        for(char ch: num.toCharArray()){
            
                while(k>0 && !st.isEmpty() && st.peek()>ch ){
                st.pop();
                k--;
                }
                st.push(ch);
            
            
          
          
            
        }
        while(k>0 && !st.isEmpty()){
            st.pop();
            k--;
        }
StringBuilder sb=new StringBuilder();
for( char ch: st){
    sb.append(ch);
}
int i=0;
while(i<sb.length()-1 && sb.charAt(i)=='0'){
    i++;
}
String sbb=sb.substring(i);
return sbb.isEmpty()?"0":sbb;
    }
}