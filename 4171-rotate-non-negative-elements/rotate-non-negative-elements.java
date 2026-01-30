class Solution {


    public int[] rotateElements(int[] nums, int k) {

        int n= nums.length;

        if(n==1 || n==0) return nums;
        List<Integer> values = new ArrayList<>();
        List<Integer> indices= new ArrayList<>();


        for(int i=0; i<n; i++){

            if(nums[i]>=0)  {
                values.add(nums[i]);
                indices.add(i);
            }
        }


        if(values.size()==0)  return nums;

        k %= values.size();

        //rotate to left 
        Collections.rotate(values, -k);

        int ind=0;
        for(int i=0; i<values.size(); i++){

            nums[indices.get(i)]=values.get(i);
        }

        return nums;
        
    }
}