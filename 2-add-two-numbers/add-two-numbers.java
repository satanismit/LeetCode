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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode temp=new ListNode(0);
        ListNode head=temp;
        int v=0;
        while(l1!=null || l2!=null || v!=0){

            int sum=v;
            if(l1!=null){
                sum+=l1.val; 
                l1=l1.next;
            }
             if(l2!=null){
                sum+=l2.val; 
                l2=l2.next;
            }

            v=sum/10;
            head.next=new ListNode(sum%10);
            head=head.next;

            
        }
        return temp.next;

    }
}