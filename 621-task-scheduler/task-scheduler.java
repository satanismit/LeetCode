class Solution {

    public int leastInterval(char[] tasks, int n) {


    Map<Character, Integer> map = new HashMap<>();

    for(char c:tasks){

        map.put(c, map.getOrDefault(c, 0)+1);
    }

    //use priority queue
    PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
        (a,b) -> a.getValue() != b.getValue() ? b.getValue()-a.getValue() : b.getKey()-a.getKey()
    );

    pq.addAll(map.entrySet());

    int count = 0;

    while(!pq.isEmpty()){

        int k= n+1;

        List<Map.Entry> temp = new ArrayList<>();

        while(k>0 && !pq.isEmpty()){

            Map.Entry<Character, Integer> ele = pq.poll();
            temp.add(ele);
            ele.setValue(ele.getValue()-1);
            count++;
            k--;
        }

        //we need to add character again that are having fre > 0
        for(Map.Entry<Character, Integer> e:temp){
            if(e.getValue()>0)  pq.add(e);
        }

        if (pq.isEmpty()) break;
        count = count +k;

    }

    return count;



  }
}