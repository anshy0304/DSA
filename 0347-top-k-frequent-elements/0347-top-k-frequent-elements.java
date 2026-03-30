class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums) map.put(i,map.getOrDefault(i,0)+1);
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>(
            (a,b) -> {
                return a.getValue() - b.getValue();
            }
        );
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            pq.add(entry);
            if(pq.size() > k) pq.poll();
        }
        int[] ans = new int[pq.size()];
        int i = 0;
        while(!pq.isEmpty()){
            Map.Entry<Integer,Integer> entry = pq.poll();
            ans[i] = entry.getKey();
            i++;
        }
        return ans;
    }
}