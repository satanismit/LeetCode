class Solution {
    public int countBinarySubstrings(String s) {

      int n= s.length();

      List<Integer> group = new ArrayList<>();
      int count = 1;

      for(int i=1; i<n; i++){

        if(s.charAt(i)==s.charAt(i-1)){
            count++;
        }else{

            group.add(count);
            count=1;
        }
      }
      //add last count 
      group.add(count);

        int ans =0;
      for(int i=1; i<group.size(); i++){

            ans += Math.min(group.get(i), group.get(i-1));
      }

      return ans;
    }
}