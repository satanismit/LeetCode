class Solution {

    public int[] plusOne(int[] digits) {

        int n= digits.length;

        int i=n-1;

            while(i>=0 && digits[i]==9){
                i--;
            }

        if(i < 0){

            int[] res = new int[n+1];
            Arrays.fill(res, 0);
            res[0]= 1;
            return res;
        }

            digits[i] += 1;

        i+=1;
        while(i<n){
            digits[i] = 0; 
            i++;
        }

        return digits;

  
    }
}