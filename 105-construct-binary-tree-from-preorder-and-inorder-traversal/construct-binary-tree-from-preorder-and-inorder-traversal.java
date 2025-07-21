class Solution {

    public  int preIndex = 0; 

    public TreeNode solve(int[] preorder, int[] inorder, int st, int end) {
        if (st > end) {
            return null;
        }

        int rootVal = preorder[preIndex++];
        TreeNode root = new TreeNode(rootVal);

      
        int i;
        for (i = st; i <= end; i++) {
            if (inorder[i] == rootVal) {
                break;
            }
        }

        
        root.left = solve(preorder, inorder, st, i - 1);
        root.right = solve(preorder, inorder, i + 1, end);

        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preIndex = 0;
        return solve(preorder, inorder, 0, inorder.length - 1);
    }
}
