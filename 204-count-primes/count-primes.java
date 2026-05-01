class Solution {

    public int countPrimes(int n) {

        if(n<=2) return 0;

        boolean[] arr= new boolean[n+1];

        Arrays.fill(arr, true);

        for(int i=2; i*i<n; i++){

            if(arr[i]){

                //remove its multipliers 
                for(int p=2*i; p<n; p+=i){
                    arr[p]=false;
                }
            }
        }

        int count = 0;
        for (int p = 2; p < n; p++) {
            if (arr[p])
                count++;
        }

        return count;

        
    }


}