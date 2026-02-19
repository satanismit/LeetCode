class Solution {

    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {

        boolean[] bulb = new boolean[101];

        for(int i:bulbs){

            if(!bulb[i]){
                bulb[i]=true;
            }else{
                bulb[i]=false;
            }
        }

        List<Integer> res= new ArrayList<>();

        for(int i=1; i<101; i++){

            if(bulb[i]==true) res.add(i);
        }

        return res;
        
    }
}