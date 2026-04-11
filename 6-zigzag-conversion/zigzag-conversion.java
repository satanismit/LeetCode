class Solution {

    public String convert(String s, int numRows) {

        int n=s.length();

        List<List<Character>> list = new ArrayList<>();

        for(int i=0; i<numRows; i++){
            list.add(new ArrayList<>());
        }

        int i = 0;
        while(i<n){

            //top to bottom
            for(int j=0; i<n && j<numRows; j++){

                list.get(j).add(s.charAt(i));
                i++;
            }


            //bottom to top
            for(int k=numRows-2; i<n && k>0; k--){

                list.get(k).add(s.charAt(i));
                i++;
            } 

        }

        StringBuilder str = new StringBuilder();

        for(int r=0; r<numRows; r++){

            for(char c:list.get(r)){
                str.append(c);
            }
        }

        return str.toString();


        
    }
}