class Solution {
    
    public boolean isValid(Map<Character,Integer> curr, Map<Character, Integer> map){

        for(char c:map.keySet()){

            if(curr.getOrDefault(c,0) < map.get(c)) return false;
        }

        return true;
    }

    public String minWindow(String s, String t) {

        int n= s.length();

        Map<Character, Integer> map = new HashMap<>();

        for(char c:t.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        // we need curr hashmap to compare with original 
        Map<Character, Integer> curr = new HashMap<>();

        int minlen =Integer.MAX_VALUE;
        int start=0;
        int right=0, left=0;
        
        while(right<n){
            
            char c = s.charAt(right);

           curr.put(c , curr.getOrDefault(c, 0)+1 );

            
            while(isValid(curr, map)){

                if (right - left + 1 < minlen) {
                    minlen = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);
                curr.put(leftChar, curr.get(leftChar) - 1);

                if(curr.get(leftChar)==0)  curr.remove(leftChar);    
                left++;
            }

            
            right++;

        }



        return minlen == Integer.MAX_VALUE ? "" : s.substring(start, start + minlen);
        
    }
}