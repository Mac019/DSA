public class LinkedList {
    Node head;
    private int size;

    LinkedList(){
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add - first , last
    public void addFirst(String data){
        Node newNode = new Node(data); 
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data); 
        if (head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // print list 
    public void printList(){
        if (head == null){
            System.out.println("List is Empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    // delete first 
    public void deleteFirst(){
        if (head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    // delete last 
    public void deleteLast(){
        if (head == null){
            System.out.println("The list is empty");
            return;
        }

        if (head.next == null){
            head = null;
            size--;
            return;
        }

        size--;
        Node secondLast = head;
        Node lastNode = head.next;

        while (lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next; 
        }

        secondLast.next = null;
    }

    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("Mac");
        list.addLast("Bitch");
        // Add more elements or additional logic as needed.
        list.printList();
        System.out.println("Size of the list: " + list.getSize());
    }
}
