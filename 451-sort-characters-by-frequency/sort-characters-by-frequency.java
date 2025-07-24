class Solution {
    public String frequencySort(String s) {
        
        PriorityQueue<Map.Entry<Character, Integer>> q=new PriorityQueue<>(
            (a,b)-> b.getValue() -a.getValue()  );


        Map<Character, Integer> m=new HashMap<>();

        for(char c:s.toCharArray()){

            m.put(c, m.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character, Integer> ele: m.entrySet()){

            q.add(ele);

        }
        StringBuilder str=new StringBuilder();

        while(!q.isEmpty()){

            Map.Entry<Character,Integer> ele=q.poll();

            int n=ele.getValue();
            while(n-->0){
                str.append(ele.getKey());
            }

        }

        return str.toString();

 

    }
}