class Solution {
    public String removeKdigits(String num, int k) {
        
        int n=num.length();
        StringBuilder res=new StringBuilder();


        for(int i=0; i<n; i++){

           while(res.length()>0 && res.charAt(res.length()-1)>num.charAt(i) && k>0){

                res.deleteCharAt(res.length()-1);
                k--;
           }

           res.append(num.charAt(i));
        }

        // still having k>0
        while(k>0 && res.length()>0){
            res.deleteCharAt(res.length()-1);
            k--;
        }

        //remove leading zero
        int i=0;
        while(i<res.length() && res.charAt(i)=='0') i++;

        String str = (i==res.length()) ? "0" :res.substring(i);

        return str;


    }
}