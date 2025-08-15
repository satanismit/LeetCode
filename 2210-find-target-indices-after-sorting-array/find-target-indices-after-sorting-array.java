class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {

       List<Integer> list=new ArrayList<>();

       int smallcnt=0,targetcnt=0;

       for(int i=0; i<nums.length; i++){

         if(nums[i]<target){
                smallcnt++;
         }
         if(nums[i]==target){

              targetcnt++;
         }
       }

       for(int i=0; i<targetcnt; i++){

                list.add(smallcnt++);

       }


       return list;



       



    }
}