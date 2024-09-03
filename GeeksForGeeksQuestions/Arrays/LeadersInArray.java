public class LeadersInArray {

    // Function to print leaders in an array
    void printLeaders(int arr[], int size) {
        // Initialize current leader with the rightmost element
        int currentLeader = arr[size - 1];
        System.out.print(currentLeader + " ");

        for (int i = size - 2; i >= 0; i--) {
            if (arr[i] > currentLeader) {
                // Update current leader if a larger element is found
                currentLeader = arr[i];
                System.out.print(currentLeader + " ");
            }
        }
    }

    public static void main(String[] args) {
        
        int arr[] = {16, 17, 4, 3, 5, 2};

        int n = arr.length;

        LeadersInArray lead = new LeadersInArray();

        lead.printLeaders(arr, n);
    }
}