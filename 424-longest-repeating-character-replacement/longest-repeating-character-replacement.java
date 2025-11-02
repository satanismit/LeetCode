class Solution {
    public int characterReplacement(String s, int k) {
        
        //length - max_f = no of swaps

        int n=s.length();
        int left =0,right=0,max_f=0,max_len=0;

        int[] hash =new int[26];

        while(right < n){

            hash[ s.charAt(right)-'A']++; //update frequency 
             
            max_f = Math.max(max_f, hash[s.charAt(right)-'A']);

            while((right-left+1)-max_f> k){
                 
                 hash[s.charAt(left)-'A']--;
                 left++;
            }

            max_len = Math.max(max_len,right-left+1);
        
            right++;


        }

        return max_len;
    }
}