class Solution {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int n = gas.length;

        int totalgas=0, totalcost =0;
        for(int i=0; i<n; i++){

            totalgas+=gas[i];
            totalcost+=cost[i];
        }

        if(totalgas < totalcost ) return -1;

        int st =0;
        int tank=0;

        for(int i=0; i<n; i++){

            tank += gas[i]-cost[i];

            if(tank<0){
                st=i+1;
                tank=0;
            }

        }
        
        return st;


    }


}