class Solution {

    public int helper(String s, int k){
    
    int n=s.length();
    Map<Character, Integer> map = new HashMap<>();

    int left =0, res=0;

    for(int right=0;  right<n; right++){

        map.put( s.charAt(right), map.getOrDefault(s.charAt(right),0)+1);  //expand the window 

        while(map.size() > k){ // shrink the window  

            char ch= s.charAt(left);
            map.put(ch, map.get(ch)-1);
            
            if(map.get(ch)==0)  map.remove(ch);

            left++;

        }

        res += right-left+1;
    }

    return res;

    }

    public int numberOfSubstrings(String s) {

        int n= s.length();

        return helper(s, 3)-helper(s,2);
        
    }
}