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
public class Question number19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // int len=0;
        // ListNode cur=head;
        // while(cur!=null){
        //     cur=cur.next;
        //     len=len+1;
        // }
        // ListNode dummy=new ListNode(0);
        // dummy.next=head;
        // int jumps=len-n;

        // ListNode prev=dummy;
        // while(jumps>0){
        //     prev=prev.next;
        //     jumps=jumps-1;
        // }
        // prev.next=prev.next.next;
        // return dummy.next;
        
        int currJumps=n;
        ListNode cur=head;

        while(currJumps>0){
            cur=cur.next;
            currJumps=currJumps-1;
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;

        ListNode prev=dummy;
        while(cur!=null){
            cur=cur.next;
            prev=prev.next;
        }
        prev.next=prev.next.next;
        return dummy.next;
    }
}