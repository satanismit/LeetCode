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
    public ListNode reverseKGroup(ListNode head, int k) {
        
        // check if linked link exist of k group or not 
        ListNode temp=head;
        int count=0;
        while(count<k){
            if(temp==null){
                return head;
            }
            temp=temp.next;
            count++;
        }

        //make recursive calls for rest of the LL
        ListNode prev=reverseKGroup(temp,k);

        //reverse current group 
        temp=head;
        count=0;
        while(count<k){

            ListNode n=temp.next;
            temp.next=prev;

            prev=temp;
            temp=n;
            count++;
        }
        return prev;



    }
}