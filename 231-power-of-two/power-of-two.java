class Solution {
    public boolean isPowerOfTwo(int n) {
        
        boolean flag = false;
        double t =n;

        while(t>0){

            if(t==1){
                flag=true;
            }
            t/=2;
        }

        return flag;
    }
}