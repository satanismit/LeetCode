class RandomizedSet {

    Set<Integer> set;

    public RandomizedSet() {
        
        set=new HashSet<Integer>();
    }
    
    public boolean insert(int val) {

        if(set.contains(val)){
            return false;
        }

        set.add(val);
        return true;
            
    }
    
    public boolean remove(int val) {
        
        if(!set.contains(val)){
            return false;
        }
        set.remove(val);
        return true;
    }
    
    public int getRandom() {
        
        ArrayList<Integer> list = new ArrayList<>(set);
                Random random = new Random();
                int randomIndex = random.nextInt(list.size());
                int randomElement = list.get(randomIndex);
                
                return randomElement;
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */