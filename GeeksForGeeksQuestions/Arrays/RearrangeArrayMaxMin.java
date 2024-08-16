import java.util.Arrays;

public class RearrangeArrayMaxMin {
    public static void rearrangeArray(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        int[] result = new int[n];
        int index = 0;
        
        while (left <= right) {
            if (left != right) {
                result[index++] = arr[right--];
                result[index++] = arr[left++];
            } else {
                result[index] = arr[left];
                break;
            }
        }
        
        // Copy the rearranged elements back to the original array
        for (int i = 0; i < n; i++) {
            arr[i] = result[i];
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        int[] arr2 = {1, 2, 3, 4, 5, 6};
        
        rearrangeArray(arr1);
        rearrangeArray(arr2);
        
        System.out.println("Output for arr1: " + Arrays.toString(arr1)); // Output: [7, 1, 6, 2, 5, 3, 4]
        System.out.println("Output for arr2: " + Arrays.toString(arr2)); // Output: [6, 1, 5, 2, 4, 3]
    }
}
