class Solution {
    public boolean helper(int[] arr,long mass,int i){
        if(i == arr.length){
            return true;
        }
        if(mass < arr[i]) return false;
        return helper(arr,mass + arr[i],i+1);
    }
    public boolean asteroidsDestroyed(int mass, int[] a) {
        Arrays.sort(a);
        return helper(a,(long)mass,0);
    }
}