/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    
    public TreeNode solve(int[] nums, int st, int end){
        
        if(st >=end)  {
            return null;
        }

        int mid = st + (end-st)/2;

        TreeNode node = new TreeNode(nums[mid]);

        node.left = solve(nums, st, mid);
        node.right= solve(nums, mid+1, end);

        return node;

    }

    public TreeNode sortedListToBST(ListNode head) {
        
        
        ListNode curr = head;
        int len =0;
        while(curr!=null){
            curr=curr.next;
            len++;
        }

        int[] nums = new int[len];

        curr=head;
        int ind=0;
        while(curr!=null){
          
            nums[ind++]=curr.val;
              curr = curr.next;
        }

        return solve(nums, 0, len);

    }
}