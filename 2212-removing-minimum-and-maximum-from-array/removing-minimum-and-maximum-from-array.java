class Solution {

    public int minimumDeletions(int[] nums) {
        
        int n= nums.length;

        int max=Integer.MIN_VALUE;
        int maxind=0;
        for(int i=0; i<n; i++) {
            
            if(max<nums[i]){
                max = nums[i];
                maxind= i;
            }
        }

        int min = Integer.MAX_VALUE;
        int minind=0;
        for(int i=0; i<n; i++)  {

            if(min>nums[i]){
                min = nums[i];
                minind =i;
            }
        }

        int a = Math.min(minind, maxind);
        int b = Math.max(minind, maxind);

        //take out min of all three option 
        int option1 = b+1;
        int option2 = n-a;
        int option3 = a+1 + (n-b);

        
        return Math.min( option1, Math.min(option2, option3));

    }
}