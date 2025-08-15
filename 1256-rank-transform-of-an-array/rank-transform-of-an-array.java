class Solution {
    public int[] arrayRankTransform(int[] arr) {

        int n=arr.length;

        if (arr.length == 0) return new int[0];

        //clone and sort array 
        int[] sort= arr.clone();
        Arrays.sort(sort);

        // add unique no into map
        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;
        for (int num : sort) {
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank++);
            }
        }

        //replace with its rank 
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = rankMap.get(arr[i]);
        }

        return ans;
    }
}