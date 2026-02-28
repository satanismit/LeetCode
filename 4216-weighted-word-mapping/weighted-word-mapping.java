class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        
        int n= words.length;

        StringBuilder ans = new StringBuilder();

        for(int i=0; i<n; i++){

            int sum =0;
            for(char c:words[i].toCharArray()){

                sum += weights[c-'a'];
            }

            int mod = sum % 26;

            char ch = (char)('z'-mod);

            ans.append(ch);

        }

        return ans.toString();




    }
}