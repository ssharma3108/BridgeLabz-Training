class ListNode {
    char data;
    ListNode next;

    ListNode(char data) {
        this.data = data;
    }
}

public class NthFromEnd {
    public static ListNode findNthFromEnd(ListNode head, int n) {
        if (head == null)
            return null;

        ListNode first = head;
        ListNode second = head;

        for (int i = 0; i < n; i++) {
            if (second == null) {
                return null;
            }
            second = second.next;
        }

        while (second != null) {
            first = first.next;
            second = second.next;
        }

        return first;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode('A');
        head.next = new ListNode('B');
        head.next.next = new ListNode('C');
        head.next.next.next = new ListNode('D');
        head.next.next.next.next = new ListNode('E');

        ListNode result = findNthFromEnd(head, 2);
        System.out.println("N=2 from end: " + (result != null ? result.data : "null"));
    }
}