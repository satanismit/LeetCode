class Solution {

    public static String sort(String p){

        char[] charArray = p.toCharArray();
            Arrays.sort(charArray);
         return  new String(charArray);

    }
    public List<Integer> findAnagrams(String s, String p) {
        
        int k=p.length();
        int n=s.length();
       
        List<Integer> list=new ArrayList<>();

        if(k>n) return list;

        p=sort(p);
         


        for(int j=0; j<=n-k; j++){

           String sub=s.substring(j,j+k);

           if(sort(sub).equals(p)){
            list.add(j);
           }




        }

        return list;
    }
}