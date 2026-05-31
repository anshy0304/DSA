class Solution {
    public boolean asteroidsDestroyed(int mass, int[] a) {
        Arrays.sort(a);
        long sum = mass;
        for(int i=0;i<a.length;i++){
            if(sum < a[i]) return false;
            sum += a[i];
        }
        return true;
    }
}