class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        
        int n=nums.length;
        List<Integer> keys=new ArrayList<>();

        for(int i=0; i<n; i++) {
            if(nums[i]==key){
                keys.add(i);
            }
        }
        List<Integer> res=new ArrayList<>();
        for(int i=0; i<n; i++){

            for(int j=0; j<keys.size(); j++){

                if(Math.abs( i - keys.get(j)) <=k){
                    res.add(i);
                }
            }
        }
        Collections.sort(res);
        Set<Integer> r=new LinkedHashSet<>(res);
        return new ArrayList<>(r);

    }
}