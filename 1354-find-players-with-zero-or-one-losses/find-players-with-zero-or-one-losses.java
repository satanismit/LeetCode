class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        // Use TreeMap to keep keys sorted
        Map<Integer, Integer> loseCount = new TreeMap<>();

        
        for (int[] m : matches) {
            int w = m[0], l = m[1];
            loseCount.putIfAbsent(w, 0);
            loseCount.put(l, loseCount.getOrDefault(l, 0) + 1);
        }

        List<Integer> noLoss = new ArrayList<>();
        List<Integer> oneLoss = new ArrayList<>();

        for (Map.Entry<Integer, Integer> e : loseCount.entrySet()) {
            int player = e.getKey();
            int cnt = e.getValue();
            if (cnt == 0) noLoss.add(player);
            else if (cnt == 1) oneLoss.add(player);
        }

        List<List<Integer>> res = new ArrayList<>();
        res.add(noLoss);
        res.add(oneLoss);
        return res;
    }
}
