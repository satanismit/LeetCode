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

    
    public ListNode swapPairs(ListNode head) {
        
      if(head==null || head.next==null){
        return head;
      }

      ListNode f=head;
      ListNode s=head.next;
      ListNode prev=null;

      while(f!=null && s!=null){

        ListNode th=s.next;
        s.next=f;
        f.next=th;
        if(prev!=null){
            prev.next=s;
        }else{
            head=s;
        }

        prev=f;
        f=th;
        if(th!=null){
            s=th.next;
        }else{
            s=null;
        }

      }
    return head;
    }}