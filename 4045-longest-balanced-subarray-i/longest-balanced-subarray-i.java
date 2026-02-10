class Solution {

    public int longestBalanced(int[] nums) {

        int n= nums.length;

        int max=0;


        for(int i=0; i<n; i++){
            
            Set<Integer> set =new HashSet<>();
            int odd=0, even=0;

            for(int j=i; j<n; j++){

                if(!set.contains(nums[j])){
                    set.add(nums[j]);

                    if(nums[j]%2==0) even++;
                    else odd++;

                }

                if(odd==even)   max = Math.max( max, j-i+1);

            }
            
        }

        return max;

        
    }
}