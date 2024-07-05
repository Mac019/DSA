public class RotateImage {

    public static void rotate(int[][] mac) {
        // Transposing the matrix
        for (int i = 0; i < mac.length; i++) {
            for (int j = i + 1; j < mac[i].length; j++) {
                int temp = mac[i][j];
                mac[i][j] = mac[j][i];
                mac[j][i] = temp;
            }
        }

        // Reversing each row
        for (int i = 0; i < mac.length; i++) {
            int start = 0;
            int end = mac[i].length - 1;
            while (start < end) {
                int temp = mac[i][start];
                mac[i][start] = mac[i][end];
                mac[i][end] = temp;
                start++;
                end--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] mac = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        rotate(mac);

        // Printing the rotated matrix
        for (int i = 0; i < mac.length; i++) {
            for (int j = 0; j < mac[i].length; j++) {
                System.out.print(mac[i][j] + " ");
            }
            System.out.println();
        }
    }
}
