public class QuestionNumber142 {
    public ListNode detectCycle(ListNode head) {
        // Set<ListNode>set=new HashSet<>();
        // ListNode curr=head;
        // while(curr !=null){
        //     if(set.contains(curr)){
        //         return curr;
        //     }
        //     set.add(curr);
        //     curr=curr.next;
        // }
        // return null;

        ListNode slow=head;
        ListNode fast=head;
        while(fast !=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                break;
               }
                  }
            if(fast==null || fast.next==null){
                return null;
            }
            ListNode curr=head;
            while(curr!=slow){
                curr=curr.next;
                slow=slow.next;
            }
            return curr;  
    }
}