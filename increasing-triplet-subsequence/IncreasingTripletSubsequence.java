import java.lang.reflect.Method;
import java.util.Arrays;

public class IncreasingTripletSubsequence {

    public static void main(String[] args) {
        IncreasingTripletSubsequence solver = new IncreasingTripletSubsequence();

        runCase(solver, new int[] {1, 2, 3, 4, 5}, true);
        runCase(solver, new int[] {5, 4, 3, 2, 1}, false);
        runCase(solver, new int[] {2, 1, 5, 0, 4, 6}, true);

        runCase(solver, new int[] {1, 1, 1, 1}, false);
        runCase(solver, new int[] {2, 4, -2, -3}, false);
        runCase(solver, new int[] {20, 100, 10, 12, 5, 13}, true);
        runCase(solver, new int[] {20, 100, 21, 200, 22, 13}, true);
        runCase(solver, new int[] {2, 1, 2, 0, 3}, true);
        runCase(solver, new int[] {2, 2, 2, 2, 3, 4}, true);
    }

    private static void runCase(IncreasingTripletSubsequence solver, int[] nums, boolean expected) {
        String actual;
        try {
            Method m = solver.getClass().getDeclaredMethod("increasingTriplet", int[].class);
            Object result = m.invoke(solver, (Object) nums);
            actual = String.valueOf(result);
        } catch (NoSuchMethodException e) {
            actual = "<missing method: increasingTriplet(int[])>";
        } catch (Exception e) {
            actual = "<error: " + e.getClass().getSimpleName() + ">";
        }

        System.out.println("nums=" + Arrays.toString(nums) + " expected=" + expected + " actual=" + actual);
    }

    public boolean increasingTriplet(int[] nums) {
        int min = Integer.MAX_VALUE;
        int mid = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n <= min) {
                min = n;
            } else if (n <= mid) {
                mid = n;
            } else {
                return true;
            }
        }
        return false;

    }
}
