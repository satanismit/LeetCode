class Solution {

    //boyre moore's voting algorithm - TC: O(n) , sc: O(n)
    
    public List<Integer> majorityElement(int[] nums) {

        int n=nums.length;

        int cand1 =0, cand2=0;
        int c1 =0, c2=0;

        for(int num:nums){

            if(num==cand1){

                c1++;
            }else if( num==cand2){

                c2++;
            }else if( c1==0){
                cand1= num;
                c1++;
            }else if (c2==0){
                cand2=num;
                c2++;
            }else{
                c1--;
                c2--;
            }

        }

        c1=0;
        c2=0;

        //verify and add 
        List<Integer> res = new ArrayList<>();

        for(int i=0; i<n; i++){

            if(nums[i]==cand1) c1++;
            else if(nums[i]==cand2) c2++;
        }

        if( c1 > n/3) res.add(cand1);
        if(c2> n/3) res.add(cand2);

        return res;
        
    }
}