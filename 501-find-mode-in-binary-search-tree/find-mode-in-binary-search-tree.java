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

    Map<Integer,Integer> map=new HashMap<>();

    public void dfs(TreeNode root){

        if(root==null){
            return;
        }

        dfs(root.left);
        //add value and frequency into the map
        map.put(root.val, map.getOrDefault(root.val,0)+1);
        dfs(root.right);
    }

    public int[] findMode(TreeNode root) {
        
        dfs(root);
        List<Integer> ans=new ArrayList<>();

        int max=0;

        for(Map.Entry<Integer,Integer> ele:map.entrySet()){

            if(max<ele.getValue()){
                ans.clear();
                ans.add(ele.getKey());
                max=ele.getValue();
            }
            else if(max==ele.getValue()){
                ans.add(ele.getKey());
            }

        }

        int[] arr=ans.stream()
                     .mapToInt(Integer::intValue)
                     .toArray();


        return arr;
    }
}