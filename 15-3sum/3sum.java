class Solution {

    public List<List<Integer>> threeSum(int[] arr) {

        List<List<Integer>> ans =new ArrayList<>();
        int n = arr.length;
        Arrays.sort(arr);

    
        int target = 0;
        
        // Fix the first element as arr[i]
        for (int i = 0; i < n - 2; i++) {

            if (i > 0 && arr[i] == arr[i - 1]) continue;

            // Initialize left and right pointers with 
            // start and end of remaining subarray
            int l = i + 1, r = n - 1;
            
            int requiredSum = target - arr[i];
            while (l < r) {

                if (arr[l] + arr[r] == requiredSum){
                    ans.add(Arrays.asList(arr[i],arr[l],arr[r]));
                    
                    while (l < r && arr[l] == arr[l + 1]) l++;

                    // Skip duplicates for r
                    while (l < r && arr[r] == arr[r - 1]) r--;

                    l++;
                    r--;
                }

                else if (arr[l] + arr[r] < requiredSum)
                    l++;
                else if (arr[l] + arr[r] > requiredSum)
                    r--;
            }
        }

        

        return ans;
        
    }
}