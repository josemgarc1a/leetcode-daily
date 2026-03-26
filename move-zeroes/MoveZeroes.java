import java.util.Arrays;

public class MoveZeroes {

    public static void main(String[] args) {
        MoveZeroes solver = new MoveZeroes();

        runCase(solver, new int[] {0, 1, 0, 3, 12}, new int[] {1, 3, 12, 0, 0});
        runCase(solver, new int[] {0, 1, 0, 0, 12}, new int[] {1, 12, 0, 0, 0});
        runCase(solver, new int[] {0}, new int[] {0});
    }

    private static void runCase(MoveZeroes solver, int[] input, int[] expected) {
        int[] nums = Arrays.copyOf(input, input.length);
        String actual;

        try {
            solver.moveZeroes(nums);
            actual = Arrays.toString(nums);
        } catch (RuntimeException e) {
            actual = "<error: " + e.getClass().getSimpleName() + ">";
        }

        System.out.println("nums=" + Arrays.toString(input) + " expected=" + Arrays.toString(expected) + " actual=" + actual);
    }

    public void moveZeroes(int[] nums) {
        int writer = 0;

        for (int reader = 0; reader<nums.length; reader++) {
            if(nums[reader] != 0) {
                nums[writer++] = nums[reader];
            }
        }

        while (writer < nums.length) {
            nums[writer++] = 0;
        }

    }    
    
}
