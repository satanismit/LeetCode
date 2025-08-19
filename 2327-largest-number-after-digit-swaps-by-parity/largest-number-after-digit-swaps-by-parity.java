class Solution {
    public int largestInteger(int num) {

        String str=String.valueOf(num);

        //define maxheap
        Queue<Integer> odd=new PriorityQueue<>(Collections.reverseOrder());
        Queue<Integer> even=new PriorityQueue<>(Collections.reverseOrder());

        //add value to heap
        for(char c:str.toCharArray()){

            if((c-'0')%2==0){
                even.add(c-'0');
            }else{
                odd.add(c-'0');
            }
        }

        StringBuilder ans=new StringBuilder();
        //create ans
        for(char c:str.toCharArray()){

            if((c-'0')%2==0){
               ans.append(even.poll());
            }else{
                ans.append(odd.poll());
            }
        }

        String s=ans.toString();

        return Integer.parseInt(s);



    }
}