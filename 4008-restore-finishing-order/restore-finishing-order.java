class Solution {

    public int[] recoverOrder(int[] order, int[] friends) {
        
        Set<Integer> set=new HashSet<>();

        for(int i :friends){

            set.add(i);
        }

        List<Integer> list=new ArrayList<>();

        for(int i=0; i<order.length; i++){

            if(set.contains(order[i])){
                    list.add(order[i]);
            }
        }

        int[] ans=list.stream().mapToInt(Integer::intValue).toArray();

        return ans;


    }
}