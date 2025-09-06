class Solution {
    public int maxDepth(String s) {
        
        Stack<Character> st=new Stack<>();

        int n=s.length();
        int cur=0,max=0;

        for(int i=0; i<n; i++){

            if(s.charAt(i)=='('){
                cur++;
                st.add('(');
            }
            else if(s.charAt(i)==')'){
                cur--;
                st.pop();
                
                
            }

            max=Math.max(cur,max);
        }

        return max;
    }
}