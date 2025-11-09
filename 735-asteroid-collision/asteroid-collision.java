class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        int n=asteroids.length;

        List<Integer> st=new ArrayList<>();

        for(int ast:asteroids){

        if(ast>0)  st.add(ast);
        else{
             
             while(!st.isEmpty() &&  st.get(st.size()-1)>0 && st.get(st.size()-1)<Math.abs(ast)){
                st.remove(st.size()-1);
             }

             if(!st.isEmpty() && st.get(st.size()-1)==Math.abs(ast)){
                st.remove(st.size()-1);
             }
             else if(st.isEmpty() || st.get(st.size()-1)<0){
                st.add(ast);
             }

        }


        }
        int[] arr = st.stream().mapToInt(Integer::intValue).toArray();
        return arr;
    }
}