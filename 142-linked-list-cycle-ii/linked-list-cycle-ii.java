/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        Map<ListNode, Integer> map=new HashMap<>();


        ListNode curr=head;
        int i=0;
        while(curr!=null){

            if(!map.containsKey(curr)){
                map.put(curr,i);
            }else{
                return curr;
            }
         
            curr=curr.next;
            i++;
        }
        return null;


    }
}