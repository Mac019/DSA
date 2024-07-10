public class CircularQueue {
    private int arr[];
    private int size;
    private int front = -1;
    private int rear = -1;

    CircularQueue(int size) {
        arr = new int[size];
        this.size = size;
    }

    public boolean isEmpty() {
        return rear == -1 && front == -1;
    }

    public boolean isFull() {
        return (rear + 1) % size == front;
    }

    // Enqueue - Add
    public void add(int data) {
        if (isFull()) {
            System.out.println("Full Queue");
            return;
        }
        // 1st Element Add
        if (front == -1) {
            front = 0;
        }
        rear = (rear + 1) % size;
        arr[rear] = data;
    }

    // Dequeue - O(1)
    public int remove() {
        if (isEmpty()) {
            System.out.println("Empty Queue");
            return -1;
        }
        int result = arr[front];
        // Single Element Condition
        if (rear == front) {
            rear = front = -1;
        } else {
            front = (front + 1) % size;
        }
        return result;
    }

    // Peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("Empty Queue");
            return -1;
        }
        return arr[front];
    }

    public static void main(String[] args) {
        CircularQueue mac = new CircularQueue(5);
        mac.add(1);
        mac.add(2);
        mac.add(3);
        mac.add(4);
        mac.add(5);
        System.out.println(mac.remove());
        mac.add(6);
        System.out.println(mac.remove());
        mac.add(7);
        
        // 1 2 3 .....

        while (!mac.isEmpty()) {  // Call isEmpty() on the mac instance
            System.out.println(mac.peek());
            mac.remove();
        }
    }
}
