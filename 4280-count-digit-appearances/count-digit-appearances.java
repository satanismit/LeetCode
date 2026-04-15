class Solution {

    public int count(int num, int digit){

        int ans =0;

        while(num>0){

            int d = num%10;

            num /=10;

            if(d==digit)  ans++;
        }

        return ans;
    }

    public int countDigitOccurrences(int[] nums, int digit) {

        int n= nums.length;

        int ans =0;

        for(int num:nums){

                ans += count(num, digit);
        }
        return ans;
        
    }
}