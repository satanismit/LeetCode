class Solution {

    public boolean isNStraightHand(int[] hand, int groupSize) {

        int n= hand.length;

        TreeMap<Integer, Integer> map = new TreeMap<>();

        for(int i : hand){
            map.put( i, map.getOrDefault(i, 0)+1);
        }

        while(!map.isEmpty()){

             int key = map.firstKey();

             for(int i=0; i<groupSize; i++){

                if(!map.containsKey(key+i)) return false;

                map.put(key+i, map.get(key+i)-1);

                if(map.get(key+i)==0)  map.remove(key+i);
             }

        }

        return true;



        
    }
}