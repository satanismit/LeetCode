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
    public ListNode rotateRight(ListNode head, int k) {
        

        if (head == null || head.next == null || k == 0) return head;
        ListNode cur=head;

        int length=1;

        while(cur.next!=null){

            length++;
            cur=cur.next;
        }

        //make circular LL
        cur.next=head;



        int rotate=k%length;
        int steps=length-rotate;

        ListNode newtail=head;

        for(int i=1; i<steps; i++){

            newtail=newtail.next;
        }

        ListNode newhead=newtail.next;
        newtail.next=null;


        return newhead;

    }
}