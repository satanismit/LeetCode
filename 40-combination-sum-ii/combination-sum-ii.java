class Solution {

    public void com_sum(int[] arr, int st,int target,List<Integer> ds,List<List<Integer>> ans ){    
        //base 
            if(target==0){  //get possible combination 
                ans.add(new ArrayList<>(ds));
            return;
            }
        

        for(int i=st; i<arr.length; i++){

            if( i>st && arr[i]==arr[i-1]){
                continue;
            }

            if(arr[i]>target){
                break;
            }
            

            ds.add(arr[i]);
            com_sum(arr,i+1,target-arr[i],ds,ans);
            ds.remove(ds.size()-1);

        }

    }

    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        

        List<List<Integer>> ans=new ArrayList<>();

        Arrays.sort(candidates);

        com_sum(candidates,0, target,new ArrayList<>(),ans);

        return ans;
    }
}