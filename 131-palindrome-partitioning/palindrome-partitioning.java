class Solution {

    public boolean ispalindrome(String s, int st, int end){

        while(st<end){

            if(s.charAt(st)!=s.charAt(end))  return false;

            st++;
            end--;
        }

        return true;
    }

    List<List<String>> ans = new ArrayList<>();


   public void backtrack(String s, int st, List<String> path){

        //base case 
        if(s.length()==st){
            ans.add(new ArrayList<>(path));
            return;
        }
      
      for(int end = st+1; end<=s.length(); end++){

         if(ispalindrome(s, st, end-1)){

            path.add(s.substring(st, end));

            backtrack(s, end, path);

            path.remove(path.size()-1);
         }
      }

   }

    public List<List<String>> partition(String s) {


        backtrack(s, 0, new ArrayList<>());

        return ans;       
        
    }
}