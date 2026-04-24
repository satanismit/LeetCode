class Solution {

    public int furthestDistanceFromOrigin(String moves) {

        int n=moves.length();

        int[] count = new int[3];

        for(char c:moves.toCharArray()){

            if(c=='L') count[0]++;
            else if(c=='_') count[1]++;
            else count[2]++;
        }

        int left = count[0];
        int right=count[2];
        int space = count[1];

        if(left==right){
            return space;
        }

        if(left<right) return right-left+space;

        return left-right+space;

        
    }
}