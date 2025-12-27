class Solution {

    public int solve(int[] days,int[] costs,int i,int[] memo){


    // base case 

      if(i==days.length){
        return 0;
      }

      if(memo[i]!=-1)  return memo[i];

            //go for 1day pass
        int first = costs[0] + solve(days, costs, i+1,memo);

        //go for 7 day pass
        int j = i;
        while(j<days.length  && days[j] <= days[i]+6)  j++;
        
        int second = costs[1] + solve(days, costs, j,memo);
        //go for 30 day pass

         j=i;
        while( j<days.length && days[j] <=days[i]+29)  j++;

        int third = costs[2] + solve(days, costs, j,memo);


     return memo[i]=Math.min( first, Math.min(second, third));

     
    }

    public int mincostTickets(int[] days, int[] costs) {
        
        int[] memo = new int[days.length];

        Arrays.fill(memo, -1);  

        return solve(days, costs, 0,memo);
    }
}