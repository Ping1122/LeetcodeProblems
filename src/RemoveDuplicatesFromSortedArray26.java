public class RemoveDuplicatesFromSortedArray26 {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int left = 1;
        int right = 1;
        while (right < nums.length) {
            if (nums[right] != nums[right-1]) {
                nums[left] = nums[right];
                left++;
            }
            right++;
        }
        return left;
    }
}
