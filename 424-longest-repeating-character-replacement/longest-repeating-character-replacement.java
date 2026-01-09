class Solution {
    public int characterReplacement(String s, int k) {
        
        //length - max_f = no of swaps

        int n=s.length();
        int left =0,right=0,max_f=0,max_len=0;

        Map<Character, Integer> map=new HashMap<>();

        while(right < n){

            map.put( s.charAt(right), map.getOrDefault(s.charAt(right),0)+1);//update freq
             
            max_f = Math.max(max_f, map.get(s.charAt(right))); //max frequency 

            if((right-left+1)-max_f> k){
                 
                 map.put( s.charAt(left), map.get(s.charAt(left))-1);
                 left++;
            }

            max_len = Math.max(max_len,right-left+1);
        
            right++;


        }

        return max_len;
    }
}