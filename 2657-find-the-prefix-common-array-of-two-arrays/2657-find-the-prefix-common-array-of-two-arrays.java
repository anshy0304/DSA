class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] ans = new int[A.length];
        int freqA[] = new int[51];
        int freqB[] = new int[51];
        for(int i=0;i<A.length;i++){
            freqA[A[i]]++;
            freqB[B[i]]++;
            for(int j=0;j<51;j++){
                if(freqA[j] == freqB[j]) ans[i] += freqA[j];
            }
        }
        return ans;
    }
}