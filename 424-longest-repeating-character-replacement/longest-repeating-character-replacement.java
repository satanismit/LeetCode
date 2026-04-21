class Solution {

    public int characterReplacement(String s, int k) {

        int n= s.length();

        int left = 0, right = 0;

        int max_fre=0;
        int ans = 0;

        Map<Character, Integer> map = new HashMap<>();

        while(right<n){

            map.put(s.charAt(right), map.getOrDefault(s.charAt(right),0)+1); // update frequency 

            max_fre = Math.max(max_fre, map.get(s.charAt(right)));

            //length - max_fre = no of swaps 
            while(right-left+1 - max_fre > k){

                map.put(s.charAt(left), map.get(s.charAt(left))-1);
                left++;
            }

            ans = Math.max(ans, right-left+1 );

            right++;

        }

        return ans;
        
    }
}