/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class QuestionNumber234 {
    public ListNode reverse(ListNode head) {
        ListNode curr = head,
                prev = null;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        // List<Integer>list =new ArrayList<>();
        // ListNode curr=head;
        // while(curr!=null){
        // list.add(curr.val);
        // curr=curr.next;
        // }
        // int i=0, j=list.size()-1;

        // while(i<j){
        // if(list.get(i)!=list.get(j)){
        // return false;
        // }
        // i++;
        // j--;
        // }
        // return true;

        ListNode slow = head,
                fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode p2 = reverse(slow);
        ListNode p1 = head;

        while (p1 != null && p2 != null) {
            if (p1.val != p2.val) {
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;

    }
}