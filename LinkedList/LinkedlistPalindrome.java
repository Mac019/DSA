public class LinkedlistPalindrome {
    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    // Function to reverse the linked list
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    // Function to find the middle of the linked list
    public ListNode findMiddle(ListNode head) {
        ListNode hare = head;
        ListNode turtle = head;

        while (hare.next != null && hare.next.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }

    // Function to check if the linked list is a palindrome
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode middle = findMiddle(head); // 1st half End
        ListNode secondHalfStart = reverse(middle.next);

        ListNode firstHalfStart = head;
        while (secondHalfStart != null) {
            if (firstHalfStart.val != secondHalfStart.val) {
                return false;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }
        return true;
    }

    // Function to print the linked list (for testing purposes)
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 2 -> 1
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        LinkedlistPalindrome solution = new LinkedlistPalindrome();

        System.out.print("Original List: ");
        printList(head);

        boolean result = solution.isPalindrome(head);
        System.out.println("Is the linked list a palindrome? " + result);
    }
}
