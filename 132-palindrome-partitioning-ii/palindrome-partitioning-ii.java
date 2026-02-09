class Solution {


    public boolean isPalindrom(String s){
        int l=0, r=s.length()-1;

        while(l<r){
            if(s.charAt(l)!=s.charAt(r))  return false;

            l++; r--;
        }

        return true;

    }

    //memoization 
   int[] memo;

    public int partition(String s, int i,int n){
        
        //base case
        if(i==n)  return 0;

        if(memo[i]!=-1)  return memo[i];

        int ans = Integer.MAX_VALUE;

        for(int j=i; j<n; j++){
            
            String temp = s.substring(i,j+1);

            if(isPalindrom(temp)){

                int cost =1 + partition(s,j+1,n);
                ans = Math.min(cost, ans);
            }

        }

        return memo[i]=ans;

    }

   

    public int minCut(String s) {

        int n= s.length();

        memo = new int[n];
       Arrays.fill(memo, -1);

        return partition(s, 0,n)-1;  //becase we have n-1 cuts for n partition 

     
        
    }
}