class Solution {

    class Pair{

        String s;
        int level;

        Pair(String s, int level){
            this.s=s;
            this.level=level;
        }
    }

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        //we go level wise 
        int n= beginWord.length();

        Set<String> set = new HashSet<>();

        for(String word:wordList)  set.add(word);

        Queue<Pair>  q = new LinkedList<>();

        q.offer(new Pair(beginWord, 1));


        while(!q.isEmpty()){

            Pair word = q.poll();
            int level = word.level;

            if(endWord.equals(word.s))  return level;

            for(int i=0; i<n; i++){

                StringBuilder str = new StringBuilder(word.s);

                for(char c='a'; c<='z'; c++){

                        str.setCharAt(i, c);

                     
                     if(set.contains(str.toString())){

                        set.remove(str.toString());
                        q.offer(new Pair(str.toString(),level+1));
                     }
                }

            }

        }

        return 0;
        
    }
}