class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        // Stack<Integer> st=new Stack<>();

        int n1=nums1.length, n2=nums2.length;
        
       
        int[] res=new int[n1];
        boolean flag=true;
        int temp=-1;
        for(int i=0; i<n1; i++){
            temp=-1;
            flag=true;
            for(int j=0; j<n2; j++){

                if(nums1[i]==nums2[j]){
                    flag=false;
                }
                if(nums1[i]<nums2[j] && !flag){
                    temp=nums2[j];
                    break;
                }
            }
            res[i]=temp;
        }
        return res;
    }
}