class Solution {

    List<List<Integer>> ans;

    public void solve(List<Integer> list,int[] nums,int i){

        //base 
        if(i==nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }

        list.add(nums[i]);
        solve(list, nums, i+1);

        //backtrack 
        list.remove(list.size()-1);

        //remove duplicate 
        while(i+1<nums.length && nums[i]==nums[i+1])
            i++;

        solve(list, nums, i+1);


    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);
        
        ans = new ArrayList<>();
        int n= nums.length;


        solve(new ArrayList<>(), nums,0);

        return ans;
        
    }
}