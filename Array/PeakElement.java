public class PeakElement {
    // Function to find the peak element
    // arr[]: input array
    // n: size of array a[]
    public int peakElement(int[] arr, int n) {
        // Edge case: if array has only one element
        if (n == 1) {
            return 0;
        }

        // Check if the first element is a peak
        if (arr[0] >= arr[1]) {
            return 0;
        }

        // Check if the last element is a peak
        if (arr[n - 1] >= arr[n - 2]) {
            return n - 1;
        }

        // Check for peak element in the middle of the array
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
                return i;
            }
        }

        // If no peak is found, which is practically impossible in a non-empty array
        return -1;
    }

    public static void main(String[] args) {
        PeakElement sol = new PeakElement();
        int[] arr = {1, 3, 20, 4, 1, 0};
        int n = arr.length;
        int peakIndex = sol.peakElement(arr, n);
        System.out.println("The peak element is at index: " + peakIndex + " and the value is " + arr[peakIndex]);
    }
}
