class Solution {

    public int longestConsecutive(int[] nums) {

        int n= nums.length;

        if(n==0) return 0;
        

        Arrays.sort(nums);

        int cnt=1, res=0;

        for(int i=1; i<n; i++){

            if(nums[i]==nums[i-1]) continue;

            if(nums[i]==nums[i-1]+1){
                cnt++;
            }else{
                cnt=1;
            }

            res = Math.max(res, cnt);
        }

        res= Math.max(res, cnt);

        return res;
    }
}