class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        

        int m=waterStartTime.length;
        int n= landStartTime.length;
        int min=Integer.MAX_VALUE;

        
        for(int i=0;i<n; i++){


            int a = landStartTime[i];
            int b = landDuration[i];

            for(int j=0; j<m; j++){

                int c = waterStartTime[j];
                int d = waterDuration[j];

                //land --> water 
                int landfinish = a+b;
                int waterstart = Math.max(c,landfinish);
                int finish1= waterstart + d;

                //water --> land
                int waterfinish = c+d;
                int landstart= Math.max(a,waterfinish);
                int finish2= landstart +b;

                min= Math.min(min,Math.min(finish1, finish2));


            }

            
        }

        return min;
    }
}