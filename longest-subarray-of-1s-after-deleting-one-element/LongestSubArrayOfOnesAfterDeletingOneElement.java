public class LongestSubArrayOfOnesAfterDeletingOneElement {

    public static void main(String[] args) {
        LongestSubArrayOfOnesAfterDeletingOneElement l = new LongestSubArrayOfOnesAfterDeletingOneElement();
        int count = l.longestSubarray(new int[]{1,1,0,1});
        System.out.println("Count: " + count);
        count = l.longestSubarray(new int[]{0,1,1,1,0,1,1,0,1});
        System.out.println("Count 2: " + count);

    }

    public int longestSubarray(int[] nums) {
        int k = 1;
        int zeros = 0;
        int left = 0;
        int maxCount = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeros++;
            }

            while (zeros>k) {
                if (nums[left]==0) {
                    zeros--;
                }
                left++;
            }

            maxCount = Math.max(maxCount, right-left);
        }
        return maxCount;
    }
}
