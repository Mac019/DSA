import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        // Inserting elements
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1); // Duplicate element, will not be added

        // Size of the set
        System.out.println("Size of set is: " + set.size());

        // Print all elements
        System.out.println(set);

        // Iterator to traverse the set
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Search - Contains
        if (set.contains(1)) {
            System.out.println("Set contains 1");
        }
        if (!set.contains(6)) {
            System.out.println("Set does not contain 6");
        }

        // Delete element
        set.remove(1);
        if (!set.contains(1)) {
            System.out.println("Set does not contain 1 - We deleted 1");
        }
    }
}
