class Solution {

    public String minWindow(String s, String t) {

        int n= s.length();

        Map<Character, Integer> map = new HashMap<>();

        for(char c:t.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        // we need curr hashmap to compare with original 
        Map<Character, Integer> curr = new HashMap<>();

        int left = 0, right =0;
        int ans = Integer.MAX_VALUE;
        int formed = 0;
        int required = map.size();
        int start =0;

        while(right<n){
            
            char ch = s.charAt(right);

           if (map.containsKey(ch)) {
                curr.put(ch, curr.getOrDefault(ch, 0) + 1);

                if (curr.get(ch).intValue() == map.get(ch).intValue()) {
                    formed++;
                }
            }
            
            while(formed == required){

                if (right - left + 1 < ans) {
                    ans = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);

                if (map.containsKey(leftChar)) {

                    curr.put(leftChar, curr.get(leftChar) - 1);

                    if (curr.get(leftChar) < map.get(leftChar)) {
                        formed--;
                    }
                }
                
                left++;
            }

            
            right++;

        }



        return ans == Integer.MAX_VALUE ? "" : s.substring(start, start + ans);
        
    }
}