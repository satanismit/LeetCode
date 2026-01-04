class Solution {

    // public int sumFourDivisors(int[] nums) {
        
    //     int n= nums.length;
    //     int[] arr = new int[n];


    //     for(int i=0; i<n; i++){

    //         int count = 0, sum=0;
    //         for(int j=1; j<=nums[i]; j++){

    //             if(nums[i]%j==0){
    //                 sum += j;
    //                 count++;
    //             }

    //         }

    //         if(count==4)  arr[i]=sum;
    //     }

    //     int ans = 0;
    //     for(int i=0; i<n; i++)   ans+=arr[i];

    //     return ans;

        
    // }

    public boolean isPrime(int n){

        if(n<2) return false;

        for(int i=2; i<n; i++) if(n%i==0) return false;

        return true;
    }

    public int sumFourDivisors(int[] nums) {

        int n= nums.length;
        int total = 0;

        for(int num:nums){

            //check it is cube of prime or not  p^3
            int p = (int)Math.round(Math.cbrt(num));

            if( (long)p*p*p==num && isPrime(p)) {

                total += 1+p+p*p + num;
                continue;
            }

            //check p * q 

            for(int i=2; i<num; i++){

                //check for p
                if(num%i==0){

                    int j = num/i;  //get q

                    if( i!=j && isPrime(i) && isPrime(j)) {
                        total += 1 + i + j + num;
                    }

                    break; // for only first prime numbers that made up num = p*q
                }
            }


        }
        return total;


    }
}