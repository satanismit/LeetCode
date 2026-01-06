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

    public int maxLevelSum(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();
    
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);
        int res= Integer.MIN_VALUE;
        int curlevel=1;

        while(!q.isEmpty()){

            
            int size= q.size();
            List<Integer> temp = new ArrayList<>();
            int count = 0;
            for(int i=0; i<size; i++){

                TreeNode cur = q.poll();
                if(cur.left!=null) q.add(cur.left);
                if(cur.right!=null) q.add(cur.right);
                temp.add(cur.val);
                count+=cur.val;

            }
            ans.add(temp);

        }
        int maxlevel=0;
        int max=Integer.MIN_VALUE;
        // sum=0;
        int level=1;

        for(int i=0;i<ans.size(); i++){

            int sum=0;
            for(int j=0; j<ans.get(i).size(); j++){
               sum += ans.get(i).get(j);

            }
            if(max<sum){ 
                max=sum;
                maxlevel=level;
            }
            level++;
            
        }
        return maxlevel;
    }
}