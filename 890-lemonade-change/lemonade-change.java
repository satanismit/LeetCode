class Solution {
    public boolean lemonadeChange(int[] bills) {
        

        int n=bills.length;

        int five_dollar=0,ten_dollar=0;

        for(int i=0; i<n; i++){

            if(bills[i]==5){
                five_dollar++;
            }
            else if(bills[i]==10){

                if(five_dollar>0){
                    five_dollar--;
                    ten_dollar++;
                }else{
                    return false;
                }
            }
            else{
                 
                 if(five_dollar>0 && ten_dollar>0){

                    five_dollar--;
                    ten_dollar--;

                 }else if(five_dollar>2){
                    five_dollar-=3;
                 }
                 else {
                    return false;
                 }
            }
        }

        return true;
    }
}