class Solution {

    public int[] singleNumber(int[] nums) {

        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0; i<n; i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        int[] res =new int[2];
        int i=0;
        
        for(Map.Entry<Integer,Integer> ele:map.entrySet()){

            if(ele.getValue()==1){
                res[i++]=ele.getKey();
            }
        }

        return res;

    }
}