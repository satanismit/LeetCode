class Solution {
    public int smallestNumber(int n) {
        
        String binary = Integer.toBinaryString(n); //convert into binary string

        int len = binary.length();

        return (int)Math.pow(2,len)-1;

    }
}