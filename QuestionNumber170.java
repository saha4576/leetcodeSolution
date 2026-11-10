public class QuestionNumber170 {


  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //approach 1
        // ListNode currA=headA;
        // ListNode currB=headB;
        // while(currA!=null){
        //     currB=headB;
        //     while(currB!=null){
        //         if(currA==currB){
        //             return currA;
        //         }
        //         currB=currB.next;
        //     }
        //     currA=currA.next;
        // }
        // return null;


        //approach 2
        // Set<ListNode>set=new HashSet<>();
        // ListNode currA=headA;
        // ListNode currB=headB;
        // while(currA!=null){
        //     set.add(currA);
        //     currA=currA.next;
        // }
        // while(currB!=null){
        //     if(set.contains(currB)){
        //         return currB;
        //     }
        //     currB=currB.next;
        // }
        // return null;

        //approach 3
        // ListNode currA=headA;
        // ListNode currB=headB;
        // while(currA!=currB){
        //     currA=currA==null ? headB:currA.next;
        //     currB=currB==null ? headA:currB.next;
        // }
        // return currA;

        //approach 4
       
       ListNode currA=headA;
       ListNode currB=headB;

       int lenA=0;
       int lenB=0;
       while(currA !=null){
         lenA++;
         currA=currA.next;
        }
       while(currB !=null){
         lenB++;
         currB=currB.next;
        }
        currA=headA;
        currB=headB;
         int diff=Math.abs(lenA-lenB);
        if(lenA>lenB){
           int i=0;
           currA=headA;
          while(i<diff){
              currA=currA.next;
              i++;
            }
        } else{
            int i=0;
            currB=headB;
            while(i<diff){
                currB=currB.next;
                i++;
            }
        }
        while(currA !=null && currB!=null &&  currA !=currB){
            currA=currA.next;
            currB=currB.next;
        }
        return currA;

      }
}    

