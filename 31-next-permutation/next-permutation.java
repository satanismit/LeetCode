class Solution {

    public void swap(int i, int j, int[] arr){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public void reverse(int[] arr, int left, int right){

        while(left<right){

            swap(left, right, arr);
            left++; right--;
        }

        
    }
    
    public void nextPermutation(int[] nums) {

        int n=nums.length;

        int pivot = -1;

        //check for already largest or not 
        for(int i=n-2; i>=0; i--){

            if(nums[i] < nums[i+1]){
                pivot = i;
                break;
            }
        }

        if(pivot == -1)  {
            reverse(nums,0,n-1);
            return;
        }

        //find the smallest large element than pivot and swap 
        for (int i = n - 1; i > pivot; i--) {

            if (nums[i] > nums[pivot]) {

                swap( i, pivot, nums);
                break;
            }
        }

        reverse(nums, pivot+1, n-1);


    }
}