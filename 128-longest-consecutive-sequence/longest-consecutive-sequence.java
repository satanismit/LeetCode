class Solution {

    public int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for(int num:nums)  set.add(num);

        int res=0;

        for(int num:nums){

            //check if num is starting point or not
            if(set.contains(num) && !set.contains(num-1)){

                int cnt=0;
                int curr=num;

                while(set.contains(curr)){
                    set.remove(curr);
                    cnt++;
                    curr++;
                }

                res = Math.max(res, cnt);

            }
        }

        return res;
    }
}