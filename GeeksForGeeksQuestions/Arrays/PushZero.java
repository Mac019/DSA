class PushZero {

    // Function to push all zeros to the end of an array.
    static void pushZerosToEnd(int[] arr) {
        int count = 0;  // Tracks the position for non-zero elements

        // Move non-zero elements to the front of the array
        for (int num : arr) {
            if (num != 0) {
                arr[count] = num;
                count++;
            }
        }

        // Fill the remaining positions in the array with zeros
        while (count < arr.length) {
            arr[count++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        pushZerosToEnd(arr);
        System.out.println("Array after pushing zeros to the back:");

        for (int num : arr) {
            System.out.print(num + " ");
        
        }
    }
}
