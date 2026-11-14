public class QuestionNumber138 {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        Node curr = head;
        Node newCurr = head;
        while (curr != null) {
            Node node = new Node(curr.val);
            Node currNext = curr.next;
            node.next = currNext;
            curr.next = node;
            curr = currNext;
        }
        curr = head;
        while (curr != null) {
            Node newNode = curr.next;
            newNode.random = curr.random != null ? curr.random.next : null;
            curr = curr.next.next;
        }
        Node oldHead = head,
                newHead = head.next,
                resultHead = head.next;

        while (oldHead != null) {
            oldHead.next = newHead.next;
            oldHead = newHead.next;
            newHead.next = oldHead != null ? oldHead.next : null;
            newHead = newHead.next;
        }
        return resultHead;
    }
}