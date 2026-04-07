class Solution {

    public List<Integer> findAnagrams(String s, String p) {

        int n= s.length();

        Map<Character, Integer> map = new HashMap<>();

        for(char c:p.toCharArray()){

            map.put(c, map.getOrDefault(c, 0)+1);
        }

        int right = 0;
        int left =0;

        List<Integer> list = new ArrayList<>();
        Map<Character, Integer> map2= new HashMap<>();

        while(right<n){

            char c = s.charAt(right);

            map2.put(c,map2.getOrDefault(c, 0)+1 );

            if(right-left+1== p.length()){

                if(map.equals(map2)){
                    list.add(left);
                }

                char ch = s.charAt(left);

                map2.put(ch, map2.get(ch) - 1);
                if (map2.get(ch) == 0) map2.remove(ch); 
                left++;
                
            }

            right++;
        }

        return list;
        
    }
}