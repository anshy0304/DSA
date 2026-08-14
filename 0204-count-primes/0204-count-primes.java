class Solution {
    public int countPrimes(int n) {
        boolean[] arr = new boolean[n];
        int count = 0;
        for(int i=2;i<n;i++){
            if(!arr[i]){
                count++;
                int j = i;
                while(j < n){
                    arr[j] = true;
                    j += i;
                }
            }
        }
        return count;
    }
}