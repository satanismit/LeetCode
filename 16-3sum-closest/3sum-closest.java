class Solution {

    public int threeSumClosest(int[] nums, int target) {

        int n= nums.length;

        Arrays.sort(nums);

        int ans = nums[0]+nums[1]+nums[2];

        //traverse till n-3
        for(int i=0; i<n-2; i++){

            int left = i+1, right = n-1;

            while(left<right){

                int sum = nums[left]+nums[i]+nums[right];

                
                if(Math.abs(sum-target) < Math.abs(ans-target)){
                    ans = sum;
                }

                if(sum>target){
                    right--;
                    
                }else if(sum<target){

                    left++;
                }else{

                    return sum;
                }
            }
        }

        return ans;


        
    }
}