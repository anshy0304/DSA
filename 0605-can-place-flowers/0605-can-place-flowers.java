class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {

        int i=0;
        while(i<arr.length){
            if(arr[i] == 1){
                i+=2;
            }else{
                int left = (i==0)?0:arr[i-1];
                int right = (i==arr.length-1)?0:arr[i+1];
                if(left == 0 && right == 0){
                    arr[i] = 1;
                    n--;
                    i+=2;
                }else i++;
            }

          }
            
        return n<=0;
    }
}