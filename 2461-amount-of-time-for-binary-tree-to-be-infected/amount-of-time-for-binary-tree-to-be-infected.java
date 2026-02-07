/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    Map<Integer, List<Integer>> adj = new HashMap<>();

    private void convertGraph(TreeNode node){

        if(node==null){
            return;
        }

        if(node.left!=null){

        adj.computeIfAbsent(node.val,  k-> new ArrayList<>()).add(node.left.val);
        adj.computeIfAbsent(node.left.val, k-> new ArrayList<>()).add(node.val);

        }

        if(node.right!=null){

        adj.computeIfAbsent(node.val,  k-> new ArrayList<>()).add(node.right.val);
        adj.computeIfAbsent(node.right.val, k-> new ArrayList<>()).add(node.val);

        }

        convertGraph(node.left);
        convertGraph(node.right);

    }

    public int amountOfTime(TreeNode root, int start) {

        convertGraph(root);

        Queue<Integer> q= new LinkedList<>();
        Set<Integer> set = new HashSet<>();

        q.offer(start);
        int time = -1;

        while(!q.isEmpty()){

            time++;
            int size = q.size();

            for(int i=0; i<size; i++){

                int node = q.poll();
                set.add(node);

                if(adj.containsKey(node)){

                    for(int it:adj.get(node)){
                        if(!set.contains(it)){
                            q.offer(it);
                        }
                    }
                }
                
            }

        }

        return time;


        
    }
}