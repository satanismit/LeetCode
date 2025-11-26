class Solution {
    public int minBitFlips(int start, int goal) {
        
        int num = start ^goal;

        String binary = Integer.toBinaryString(num);

        int count =0;

        for(char c:binary.toCharArray()){

            if(c=='1'){
                count++;
            }
        }

        return count;
    }
}