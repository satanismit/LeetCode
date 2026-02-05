class Twitter {

    Map<Integer, Set<Integer>>  followed;
    LinkedList<int[]> tw ;

    int ts =0;

    public Twitter() {
            tw = new LinkedList<>();
            followed= new HashMap<>();
    }
    
    public void postTweet(int userId, int tweetId) {
        

        tw.addFirst(new int[]{userId, tweetId, ts++});

        //if userId not exist then we need to add 
        if(!followed.containsKey(userId)){

            followed.put(userId, new HashSet<>());
            followed.get(userId).add(userId);

        }
    }
    
    public List<Integer> getNewsFeed(int userId) {

        List<Integer> res = new ArrayList<>();
        //check if user exist in map if not then it have no post yet 
        if (!followed.containsKey(userId)) return res;

        Set<Integer> followees = followed.get(userId);

        for(int[] tweet: tw){

            if(followees.contains(tweet[0])){
                
                res.add(tweet[1]);

                if(res.size()==10) break;
            }
        }

        return res;
         
         
    }
    
    public void follow(int followerId, int followeeId) {

            if(!followed.containsKey(followerId)){

                followed.put(followerId, new HashSet<>());
                followed.get(followerId).add(followerId);
            }

            followed.get(followerId).add(followeeId);
    }
    
    public void unfollow(int followerId, int followeeId) {
        
        if(followed.containsKey(followerId) && followerId != followeeId){

            followed.get(followerId).remove(followeeId);
        }
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */