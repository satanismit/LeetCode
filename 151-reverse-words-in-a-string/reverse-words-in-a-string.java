class Solution {
    public String reverseWords(String s) {
        
        String[] arr=s.strip().split("\\s+");

        StringBuilder ans=new StringBuilder();
        int n= arr.length;

        for(int i=n-1; i>=0; i--){
            
            if(i!=0){

                ans.append(arr[i]);
                ans.append(" ");
            }else{
                ans.append(arr[i]);
            }
            
        }

        return ans.toString();
    }
}