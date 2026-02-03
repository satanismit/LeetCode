class Solution {

    public int[] getPSE(int[] arr){

        Stack<Integer> st = new Stack<>();
        int n= arr.length;

        int[] pse = new int[n];

        for(int i=0; i<n; i++){

            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }

            if(st.isEmpty())   pse[i]=-1;
            else   pse[i]=st.peek();

            st.push(i);
        }

        return pse;
    }

    public int[] getNSE(int[] arr){

        Stack<Integer> st = new Stack<>();
        int n= arr.length;

        int[] nse = new int[n];

        for(int i=n-1; i>=0; i--){

            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }

            if(st.isEmpty())   nse[i]=n;
            else   nse[i]=st.peek();

            st.push(i);
        }

        return nse;
    }

    public int maxRec(int[] heights){

        int n= heights.length;
        int maxarea = 0;

        int[] nse = getNSE(heights);
        int[] pse = getPSE(heights);

        for(int i=0; i<n; i++){

            int width = nse[i]-pse[i]-1;

            maxarea = Math.max( maxarea, heights[i]*width);
        }

        return maxarea;
    }

    public int maximalRectangle(char[][] matrix) {

        int n= matrix.length;
        int m= matrix[0].length;

        int[] heights = new int[m];

        int maxOfAll = 0;

        for(int i=0; i<n; i++){

            for(int j=0; j<m; j++){

                if(matrix[i][j]=='1'){

                    heights[j]++;
                }else{
                    heights[j]=0;
                }
            }

            // after we have height array for every rows and then we found larget rectangle
            maxOfAll = Math.max(maxOfAll, maxRec(heights));
        }

        return maxOfAll;
        
    }
}