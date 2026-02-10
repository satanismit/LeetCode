class Solution {

    public int buttonWithLongestTime(int[][] events) {

        int n= events.length;

        int max = events[0][1];
        int ans =events[0][0];

        

        for(int i=0; i<n-1; i++){

            int duration = events[i+1][1]-events[i][1];

           if(max < duration || (duration==max && events[i+1][0]<ans)){
              max = duration;
              ans = events[i+1][0];
           }
        }

        return ans;
    }
}