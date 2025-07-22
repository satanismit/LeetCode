class Solution 
{
    public String countAndSay(int n) {

        //Base conditions 
        if(n==1) return "1"; // return point of recursion 
        
        
            StringBuilder ans=new StringBuilder();

            String prev=countAndSay(n-1);
            int count=1;

            for(int i=1;i<prev.length(); i++){

               if(prev.charAt(i)==prev.charAt(i-1)){
                count++;
               }
               else{
                ans.append(count).append(prev.charAt(i-1));
                count=1;
               }
            }

            //This is for appending the alst char and its frequency 
            ans.append(count).append(prev.charAt(prev.length()-1));

            return ans.toString();

        
    }

}

