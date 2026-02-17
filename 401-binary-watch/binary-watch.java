class Solution {

    public int countSetbit(int num){
        
        int count = 0;
        while(num>0){

            count += num & 1; //check if LSB is set or not 
            num >>= 1;  //shift one bit to right 

        }

        return count;
    }
    public List<String> readBinaryWatch(int turnedOn) {

        List<String> ans = new ArrayList<>();

        for(int h=0; h<=11; h++){

            for(int m=0; m<=59; m++){

                //count set bit 
                int hour = countSetbit(h);
                int min = countSetbit(m);

                if(hour+min == turnedOn){
                    
                    String str = String.valueOf(h);
                    str += ":";

                    if(m<10){
                        str += "0";
                    }
                    str += String.valueOf(m);

                    ans.add(str);
                }

            }
        }

        return ans;
        
    }
}