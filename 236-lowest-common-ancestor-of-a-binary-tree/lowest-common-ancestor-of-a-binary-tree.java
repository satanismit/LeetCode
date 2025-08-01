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

    public boolean getancestor(TreeNode root, TreeNode X,List<TreeNode> list){
        
        if(root==null){
            return false;
        }
        
        if(root==X){
            return true;
        }
        if(getancestor(root.left,X,list) || getancestor(root.right, X,list)){
            list.add(root);
            return true;
        }

        return false;

    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

            List<TreeNode> list1=new ArrayList<>();
             List<TreeNode> list2=new ArrayList<>();

            list1.add(p);
             list2.add(q);

             getancestor(root,p,list1);
             getancestor(root,q,list2);

             int n1=list1.size(),n2=list2.size();

             Set<TreeNode> set=new LinkedHashSet<>();

             for(int i=0; i<n1; i++){
                set.add(list1.get(i));
             }

             boolean flag=false;

             for(int i=0; i<n2; i++){

                if(set.contains(list2.get(i))){
                    
                    return list2.get(i);
                   
                }
             }

            

        return root;
    }
}