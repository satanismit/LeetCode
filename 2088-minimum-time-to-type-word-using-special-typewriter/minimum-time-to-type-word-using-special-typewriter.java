class Solution {
    public int minTimeToType(String word) {

        char pointer = 'a';

        int time =0;

        for(char c:word.toCharArray()){

            //check clockwise 
            int diff = Math.abs(c-pointer);

            time += Math.min( diff, 26-diff);  //min from counterclockwise and clockwise 

            time++;
            pointer =c;
        
        }

        return time;
        
    }
}