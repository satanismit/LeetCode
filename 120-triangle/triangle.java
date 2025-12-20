class Solution {


    public int minimumTotal(List<List<Integer>> triangle) {

        int n=triangle.size();
        List<List<Integer>> dp = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                row.add(0);
            }
            dp.add(row);
        }

        //fill the base of dp triangle 
        for(int i=0; i<n; i++){

            dp.get(n-1).set(i,triangle.get(n-1).get(i));
        }

        //fill dp triangle 
        for(int i=n-2; i>=0; i--){

            for(int j=i; j>=0;j--){

                int up =  triangle.get(i).get(j)+dp.get(i+1).get(j);
                int up_left = triangle.get(i).get(j) + dp.get(i+1).get(j+1);

                dp.get(i).set(j,Math.min(up, up_left));
            }
        }

        return dp.get(0).get(0);
    }
}