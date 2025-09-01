class Solution {
    public String largestOddNumber(String num) {
    
        int n=num.length();

        if( (int)num.charAt(n-1)%2==1){
            return num;
        }

        int i=n;
        while(i-->0){

            int val= num.charAt(i);
            if(val%2==1){
                return num.substring(0,i+1);
            }
        }

        return "";


    }
}