class Solution {

    public int checkop(String str){

        switch(str){

            case "+":
            return 1;
            case "-":
            return 2;
            case "*":
            return 3;
            case "/":
            return 4;
             
        }
        return 0;

    }

    public int evalRPN(String[] tokens) {
        
        Stack<Integer> st=new Stack<>();

        int n=tokens.length;

        for(int i=0; i<n; i++){

            String str=tokens[i];

            if( str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")){

                    int n2=st.pop();
                    int n1=st.pop();
                    int check=checkop(str);
                    if(check==1){
                        st.push(n1+n2);
                    }
                    if(check==2){
                        st.push(n1-n2);
                    }
                    if(check==3){
                        st.push((int)n1*n2);
                    }
                    if(check==4){
                        st.push((int)n1/n2);
                    }

                    
            }else{
                    st.push(Integer.valueOf(str));
            }

        }

        return st.pop();

    }
}