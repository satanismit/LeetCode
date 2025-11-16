class Solution {
 
    public int largestRectangleArea(int[] arr) {

     int n=arr.length;
     Stack<Integer> st=new Stack<>(); 
     int[] pse = new int[n];
     int[] nse = new int[n];       
       
    //find previoud smallest element 
        for(int i=0; i<n; i++){

            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }

            pse[i] = st.isEmpty() ? -1:st.peek();

            st.push(i);
        }
     
        st.clear();

        //find next smaller element 
        for(int i=n-1; i>=0; i--){

            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }

            nse[i] = st.isEmpty() ? n:st.peek();

            st.push(i);
        }
     
     int max=0;
        //find max area 
        for(int i=0; i<n; i++){

            
            int width = (nse[i]-pse[i]-1);

            max = Math.max(max, arr[i]*(width));
        }

        return max;
    }
}