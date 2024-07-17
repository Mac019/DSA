// Assuming ListNode class is defined as below
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class DetectCycleLinkList {

    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode hare = head;  // fast pointer
        ListNode turtle = head;  // slow pointer

        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;

            if (hare == turtle) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Example test case
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next; // Creates a cycle

        DetectCycleLinkList solution = new DetectCycleLinkList();
        boolean result = solution.hasCycle(head);
        System.out.println("Cycle detected: " + result);  // Should print "Cycle detected: true"
    }
}
