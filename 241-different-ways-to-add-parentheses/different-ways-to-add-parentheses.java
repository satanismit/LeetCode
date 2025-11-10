class Solution {

    public List<Integer> solve(String exp){

        List<Integer> res=new ArrayList<>();


        for(int i=0; i<exp.length(); i++){

            //split when operator appear
            if(exp.charAt(i)=='+' || exp.charAt(i)=='-' || exp.charAt(i)=='*'){

             
                List<Integer> left=solve(exp.substring(0,i));    //solve left part
                List<Integer> right=solve(exp.substring(i+1)); //solve right part

                //combine result and store it 
                for(int x:left){

                    for(int y:right){

                        if(exp.charAt(i)=='+'){
                            res.add(Integer.valueOf(x)+Integer.valueOf(y));
                        }
                        else if(exp.charAt(i)=='-'){
                            res.add(Integer.valueOf(x)-Integer.valueOf(y));
                        }
                        else{
                            res.add(Integer.valueOf(x)*Integer.valueOf(y));
                        }
                    }
                }
            }
        }
        if(res.isEmpty()){
            res.add(Integer.valueOf(exp));
        }
        return res;
    }


    public List<Integer> diffWaysToCompute(String exp) {
        
        return solve(exp);

    }
}