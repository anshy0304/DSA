class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i =0;i<tickets.length;i++){
            queue.add(i);
        }
        int count = 0;
        while(true){
            int i = queue.poll();
            tickets[i]--;
            
            count++;
            if(i == k && tickets[k] == 0) return count;
            if(tickets[i] > 0) queue.add(i);
            
        }
        
    }


}