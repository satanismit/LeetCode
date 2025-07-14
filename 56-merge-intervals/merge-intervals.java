class Solution {
    public int[][] merge(int[][] intervals) {
        
      if (intervals.length <= 1) {
        return intervals;
      }
        
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];  
            }
        });

        List<int[]> mergedList = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            int currStart = intervals[i][0];
            int currEnd = intervals[i][1];

            if (currStart <= end) {
                end = Math.max(end, currEnd);
            } else { 
                mergedList.add(new int[]{start, end});
                start = currStart;
                end = currEnd;
            }
        }

        mergedList.add(new int[]{start, end});

        return mergedList.toArray(new int[mergedList.size()][]);
    }
}