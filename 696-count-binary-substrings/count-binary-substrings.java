class Solution {

    public int countBinarySubstrings(String s) {

        int n= s.length();

        int curr =1;
        int prev = 0;

        int ans = 0;

        for(int i=1; i<s.length(); i++){

            if(s.charAt(i)==s.charAt(i-1)){
                curr++;
            }else{

                ans += Math.min(prev, curr);
                prev = curr;
                curr=1;
            }
        }
        //count for last 
        ans += Math.min(prev, curr);

        return ans;
        
    }
}