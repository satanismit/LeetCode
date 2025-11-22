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
    public ListNode mergeKLists(ListNode[] lists) {
        
        Queue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);


          int n = lists.length;
        for(int i=0 ;i<n;i++){

            if(lists[i]!= null){
                pq.add(lists[i]);
            }
        }

        ListNode head = new ListNode();
        ListNode cur = head;

        while(!pq.isEmpty()){
            
            ListNode temp = pq.poll();
            cur.next=temp;
            cur=cur.next;

            if(temp.next!=null){
                pq.add(temp.next);
            }
        }

        return head.next;
    }
}