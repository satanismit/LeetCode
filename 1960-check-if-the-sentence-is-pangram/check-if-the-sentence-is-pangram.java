class Solution {
    public boolean checkIfPangram(String sentence) {
        
        char[] arr=new char[26];

        for(char c:sentence.toCharArray()){

            int i=c-97;
            arr[i]=c;
        }

        for(int i=0; i<26; i++){

            if(arr[i]==0){
                return false;
            }
        }
        return true;


    }
}