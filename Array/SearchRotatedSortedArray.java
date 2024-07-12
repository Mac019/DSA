public class SearchRotatedSortedArray {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        SearchRotatedSortedArray searcher = new SearchRotatedSortedArray();
        
        int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
        int target1 = 0;
        System.out.println("Index of " + target1 + ": " + searcher.search(nums1, target1));  // Output: 4

        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        int target2 = 3;
        System.out.println("Index of " + target2 + ": " + searcher.search(nums2, target2));  // Output: -1

        int[] nums3 = {1};
        int target3 = 0;
        System.out.println("Index of " + target3 + ": " + searcher.search(nums3, target3));  // Output: -1

        int[] nums4 = {5, 1, 3};
        int target4 = 3;
        System.out.println("Index of " + target4 + ": " + searcher.search(nums4, target4));  // Output: 2
    }
}
