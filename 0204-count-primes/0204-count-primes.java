class Solution {
    public int countPrimes(int n) {
        if(n <= 2) return 0;
        boolean[] arr = new boolean[n+1];
        arr[0] = true;
        arr[1] = true;
        int count = 0;
        for(int i=2;i<n;i++){
            if(!arr[i]) {
                int num = i;
                count++;
                while(num <= n){
                    arr[num] = true;
                    num += i;
                }
            }
        }
        return count;
    }
}