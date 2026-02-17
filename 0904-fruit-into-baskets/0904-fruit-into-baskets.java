class Solution {
    public int totalFruit(int[] fruits) {
        int fr[] = new int[1000001];
        int type = 0;
        int max = 0;
        int s = 0;
        for(int i=0;i<fruits.length;i++){
            int f = fruits[i];
            if(fr[f] == 0)type++;
            fr[f]++;
            while(type > 2){
                int sf = fruits[s];
                fr[sf]--;
                if(fr[sf] == 0) type--;
                s++;
            }
            max = Math.max(max,i-s+1);
        }
        return max;
    }
}