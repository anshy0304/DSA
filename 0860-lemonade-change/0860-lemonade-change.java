class Solution {
    public boolean lemonadeChange(int[] bills) {
        if(bills[0] == 10 || bills[0] == 20) return false;
        int five = 0;
        int ten = 0;
        boolean ans = true;
        for(int i=0;i<bills.length;i++){
            if(bills[i] == 5) five++;
            else if(bills[i] == 10) {
                if(five>0){
                   ten++;
                    five--;
                }else return false;
            }
            else {
                if(ten  >0 && five > 0) {
                    ten--;
                    five--;
                }else if(five >= 3) five-=3;
                else return false;
            }
        }
        return ans;
    }

}
