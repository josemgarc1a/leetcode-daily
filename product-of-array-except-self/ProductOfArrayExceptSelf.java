import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        ProductOfArrayExceptSelf solver = new ProductOfArrayExceptSelf();

        int[] nums1 = {1, 2, 3, 4};
        int[] expected1 = {24, 12, 8, 6};
        int[] actual1 = solver.productExceptSelf(nums1);
        System.out.println("nums=" + Arrays.toString(nums1) + " expected=" + Arrays.toString(expected1) + " actual=" + Arrays.toString(actual1));

        int[] nums2 = {-1, 1, 0, -3, 3};
        int[] expected2 = {0, 0, 9, 0, 0};
        int[] actual2 = solver.productExceptSelf(nums2);
        System.out.println("nums=" + Arrays.toString(nums2) + " expected=" + Arrays.toString(expected2) + " actual=" + Arrays.toString(actual2));
    }
        
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int n = nums.length;
        
        int left = 1;
        for (int i=0; i < n; i++) {
            answer[i] = left;
            left *= nums[i];
        }

        int right = 1;
        for (int i = n-1; i >= 0; i--) {
            answer[i] *= right;
            right *= nums[i];
        }
        return answer;
    }
}
