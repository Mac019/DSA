import java.util.Arrays;

public class TriangleCounter {
    public static int countPossibleTriangles(int[] arr) {
        int n = arr.length;
        int count = 0;

        // Sort the array
        Arrays.sort(arr);

        // Use a three-pointer approach
        for (int i = n - 1; i >= 2; i--) {
            int left = 0;
            int right = i - 1;

            while (left < right) {
                // Check if the sum of the two sides is greater than the third side
                if (arr[left] + arr[right] > arr[i]) {
                    // All elements between left and right can form a triangle with arr[i]
                    count += right - left;

                    // Decrement right to check for more possibilities
                    right--;
                } else {
                    // Increment left to check for more possibilities
                    left++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 21, 22, 100, 101, 200, 300 };
        int result = countPossibleTriangles(arr);
        System.out.println("Number of possible triangles: " + result); // Output: 6
    }
}
