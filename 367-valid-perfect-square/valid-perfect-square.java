class Solution {
    public boolean isPerfectSquare(int num) {
        if (num == 1){
            return true;
        }

        long i = 1;
        while(i * i <= num){
            if(i * i == num){
                return true;
            }
            i++;
        }
        return false;
        
    }
}