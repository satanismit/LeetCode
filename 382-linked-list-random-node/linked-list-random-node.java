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

    ListNode head=null;
    private Random rand=new Random();

    public Solution(ListNode head) {
        
        this.head=head;
    }
    
    public int getRandom() {
        
       ListNode curr=head;
        int n=0;
       while(curr!=null){
        n++;
        curr=curr.next;
       }

       int[] arr=new int[n];

       curr=head;
       int ind=0;

       while(curr!=null){
          arr[ind++]=curr.val;
          curr=curr.next;
       }


       return arr[rand.nextInt(n)];
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */