class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int n1= nums1.length;
        int n2= nums2.length;

        int[] arr=new int[n1+n2];

        int i=0, j=0;
        int ind=0;

        while(i<n1 && j<n2){

            if(nums1[i]>nums2[j]){
                arr[ind++]=nums2[j++];
            }else{
                arr[ind++]=nums1[i++];
            }
        }

        while(i<n1){
            arr[ind++]=nums1[i++];
        }

        while(j<n2){
            arr[ind++]=nums2[j++];
        }

        int len = arr.length;

        if(len%2==0){
            
            double ans =( arr[len/2] + arr[(len/2)-1] ) /2.0;
            return ans;
        }

        return arr[len/2];
    }
}