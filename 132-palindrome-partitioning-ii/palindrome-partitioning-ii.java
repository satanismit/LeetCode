class Solution {


    public boolean isPalindrom(String s){
        int l=0, r=s.length()-1;

        while(l<r){
            if(s.charAt(l)!=s.charAt(r))  return false;

            l++; r--;
        }

        return true;

    }

    // tabulation method 
    public int minCut(String s) {

        int n= s.length();

       int[] dp =new int[n+1];

       for(int i=n-1; i>=0;i--){

        int ans = Integer.MAX_VALUE;

        for(int j=i; j<n; j++){
            
            String temp = s.substring(i,j+1);

            if(isPalindrom(temp)){

                int cost =1 + dp[j+1];
                ans = Math.min(cost, ans);
            }

        }

        dp[i]=ans;
            
       }

        return dp[0]-1;  //becase we have n-1 cuts for n partition 

     
        
    }
}