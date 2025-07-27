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

        Map<Integer,Integer> map=new LinkedHashMap<>();

        ListNode curr=head;

        while(curr!=null){

            map.put(curr.val, map.getOrDefault(curr.val,0)+1);
            curr=curr.next;
        }

        ListNode temp=new ListNode();
        ListNode h=temp;
        
        for(Map.Entry<Integer,Integer> ele: map.entrySet()){

            int n=ele.getValue();

            if(n==1){

                temp.next=new ListNode(ele.getKey());
                temp=temp.next;
            }
        
        
        }

        return h.next;
        
    }
}