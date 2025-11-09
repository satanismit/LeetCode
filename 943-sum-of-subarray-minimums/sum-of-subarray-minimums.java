class Solution {

    //finding next smaller elements indexes for every index in arr
    public int[] findNSE(int[] arr){

        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        int[] nse=new int[n];

        for(int i=n-1; i>=0; i--){

            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){

                st.pop();
            }

            nse[i] = st.isEmpty() ? n:st.peek();

            st.push(i);
        }
        return nse;
    }

   //finding previous smaller and equal elements indexes for every index in arr
    public int[] findPSEE(int[] arr){

        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        int[] psee=new int[n];

        for(int i=0; i<n; i++){

            while(!st.isEmpty() && arr[st.peek()] > arr[i]){

                st.pop();
            }

            psee[i] = st.isEmpty() ? -1:st.peek();

            st.push(i);
        }
        return psee;
    

    }
    public int sumSubarrayMins(int[] arr) {
        
        int n=arr.length;

        int[] nse=findNSE(arr);
        int[] psee=findPSEE(arr);
        long total =0, mod=(long)(1e9+7);

        for(int i=0; i<n; i++){

            int left = i- psee[i];
            int right = nse[i] - i;

            total =(total+ ((long)arr[i]*left*right)%mod) % mod;

        }
        return (int)total;
    }
}