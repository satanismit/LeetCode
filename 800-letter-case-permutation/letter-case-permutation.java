class Solution {

    public void backtrack(String s,int n,int st,StringBuilder str, List<String> ans){

        
        //base 
        if(st==n){

            ans.add(str.toString());
            return;
        }
        
            char ch=s.charAt(st);

            if(Character.isLetter(ch)){

                str.append(Character.toUpperCase(ch));
                backtrack(s,n,st+1,str,ans);
                str.deleteCharAt(str.length()-1);

                str.append(Character.toLowerCase(ch));
                backtrack(s,n,st+1,str,ans);
                str.deleteCharAt(str.length()-1);

            }else{
                      
                      str.append(ch);
                      backtrack(s,n,st+1,str,ans);
                      str.deleteCharAt(str.length()-1);
            }

        }

    
    public List<String> letterCasePermutation(String s) {
        
        List<String> ans=new ArrayList<>();


        backtrack(s,s.length(),0,new StringBuilder(), ans);
        return ans;
    }
}