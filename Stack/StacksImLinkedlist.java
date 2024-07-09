public class StacksImLinkedlist {
    static class Node {
        int data; 
        Node next;
        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Stack {
        public Node head;  

        public boolean isEmpty() {
            return head == null;
        }

        public void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack mac = new Stack();
        mac.push(1);
        mac.push(2);
        mac.push(3);
        mac.push(4);

        while (!mac.isEmpty()) {  
            System.out.println(mac.peek());
            mac.pop();
        }
    }
}
