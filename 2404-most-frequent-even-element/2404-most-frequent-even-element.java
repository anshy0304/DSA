class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int maxFreq = 0;
        int ans = Integer.MAX_VALUE;

        for(int num : nums){
            if(num % 2 == 0){
                int freq = map.getOrDefault(num, 0) + 1;
                map.put(num, freq);

                if(freq > maxFreq){
                    maxFreq = freq;
                    ans = num;
                }
                else if(freq == maxFreq){
                    ans = Math.min(ans, num);
                }
            }
        }

        return maxFreq == 0 ? -1 : ans;
    }
}
