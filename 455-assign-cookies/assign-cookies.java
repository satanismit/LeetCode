class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        
        Arrays.sort(g);
        Arrays.sort(s);
        int count=0;
        int n=g.length, m= s.length;
        int left=0,right=0;

        while(left<m && right<n){

            if(g[right]<=s[left]){
                right++;
            }
            left++;
        }

        

        return  right;
    }
}