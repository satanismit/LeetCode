class Solution {
    public String intToRoman(int num) {
        
        StringBuilder str=new StringBuilder();
        int[] val=new int[]{
            1000,900,500,400,100,90,50,40,10,9,5,4,1
        };

        String[] sym=new String[]{
            "M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"
        };


        for(int i=0 ;i<13; i++){

            int times=num/val[i];

            while(times-->0){

                str.append(sym[i]);
            }

            num%=val[i];
        }

        return str.toString();


    }
}