class Solution {
    public char repeatedCharacter(String s) {

        Set<Character> set = new HashSet<>();

        int n=s.length();
        char ans='c';

        for(int i=0; i<n; i++){

            if(set.contains(s.charAt(i))){
                ans = s.charAt(i);
                break;
            }else{
                set.add(s.charAt(i));
            }
        }

        return ans;
        
    }
}