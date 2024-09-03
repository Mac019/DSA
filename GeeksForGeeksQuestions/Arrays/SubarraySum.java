import java.util.ArrayList;

public class SubarraySum {

    // Function to find a continuous sub-array which adds up to a given number   
    public static ArrayList<Integer> subarraySum(int[] arr, int n, long sum) {
        int last = 0;
        int start = 0;
        long currsum = 0;
        boolean found = false;
        ArrayList<Integer> result = new ArrayList<>();

        // Iterate over the array
        for (int i = 0; i < n; i++) {
            // Store sum up to current element
            currsum += arr[i];

            // Check if current sum is greater than or equal to given number
            if (currsum >= sum) {
                last = i;

                // Start from starting index till current index
                while (currsum > sum && start < last) {
                    // Subtract the element from left
                    currsum -= arr[start];
                    start++;
                }

                // If current sum becomes equal to given number
                if (currsum == sum) {
                    result.add(start + 1); // adding 1 to convert 0-based index to 1-based index
                    result.add(last + 1);
                    found = true;
                    break;
                }
            }
        }

        // If no subarray is found, store -1 in result
        if (!found) {
            result.add(-1);
        }

        // Return the result
        return result;
    }


    public static void main(String[] args) {
        int[] arr = {15, 2, 4, 8, 9, 5, 10, 23};
        int n = arr.length;
        long sum = 23; // Changed to long to match the function parameter type
        ArrayList<Integer> result = subarraySum(arr, n, sum);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
