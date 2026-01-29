class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int arr[] = new int[spells.length];
        Arrays.sort(potions);
        for(int i=0;i<spells.length;i++){
            int start = 0;
            int end = potions.length-1;
            int idx = -1;
            while(start<=end){
                int mid = start + (end - start)/2;
                if((long)spells[i]*potions[mid] >= success){
                    idx = mid;
                    end = mid-1;
                }else start = mid +1;
                }if(idx == -1) arr[i] = 0;
                else arr[i] = potions.length-idx; 
            }
           
            return arr;
        }
        
    }
