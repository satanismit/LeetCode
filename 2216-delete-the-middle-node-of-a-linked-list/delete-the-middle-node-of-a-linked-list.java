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

    public ListNode deleteMiddle(ListNode head) {

        if(head ==null || head.next==null){
            return null;
        }

        ListNode fast = head;
        ListNode slow = head;
        ListNode slow1 = null;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow1 = slow;
            slow=slow.next;
           
        }

        slow1.next = slow.next;
        slow.next = null;

        return head;
        
    }
}

