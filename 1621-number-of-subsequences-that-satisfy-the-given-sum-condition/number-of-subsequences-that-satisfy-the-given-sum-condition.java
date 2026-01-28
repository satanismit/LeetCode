class Solution {

    public int numSubseq(int[] nums, int target) {
        
        int n= nums.length;

        Arrays.sort(nums);

        int cnt = 0, left=0, right = n-1, mod= (int)1e9 + 7;

        //pre compute power of 2 
        int[] pows = new int[n];
        pows[0]=1;
        for(int i=1; i<n; i++){

            pows[i] = (pows[i-1]*2)%mod;
        }

        // two pointer check condition and count no. of subsequences 
        while(left<=right){

            if(nums[left]+nums[right]>target){

                right--;
            }else{

                cnt = (cnt + pows[right-left])%mod; 
                left++;
            }
        }

        return cnt;

    
    }
}