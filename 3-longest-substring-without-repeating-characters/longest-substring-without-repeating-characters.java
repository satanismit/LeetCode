class Solution {

    public int lengthOfLongestSubstring(String s) {

    int n = s.length();
    Map<Character,Integer> map = new HashMap<>();

    int left =0;
    int longest = 0;

    for(int i=0; i<n; i++){

        map.put( s.charAt(i), map.getOrDefault(s.charAt(i),0)+1); //

        while(map.get(s.charAt(i))>1){

            map.put(s.charAt(left), map.get(s.charAt(left))-1);
            left++;
        }

        longest = Math.max( longest , i-left+1);


    }

    return longest;

    }
}