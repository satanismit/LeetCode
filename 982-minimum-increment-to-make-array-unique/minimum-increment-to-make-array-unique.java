class Solution {

    public int minIncrementForUnique(int[] nums) {
        
        int n= nums.length;

        //get max 
        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
           max = Math.max(max, nums[i]);
        }

        //count frequency 
        int[] freq = new int[max+n];
        for(int i=0; i<n; i++){

            freq[nums[i]]++;
        }
        
        int min_increment = 0;

        for(int i=0; i<freq.length; i++){

            if(freq[i]<=1) continue;

            int dup = freq[i] -1;
            freq[i+1] += dup;

            freq[i]=1;

            min_increment += dup;

        }

        return min_increment;

    }
}