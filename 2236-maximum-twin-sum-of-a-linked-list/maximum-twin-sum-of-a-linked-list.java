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
class Solution {
    public int pairSum(ListNode head) {
        
        List<Integer> list=new ArrayList<>();

        while(head!=null){
            list.add(head.val);
            head=head.next;
        }

        int n=list.size();

        int left=0, right=n-1;
        int pairsum=Integer.MIN_VALUE;

        while(left<right){

            pairsum = Math.max(pairsum, list.get(left)+list.get(right));

            left++;
            right--;
        }

        return pairsum;
        
    }
}