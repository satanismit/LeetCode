class Solution {

    public int binaryGap(int n) {

        String binary = Integer.toBinaryString(n);
        int ans = 0;
        int size= binary.length();

        int first =-1;

        for(int i=0; i<size; i++){

            char c = binary.charAt(i);

            if(c=='1'){

                if(first!=-1){
                    ans= Math.max(ans, i-first);
                }

                first = i;
            }
            
        }        

        return ans;



    }
}