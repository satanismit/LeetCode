class Solution {
    public int prefixConnected(String[] words, int k) {
        
        //we use hashmap < string , freq >
       
        Map<String, Integer> map = new HashMap<>();

        for(String word:words){

            if(word.length()<k){
                continue;
            }

            String sub = word.substring(0,k);
            
            map.put( sub , map.getOrDefault(sub,0)+1);
                    
        }

        int count = 0;
        
        for(Map.Entry<String, Integer> ele:map.entrySet()){

            if(ele.getValue()>=2){
                count++;
            }
        }

        return count;
    }
}