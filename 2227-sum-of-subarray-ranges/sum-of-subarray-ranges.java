class Solution {

    //find PSE index
    public int[] findPSE(int[] nums){

        int n=nums.length;
        int[] pse=new int[n];
        Arrays.fill(pse, -1);

        Stack<Integer> st=new Stack<>();

        for(int i=0;i<n; i++){

            while(!st.isEmpty() && nums[st.peek()] >nums[i]){
                st.pop();
            }

            if(!st.isEmpty()){
                pse[i]=st.peek();
            }

            st.push(i);
        }

        return pse;
    }

    //find NSE index 
    public int[] findNSE(int[] nums){

        int n=nums.length;
        int[] nse =new int[n];
        Arrays.fill(nse, n);
        Stack<Integer> st=new Stack<>();

        for(int i=n-1; i>=0; i--){

            while(!st.isEmpty() && nums[st.peek()]>=nums[i]){
                st.pop();
            }

            if(!st.isEmpty()){
                nse[i]=st.peek();
            }

            st.push(i);
        }
        return nse;
    }


    //find PGE index
    public int[] findPGE(int[] nums){

         int n=nums.length;
        int[] pge=new int[n];
        Arrays.fill(pge, -1);

        Stack<Integer> st=new Stack<>();

        for(int i=0;i<n; i++){

            while(!st.isEmpty() && nums[st.peek()] <nums[i]){
                st.pop();
            }

            if(!st.isEmpty()){
                pge[i]=st.peek();
            }

            st.push(i);
        }

        return pge;
    }

    //find NGE index
    public int[] findNGE(int[] nums){

        int n=nums.length;
        int[] nge =new int[n];
        Arrays.fill(nge, n);
        Stack<Integer> st=new Stack<>();

        for(int i=n-1; i>=0; i--){

            while(!st.isEmpty() && nums[st.peek()]<=nums[i]){
                st.pop();
            }

            if(!st.isEmpty()){
                nge[i]=st.peek();
            }

            st.push(i);
        }
        return nge;
    }

    public long subarraymin(int[] nums){

        int n=nums.length;
        int[] pse = findPSE(nums);
        int[] nse= findNSE(nums);

        long total =0;

        for(int i=0; i<n; i++){

            int left =i-pse[i];
            int right = nse[i]-i;

            total += left*right*(long)nums[i];

        }
        return total;

    }

    public long subarraymax(int[] nums){

        int n=nums.length;
        int[] pge = findPGE(nums);
        int[] nge= findNGE(nums);

        long total =0;

        for(int i=0; i<n; i++){

            int left =i-pge[i];
            int right = nge[i]-i;

            total += left*right*(long)nums[i];

        }
        return total;

    }



    public long subArrayRanges(int[] nums) {
     
     return subarraymax(nums)-subarraymin(nums);
    }
}