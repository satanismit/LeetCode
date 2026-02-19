class Solution {

    public int countBinarySubstrings(String s) {

        int n= s.length();

        int i=0;
        int ans = 0;

        while(i<n){

            int ch = s.charAt(i);
            int zero = 0, ones = 0;

            //'0011' this like substring
            if(s.charAt(i)=='0'){

                while(i<n && s.charAt(i)=='0'){
                    zero++;
                    i++;
                }

                int j=i;

                while(j<n && s.charAt(j)=='1'){
                    ones++;
                    j++;
                }

            }// '1100' this like substring
            else{

                while(i<n && s.charAt(i)=='1'){
                    ones++;
                    i++;
                }

                int j=i;
                while(j<n && s.charAt(j)=='0'){
                    zero++;
                    j++;
                }
            }

            ans += Math.min(zero, ones);


        }

        return ans;
        
    }
}