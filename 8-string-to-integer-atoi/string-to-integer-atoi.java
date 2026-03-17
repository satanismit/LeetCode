class Solution {
    public int myAtoi(String s) {

        s= s.trim();
        int n= s.length();

        int sign = 1, i=0;
        
        if(s.length()==0)  return 0;

        if(s.charAt(0)=='-'){  sign = -1; i++; }
        else if(s.charAt(0)=='+') {  i++; }

        long res = 0;

        while(i<n){

            char ch = s.charAt(i);

            if(ch<'0' || ch>'9') break;

            res =  res *10 + (ch-'0');

            if(res*sign > Integer.MAX_VALUE)  return Integer.MAX_VALUE;
            if(res*sign < Integer.MIN_VALUE)  return Integer.MIN_VALUE;

            i++;

        }

        int ans = (int)res;

        return sign==-1 ? -ans : ans;


        
    }
}