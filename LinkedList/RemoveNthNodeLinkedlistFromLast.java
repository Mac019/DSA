public class RemoveNthNodeLinkedlistFromLast {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) {
            return null;
        }
        int size = 0;
        ListNode curr = head;
        while (curr != null) {
            curr = curr.next;
            size++;
        }
        if (n == size) {
            return head.next;
        }
        
        int indexToSearch = size - n;
        ListNode prev = head;
        int i = 1;
        while (i < indexToSearch) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }

    public static void main(String[] args) {
        RemoveNthNodeLinkedlistFromLast solution = new RemoveNthNodeLinkedlistFromLast();
        
        // Creating a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int n = 2;

        System.out.print("Original list: ");
        printList(head);

        head = solution.removeNthFromEnd(head, n);

        System.out.print("Modified list after removing " + n + "th node from the end: ");
        printList(head);
    }

    // Helper method to print the linked list
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}
