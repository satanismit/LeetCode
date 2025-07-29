class Solution {
    public List<Integer> lexicalOrder(int n) {
        
        List<Integer> res=new ArrayList<>();

       for(int i=1; i<=9; i++){

        solve(i, n, res);
       }
       return res;
    }

    public static void solve(int num,int n,List<Integer> res){

        //base condition 
        if(num>n){
            return;
        }

        res.add(num);

        // DFS
        for(int i=0; i<=9; i++){

            int newnum=(num*10) + i;

            if(newnum>n) {return;}
            else 

            solve(newnum, n, res);
        }
    }
}