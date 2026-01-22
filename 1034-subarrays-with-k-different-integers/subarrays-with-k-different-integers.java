class Solution {

    //helper function to find atmost K distinct number
    public int helper(int[] nums, int k){
    
    int n= nums.length;
    Map<Integer, Integer> map = new HashMap<>();

    int left =0, res=0;

    for(int right=0;  right<n; right++){

        map.put( nums[right], map.getOrDefault(nums[right],0)+1);  //expand the window 

        while(map.size() > k){ // shrink the window  

            map.put(nums[left], map.get(nums[left])-1);
            
            if(map.get(nums[left])==0)  map.remove(nums[left]);

            left++;

        }

        res += right-left+1;
    }

    return res;

    }

    public int subarraysWithKDistinct(int[] nums, int k) {
    
    //calculate exact K distinct number we do

    return helper(nums, k) - helper(nums, k-1);
    
        
    }
}