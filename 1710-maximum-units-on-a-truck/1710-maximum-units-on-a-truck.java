class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        int profit =0;
        for(int i=0;i<boxTypes.length;i++){
            int size = boxTypes[i][0];
            int mass = boxTypes[i][1];
            if(truckSize == 0) break;
            if(truckSize>=size){
                profit += (size*mass);
                truckSize -= size;
            }else{
                profit += truckSize*mass;
                truckSize = 0;
            }
        }
        return profit;
    }
}