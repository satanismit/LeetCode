class Solution {

    public void backtrack(int open,int close,StringBuilder str,List<String> ans,int n){

        //base case 
        if(str.toString().length()==2*n){
            ans.add(str.toString());
            return;
        }

        if( open<n ){
            str.append("(");
            backtrack(open+1,close,str,ans,n);
            str.deleteCharAt(str.length()-1);
        }
        if( close<open ){

            str.append(")");
            backtrack(open,close+1,str,ans,n);
            str.deleteCharAt(str.length()-1);
        }


    }

    public List<String> generateParenthesis(int n) {

        StringBuilder str=new StringBuilder();
        List<String> ans=new ArrayList<>();
        
        int open = 0;
        int close= 0;

        backtrack(open,close,str,ans,n);

        return ans;

    }
}