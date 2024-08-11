class LargestThreeNumbers {
    static void print3largest(int arr[], int n) {
        if (n < 3) {
            System.out.print("Invalid Input");
            return;
        }

        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;

        for (int num : arr) {  // num is the current element in the array
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second) {
                third = second;
                second = num;
            } else if (num > third) {
                third = num;
            }
        }

        System.out.println("Three largest elements are " + first + " " + second + " " + third);
    }

    public static void main(String[] args) {
        int arr[] = { 12, 13, 1, 10, 34, 89 };
        print3largest(arr, arr.length);
    }
}
