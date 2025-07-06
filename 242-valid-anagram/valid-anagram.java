class Solution {
    public boolean isAnagram(String s, String t) {
        
        int n=s.length();
        if(n!=t.length()){ return false;}

        Map<Character,Integer> map=new HashMap<>();
        //count the frquencies of s
        for(char c:s.toCharArray()){

            map.put(c, map.getOrDefault(c,0)+1);
        }

        for(char c:t.toCharArray()){
            int count = map.getOrDefault(c, 0);
            if (count == 0) {
                return false;
            }
           map.put(c, count - 1);
        }

        return true;





    }
}