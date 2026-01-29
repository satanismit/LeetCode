class Solution {


    public List<Integer> findLonely(int[] nums) {

    int n = nums.length;

       Set<Integer> set= new HashSet<>();

       for(int i :nums)  set.add(i);

       List<Integer> res = new ArrayList<>();

       for(int i=0; i<n; i++){

        if(set.contains(nums[i]+1) || set.contains(nums[i]-1)){

        }else{
                res.add(nums[i]);
            
        }
       }

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<res.size(); i++){

            map.put( res.get(i), map.getOrDefault(res.get(i),0)+1);

        }

        List<Integer> ans= new ArrayList<>();

        for(Map.Entry<Integer, Integer> ele:map.entrySet()){

            if(ele.getValue()==1){
                ans.add(ele.getKey());
            }
        }
        
        return ans;
        
    }
}