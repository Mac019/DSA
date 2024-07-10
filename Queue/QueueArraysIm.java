public class QueueArraysIm {
    private int arr[];
    private int size;
    private int rear = -1;

    QueueArraysIm(int size) {
        arr = new int[size];
        this.size = size;
    }

    public boolean isEmpty() {
        return rear == -1;
    }

    // Enqueue - Add
    public void add(int data) {
        if (rear == size - 1) {
            System.out.println("Full Queue");
            return;
        }
        rear++;
        arr[rear] = data;
    }

    // Dequeue - O(n)
    public int remove() {
        if (isEmpty()) {
            System.out.println("Empty Queue");
            return -1;
        }
        int front = arr[0];
        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }
        rear--;
        return front;
    }

    // Peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("Empty Queue");
            return -1;
        }
        return arr[0];
    }

    public static void main(String[] args) {
        QueueArraysIm mac = new QueueArraysIm(5);
        mac.add(1);
        mac.add(2);
        mac.add(3);
        // 1 2 3 .....

        while (!mac.isEmpty()) {  // Call isEmpty() on the mac instance
            System.out.println(mac.peek());
            mac.remove();
        }
    }
}
