class Solution {

    public int findKthPositive(int[] arr, int k) {
        
         int low = 0, high = arr.length;

        while (low < high) {

            int mid = low + (high - low) / 2;
            
            int missing = arr[mid] - (mid + 1);

            if (missing < k) {
                low = mid + 1; // move right
            } else {
                high = mid; // move left
            }
        }

        return low + k;
    }
}