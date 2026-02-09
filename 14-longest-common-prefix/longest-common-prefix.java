class Solution {

    public String combine(String s1, String s2){
     
        int n1=s1.length(), n2=s2.length();

        StringBuilder res = new StringBuilder();

        for(int i=0; i<n1 && i<n2; i++){
            
            if(s1.charAt(i)!=s2.charAt(i)){
                break;
            }
            res.append(s1.charAt(i));

        }
        return res.toString();

    }

    public String commonPrefix(String[] arr, int left, int right){

        //common string for single string is string itself 
        if(left==right) return arr[left];


        if(left<right){

            int mid = left+(right-left)/2;

            String part1 = commonPrefix(arr, left, mid);

            String part2 = commonPrefix(arr, mid+1, right);

            return  combine(part1, part2);
        }

        return "";

    }

    public String longestCommonPrefix(String[] strs) {

        return commonPrefix(strs, 0, strs.length-1);
    }
}