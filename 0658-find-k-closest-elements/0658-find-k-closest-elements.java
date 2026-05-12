class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a, b) -> {
                if (b[0] == a[0]) return b[1] - a[1];
                return b[0] - a[0];
            }
        );
        for(int i=0;i<arr.length;i++){
            int diff = Math.abs(x-arr[i]);
            pq.add(new int[]{diff,arr[i]});
            if(pq.size() > k) pq.poll();
        }
        List<Integer> ans = new ArrayList<>();
        while(!pq.isEmpty()){
            int[] top = pq.poll();
            ans.add(top[1]);
        }
        Collections.sort(ans);
        return ans;
    }
}