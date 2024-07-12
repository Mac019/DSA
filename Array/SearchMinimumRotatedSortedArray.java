public class SearchMinimumRotatedSortedArray {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < nums[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return nums[left];
    }

    public static void main(String[] args) {
        SearchMinimumRotatedSortedArray finder = new SearchMinimumRotatedSortedArray();

        // Test cases
        int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
        System.out.println("Minimum in nums1: " + finder.findMin(nums1));  // Output: 0

        int[] nums2 = {3, 4, 5, 1, 2};
        System.out.println("Minimum in nums2: " + finder.findMin(nums2));  // Output: 1

        int[] nums3 = {11, 13, 15, 17};
        System.out.println("Minimum in nums3: " + finder.findMin(nums3));  // Output: 11

        int[] nums4 = {2, 1};
        System.out.println("Minimum in nums4: " + finder.findMin(nums4));  // Output: 1

        int[] nums5 = {1};
        System.out.println("Minimum in nums5: " + finder.findMin(nums5));  // Output: 1
    }
}
