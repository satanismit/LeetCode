class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {

        int n= nums.length;

        if(n%k!=0)  return false;

        TreeMap<Integer, Integer> map = new TreeMap<>();

        for(int num:nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        while(!map.isEmpty()){

            int ele = map.firstKey();  //fetch the smallest key 

            for(int i=0; i<k; i++){

                if(!map.containsKey(ele+i)) return false;

                map.put(ele+i, map.get(ele+i)-1);

                if(map.get(ele+i)==0)  map.remove(ele+i);
            }
        }
        return true;
    }
}