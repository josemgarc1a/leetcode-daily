public class MaximumAverageSubArrayI {

    public static void main(String[] args) {
        MaximumAverageSubArrayI m = new MaximumAverageSubArrayI();
        Double d = Double.MIN_VALUE;
        d = m.findMaxAverage(new int[]{1,12,-5,-6,50,3}, 4);
        System.out.println("D: " + d);
        d = m.findMaxAverage(new int[]{5}, 1);
        System.out.println("D: " + d);
    }

    public double findMaxAverage(int[] nums, int k) {
        //create a sliding window from i to k-1
        int left = 0;
        double sum = 0;
        double largestSum = 0;

        //calculate first sum
        for (int i=0; i<k; i++) {
            sum += nums[i];
            largestSum = sum;
        }
        
        //traverse the rest of the array  
        while (left+k < nums.length) {
            sum -= nums[left];
            sum += nums[left+k];
            left++;
            if (sum > largestSum) largestSum = sum;
        }
        return largestSum/k;
    }
    
}
