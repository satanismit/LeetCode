class Solution {
    public boolean isBalanced(String num) {
        
        int n=num.length();
        int evensum=0,oddsum=0;


        //even numbers 
        for(int i=0; i<n; i+=2){

            evensum+=num.charAt(i)-'0';

        }

        //odd numbers 
        for(int i=1; i<n; i+=2){

            oddsum+=num.charAt(i)-'0';

        }

        return evensum==oddsum;


    }
}