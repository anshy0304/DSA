class Solution {
    public long sumAndMultiply(int n) {
        long num = 0;
        long sum = 0;
        long p = 1;
        while(n != 0){
            if(n%10 != 0){
                num += (n%10)*p;
                sum += n%10;
                p *= 10;
            }
            n /= 10;
        }
        return num*sum;
    }
}