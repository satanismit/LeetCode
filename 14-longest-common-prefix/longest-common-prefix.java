class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        int n=strs.length;
        StringBuilder ans = new StringBuilder("");


        for(int i=0; i<strs[0].length(); i++){

            char c= strs[0].charAt(i);

            for(int j=0; j<n; j++){

                if(i>=strs[j].length() || strs[j].charAt(i)!=c ){
                    
                    return ans.toString();
                }
                
            }
            ans.append(c);
            
        }

        return ans.toString();
    }
}