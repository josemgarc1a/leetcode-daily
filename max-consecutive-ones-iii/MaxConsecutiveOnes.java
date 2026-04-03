public class MaxConsecutiveOnes {
    
    public static void main(String[] args) {
        MaxConsecutiveOnes m = new MaxConsecutiveOnes();
        int[] n = new int[]{1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
        m.longestOnes(n, k);
    }

    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int maxCount = 0;
        int zeros = 0;

        for (int right =0; right<nums.length; right++) {
            if(nums[right]==0) {
                zeros++;
            }

            while(zeros>k) {
                if(nums[left]==0) {
                    zeros--;
                }
                left++;
            }

            maxCount = Math.max(maxCount, right-left+1);
        }
        return maxCount;
    }

}
