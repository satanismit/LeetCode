class Solution {

    public void swap(int[] nums, int a, int b){

        int temp= nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public void solve(int[] nums, List<List<Integer>> ans,List<Integer> list, int ind){

        if(list.size()==nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i=ind; i<nums.length; i++){

            swap(nums, i, ind);
            list.add(nums[ind]);

            solve(nums, ans, list, ind+1);
            
            list.remove(list.size()-1);
            swap(nums, i, ind);
           
        }

    }

    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> ans =new ArrayList<>();

        solve(nums,ans, new ArrayList<>(), 0);

        return ans;

    }
}