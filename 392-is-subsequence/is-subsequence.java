class Solution {

    public boolean isSubsequence(String s, String t) {

    
        int n=t.length();
        int m=s.length();

        if(s.length()==0) return true;

        int p1=0;

        for(int i=0; i<n && p1<m; i++){

            if(s.charAt(p1)==t.charAt(i)){
                p1++;
            }

        }

        return p1==m;
        
    }
}