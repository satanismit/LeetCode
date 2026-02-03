class Solution {

    public int[] getNGE(int[] arr){

        int n= arr.length;
        Stack<Integer> st= new Stack<>();

        int[] nge = new int[n];

        for(int i=n-1; i>=0; i--){

            while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
                st.pop();
            }

            if(st.isEmpty())  nge[i] = i; //if no greater ele --then keep it i 
            else{
                nge[i]=st.peek();
            } 

            st.push(i);
        }

        return nge;
    }

    public int[] dailyTemperatures(int[] temperatures) {

        int n= temperatures.length;

        int[] nge = getNGE(temperatures);

        int[] ans =new int[n];

        for(int i=0; i<n; i++){

            ans[i]=nge[i]-i;
        }

        return ans;

        
    }
}