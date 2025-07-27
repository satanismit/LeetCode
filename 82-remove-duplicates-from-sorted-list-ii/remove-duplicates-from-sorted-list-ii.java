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
    public ListNode deleteDuplicates(ListNode head) {
        

        ListNode cur=head;
        ListNode temp=new ListNode(0,head);
        ListNode prev=temp;

        while(cur!=null){


            boolean flag=false;

            while(cur.next!=null && cur.next.val==cur.val){
                cur=cur.next;
                flag=true;
            }

            if(flag){
                prev.next=cur.next;
            }else{
                prev=prev.next;
            }
            cur=cur.next;
        }

        return temp.next;
    }
}