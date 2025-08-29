class Solution {

    public void com_sum(int[] arr, int st,int target,List<Integer> ds,List<List<Integer>> ans ){    
        //base 
        if( arr.length==st){

            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        //pick element 
        if(arr[st]<=target){

            ds.add(arr[st]);
            com_sum(arr,st,target-arr[st],ds,ans);
            ds.remove(ds.size()-1);
        }

        //not pick element 
        com_sum(arr,st+1,target,ds,ans);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> ans = new ArrayList<>();

        com_sum(candidates,0, target,new ArrayList<>(), ans);
        
        return ans;
    }
}