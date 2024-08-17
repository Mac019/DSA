class DutchNationalFlag {
    // Dutch National Flag Algorithm
    public void sortColors(int[] nums) {
        int low = 0;                
        int mid = 0;                
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else if (nums[mid] == 2) {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        DutchNationalFlag solution = new DutchNationalFlag();
        solution.sortColors(nums);
        
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
