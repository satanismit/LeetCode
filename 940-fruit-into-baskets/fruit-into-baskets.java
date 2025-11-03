class Solution {
    public int totalFruit(int[] fruits) {
        
        int n=fruits.length;

        Map<Integer,Integer> map=new HashMap<>();
        int count=0;
        int right=0,left=0;

        while(right<n){

            map.put(fruits[right], map.getOrDefault(fruits[right],0)+1);

            if(map.size()>2){

                map.put(fruits[left], map.get(fruits[left])-1);

                if(map.get(fruits[left])==0){
                    map.remove(fruits[left]);
                }
                left++;
            }
            count = Math.max(count, right-left+1);
            right++;

        }
        return count;

    }
}