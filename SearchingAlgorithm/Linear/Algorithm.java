public class Algorithm {
    public static int search(int mac[], int target, int N) {
        for(int i = 0; i < N; i++) {
            if(mac[i] == target) {
                return i;
            }
        }
        return -1; // This should be outside the for loop
    }

    public static void main(String[] args) {
        int mac[] = {1, 4, 56, 78, 9};
        int target = 1;

        int result = search(mac, target, mac.length);
        if(result == -1) {
            System.out.print("Element is not present");
        } else {
            System.out.print("Element is present at index " + result);
        }
    }
}
