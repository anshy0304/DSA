class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Queue<Integer> queue=new LinkedList<>();
        int n=deck.length;
        for(int i=0;i<n;i++){
            queue.add(i);
        }
        int [] result=new int[deck.length];
        Arrays.sort(deck);
        for(int ele:deck){
            result[queue.poll()]=ele;
             queue.add(queue.poll());

        }
       
       return result;
        
    }
}