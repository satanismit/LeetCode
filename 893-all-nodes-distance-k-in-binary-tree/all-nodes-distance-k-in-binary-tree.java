/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
class Solution {

    Map<Integer, List<Integer>> adj = new HashMap<>();

    private void createGraph(TreeNode node){

        if(node==null)  return;


        if(node.left!=null){

            adj.computeIfAbsent( node.left.val , k-> new ArrayList<>()).add(node.val);
            adj.computeIfAbsent(node.val, k-> new ArrayList<>()).add(node.left.val);
        }

        if(node.right!=null){
             adj.computeIfAbsent( node.right.val , k-> new ArrayList<>()).add(node.val);
            adj.computeIfAbsent(node.val, k-> new ArrayList<>()).add(node.right.val);

        }

        createGraph(node.left);
        createGraph(node.right);

    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {

        List<Integer> ans = new ArrayList<>();

        if(k==0) {
            ans.add(target.val);
            return ans;
        }

        createGraph(root);


        Queue<Integer> q= new LinkedList<>();
        Set<Integer> vis = new HashSet<>();


        q.offer(target.val);

        while(!q.isEmpty()){

            k--;
            int size = q.size();

            for(int i=0; i<size; i++){
                
                int node = q.poll();
                vis.add(node);
                if(adj.containsKey(node)){

                    for(int it:adj.get(node)){

                        if(!vis.contains(it)){
                            q.offer(it);
                        }
                    }

                }
                
            }

            if(k==0){
                while(!q.isEmpty()){
                    ans.add(q.poll());
                }
                break;
            }
            
        }

        return ans;
        
    }
}