class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        int max=0;
        for(int num:arr1){
            while(num != 0){
                set.add(num);
                num /= 10;
            }
        }
        for(int num:arr2){
            while(num != 0){
                if(set.contains(num)){
                    max = Math.max(max,num);
                }
                num /= 10;
            }
        }
        int len = 0;
        while(max != 0) {
            len++;
            max /= 10;
        }
        return len;
    }
}