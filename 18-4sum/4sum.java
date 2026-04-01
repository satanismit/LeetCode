class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        int n= nums.length;

        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();

        //fix one ele
        for(int i=0; i<n-3; i++){

            if(i>0 && nums[i]==nums[i-1])  continue;

            //fix second ele
            for(int j=i+1; j<n-2; j++){


                if(j>i+1 && nums[j]==nums[j-1]) continue;

                int left = j+1;
                int right = n-1;

                while(left<right){

                    long sum = (long)nums[i]+nums[j]+nums[left]+nums[right];

                    if(sum==target){

                        ans.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;

                        //skip dublicate 
                        while(left<right && nums[left]==nums[left-1]) left++;
                        while(left<right && nums[right]==nums[right+1]) right--;

                    }else if(sum <target){

                        left++;
                    }else{
                        right--;
                    }
                }
            }
        }

        return ans;
        
    }
}