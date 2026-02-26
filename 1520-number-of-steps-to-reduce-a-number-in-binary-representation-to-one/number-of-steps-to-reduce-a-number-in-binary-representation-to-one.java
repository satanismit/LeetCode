class Solution {
    public int numSteps(String s) {

        int steps =0;
        int carry=0;

       for (int i = s.length() - 1; i > 0; i--) {

        int sum = (s.charAt(i) - '0') + carry;

            if (sum == 1) { // ODD

                steps += 2; // +1 to make it even, +1 to divide
                carry = 1;

            } else { 
                steps += 1; // Just divide
                
            }
        }

        return steps+carry;
    }
}