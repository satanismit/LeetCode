class Solution {

    public boolean isPrime(int n){

         if(n <= 1) return false;

        for(int i=2; i*i<=n; i++){
            if(n%i==0) return false;   
        }

        return true;
    }

    public int minOperations(int[] nums) {

        int n= nums.length;

        int operations = 0;

        for(int i=0; i<n; i++){

            int val = nums[i];
 
            if(i%2==0){
                //even index --> expected prime

                if(isPrime(nums[i])==false){

                    int x= val;

                    while(isPrime(x)==false){
                        x++;
                    }
                    operations += (x - val);

                }
            }else{

                //odd index --> expected non prime

                if(isPrime(val)==true){

                   if(val == 2){
                        operations += 2; // 2 → 4
                    } else {
                        operations += 1; // odd prime → even → non-prime
                    }
                }
            }
        }

        return operations;

    }
}