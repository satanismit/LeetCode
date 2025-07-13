class Solution {
    public int maxCoins(int[] piles) {
        
        Arrays.sort(piles);
        int i=0,j=piles.length;
        int sum=0;

        while(i<j){

            int[] tri=new int[3];
            tri[0]=piles[i];
            tri[1]=piles[j-2];
            tri[2]=piles[j-1];
            j=j-2;
            i++;

            sum+=tri[1];


        }

        return sum;
    }
}