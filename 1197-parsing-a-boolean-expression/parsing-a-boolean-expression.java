class Solution {

    public boolean parseBoolExpr(String expression) {
        
        Stack<Character> st= new Stack<>();

        for(char c:expression.toCharArray()){

            if(c==',') continue;

            if(c!=')'){
                st.push(c);
            }else{

                boolean ht=false;
                boolean hf = false;

                while(st.peek()!='('){

                    char ch = st.pop();

                    if(ch=='f') hf=true;
                    if(ch=='t') ht=true;
                }

                st.pop(); //remove '('

                char op = st.pop();
                char result;

                if(op=='!'){
                    result = ht ? 'f' : 't';

                 }else if(op=='&'){
                    result = hf==true ?'f' : 't';
                }else{
                    result = ht==true?'t' : 'f';
                }

                st.push(result);

            }
        }

        return st.pop()=='t';
    }
}