class Solution {
    public int[][] merge(int[][] intervals) {
        
      if (intervals.length <= 1) {
        return intervals;
      }
       
       //sort array according to its starting value:
      Arrays.sort(intervals, new Comparator<int[]>(){
        public int compare(int[] a, int[] b){
            return a[0]-b[0];
        }
      });

      int start=intervals[0][0];
      int end=intervals[0][1];

      List<int[]> res=new ArrayList<>();

      for(int i=0; i<intervals.length; i++){

         int currstart=intervals[i][0];
         int currend=intervals[i][1];

         if(currstart<=end){

            end=Math.max(end,currend);
         }else{

            res.add(new int[]{start,end});
            start=currstart;
            end=currend;
                     }
      }
      res.add(new int[]{start,end});

      return res.toArray(new int[res.size()][]);

    }
}