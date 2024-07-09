import java.util.ArrayList;

public class StacksImArrayList {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // Push
        public static void push(int data) {
            list.add(data);
        }

        // Pop
        public static int pop() { 
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // Peek
        public static int peek() { 
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
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
