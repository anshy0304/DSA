class Solution {
    public int countDigits(int num) {
       int tem = num;
       int count = 0;
       while(num != 0){
        int n = num%10;
        if(tem%n == 0) count++;
        num /= 10;
       }
       return count;
    }
}