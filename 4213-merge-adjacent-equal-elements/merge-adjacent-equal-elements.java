class Solution {

    public List<Long> mergeAdjacent(int[] nums) {
    
        Stack<Long> st= new Stack<>();

        int n = nums.length;

        for(int i=0; i<n; i++){

            long curr = nums[i];

            while(!st.isEmpty() && st.peek()==curr){
                curr = st.pop() +curr;
            }
            st.push(curr);

        }
        
        return new ArrayList<>(st);


    }
}