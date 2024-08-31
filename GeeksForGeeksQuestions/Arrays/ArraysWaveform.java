import java.util.Arrays;

class ArraysWaveform {
    // Method to sort the array in wave form
    void sortInWave(int[] arr) {
        // Sort the input array
        Arrays.sort(arr);

        // Swap adjacent elements to form a wave pattern
        for (int i = 0; i < arr.length - 1; i += 2) {
            // Swap arr[i] and arr[i + 1]
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    // Driver method
    public static void main(String[] args) {
        ArraysWaveform ob = new ArraysWaveform();
        int[] arr = {10, 90, 49, 2, 1, 5, 23};
        ob.sortInWave(arr);
        // Print the sorted array in wave form
        System.out.println(Arrays.toString(arr));
    }
}
