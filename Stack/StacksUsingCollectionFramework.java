import java.util.Stack;

public class StacksUsingCollectionFramework {
    public static void main(String[] args) {
        Stack<Integer> mac = new Stack<>();  // Use a single declaration

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
