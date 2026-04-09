class Solution {

    public void solve(List<List<Integer>> ans,int[] nums , int ind, List<Integer> ds){

      ans.add(new ArrayList<>(ds));
      
      for(int i=ind; i<nums.length; i++){
        
        if(i!=ind && nums[i]==nums[i-1]) continue;
        
          ds.add(nums[i]);
          solve(ans, nums, i+1, ds);
          ds.remove(ds.size()-1);
      }


    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        int n= nums.length;

        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();

        solve(ans,nums, 0, new ArrayList<>());

        return ans;
    }
}