public class FindPivotIndex {

    public static void main(String[] args) {
        FindPivotIndex f = new FindPivotIndex();
        int[] nums = new int[]{1,7,3,6,5,6};
        f.pivotIndex(nums);

        nums = new int[]{1,2,3};
        f.pivotIndex(nums);
    }

    public int pivotIndex(int[] nums) {
        // A pointers is needed on each end of the array
        int left=0, right=nums.length-1, sumRight=0, sumLeft=0, numsTotal=0;
        //The starting positions are 0 and nums.length
        for (int n : nums) {
            numsTotal += n;
        }

        for (int i=0; i<nums.length; i++) {
            int currentValue = nums[i];
            sumRight = numsTotal - sumLeft - currentValue;
            System.out.println("Sum Left : " + sumLeft + "  Sum Right : " + sumRight);
            if (sumLeft==sumRight) {
                System.out.println("Index: " + i);
                return i;
            }
            sumLeft += currentValue;
        }
        System.out.println("Index: -1");
        return -1;
    }
    
}
