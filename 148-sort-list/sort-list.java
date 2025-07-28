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
    public ListNode sortList(ListNode head) {
        

        ListNode cur=head;

        int length=0;

        while(cur!=null){
            cur=cur.next;
            length++;
        }

        int[] arr=new int[length];

        cur=head;
        int i=0;
        while(cur!=null){

            arr[i++]=cur.val;
            cur=cur.next;
        }


        Arrays.sort(arr);

        cur=head;
        i=0;
        while(cur!=null){

            cur.val=arr[i++];
            cur=cur.next;
        }

        return head;
        


    }
}