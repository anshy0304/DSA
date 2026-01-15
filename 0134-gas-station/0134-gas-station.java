class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
       
        // int n = gas.length;
        // for(int i=0;i<gas.length;i++){
            
        //      int fuel = 0;
        //     boolean possible = true;
        //     for(int j =i;j<n+i;j++){
        //         int in = j%n;
        //         fuel += gas[in]-cost[in];
        //         if(fuel<0){
        //             possible = false;
        //             break;
        //         }

        //     }
        //     if(possible) return i;

        // }
        // return -1;


        int totalGas = 0;
        int totalCost = 0;
        for(int i= 0;i<gas.length;i++){
            totalGas += gas[i];
            totalCost += cost[i];
        }
        if(totalGas <totalCost) return -1;
        int fuel=0;int si=0;
        for(int i=0;i<gas.length;i++){
            fuel += gas[i]- cost[i];
            if(fuel<0) {
                fuel = 0;
                si = i+1;
            }
        }   
        return si;
    }
}

//linear queue drawbacks->after full it can never insert new element no matter if deleted started elements