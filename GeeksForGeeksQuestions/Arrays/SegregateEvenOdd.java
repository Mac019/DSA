public class SegregateEvenOdd {

    // Function to segregate even and odd numbers
    static void separateEvenOdd(int arr[]) {
        int i = 0, j = 0;
        int n = arr.length;

        // Traverse through the array
        while (j < n) {
            if (arr[j] % 2 == 0) {
                // Swap arr[i] with arr[j] if arr[j] is even
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
            j++;
        }

        // Print the segregated array
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
    }

    // Main method to test the function
    public static void main(String args[]) {
        int arr[] = { 1, 3, 2, 4, 7, 6, 9, 10 };
        separateEvenOdd(arr);
    }
}
