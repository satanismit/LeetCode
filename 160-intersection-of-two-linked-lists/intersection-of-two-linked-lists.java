/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode cur = headA;
        int countA=0;
        while(cur!=null){
            countA++;
            cur=cur.next;
        }

         cur = headB;
        int countB=0;
        while(cur!=null){
            countB++;
            cur=cur.next;
        }

    ListNode curA=headA, curB=headB;
      if(countA >countB){
        
        for(int i=0; i<countA-countB; i++)  curA=curA.next;
      }else{
        for(int i=0; i<countB-countA; i++)  curB=curB.next;
        
      }

    
      while(curA!=null && curB!=null){

        if(curA==curB){
            return curA;
        }

        curA= curA.next;
        curB= curB.next;
      }

      return null;

  
    }
}