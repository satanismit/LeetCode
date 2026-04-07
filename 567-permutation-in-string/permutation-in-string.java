class Solution {
    
    public boolean checkInclusion(String s1, String s2) {

        int n = s2.length();

        Map<Character, Integer> map = new HashMap<>();

        for(char c:s1.toCharArray()){

            map.put(c, map.getOrDefault(c, 0)+1);
        }

        int left =0;
        int right= 0;

        Map<Character, Integer> map2= new HashMap<>();

        while(right<n){

            //expand window
            char c= s2.charAt(right);
            map2.put(c, map2.getOrDefault(c, 0)+1);


            //shirnk window
            if(right-left+1==s1.length()){

                if(map.equals(map2)){
                    return true;
                }

                char ch= s2.charAt(left);
                map2.put(ch, map2.get(ch)-1);
                if(map2.get(ch)==0)  map2.remove(ch);

                left++;
            }

            right++;
        }

        return false;
    }
}