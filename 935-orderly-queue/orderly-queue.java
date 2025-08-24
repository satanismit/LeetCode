class Solution {
    public String orderlyQueue(String s, int k) {
        
        int n=s.length();

            if(k<=1){

                String smallest=s;
                for(int i=0; i<n; i++){

                    String rotate=s.substring(i)+s.substring(0,i);
                    if(rotate.compareTo(smallest)<0){
                        smallest=rotate;
                    }
                }
                return smallest;

            }
            // for k>1 string we simply sort array 
            else{

            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            return new String(arr);
            }
        
    }
}