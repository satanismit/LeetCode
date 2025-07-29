class Solution {
    public int kthGrammar(int n, int k) {


     // Base condition
     if(n==1 && k==1){

        return 0;
     }

     int  length=(int)Math.pow(2,n-1);
     int mid=length/2;
     //recurrence relation 

     if(k<=mid){

        return kthGrammar(n-1,k);
     }
             return 1-kthGrammar(n-1, k-mid);
     
    }
}