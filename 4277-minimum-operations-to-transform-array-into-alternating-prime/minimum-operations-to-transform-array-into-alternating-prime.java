class Solution {

    static int MAX = 200005;
    static boolean[] isPrime = new boolean[MAX];
    static int[] nextPrime = new int[MAX];

    public void sieve(){

        //assume all prime 
        for(int i=2; i<MAX; i++)  isPrime[i]=true;

        for(int i=2; i*i<MAX; i++){

            if(isPrime[i]){
                //make false it's all multipliers 
                for(int j=i*i; j<MAX; j+=i){

                    isPrime[j]=false;
                }
            }
        }
    }

    public void computeNextPrime(){

        int next = -1;

        for(int i=MAX-1; i>=0; i--){

            if(isPrime[i])  next = i;

            nextPrime[i]=next;
        }
    }

    public int minOperations(int[] nums) {
        

        int n= nums.length;

        sieve();
        computeNextPrime();

        int operations=0;


        for(int i=0; i<n; i++){

            int val = nums[i];

            if(i%2==0){
                //even index --> prime 
                if(!isPrime[val]){

                    operations += (nextPrime[val]-val);
                }
            }else{

                //odd index --> non prime 
                 
                 if(isPrime[val]){

                    if(val==2)  operations+=2;
                    else operations++;
                 }
            }
        }
        return operations;

    }
}