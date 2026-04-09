import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindTheDifferenceOfTwoArrays {

    public static void main(String[] args) {
        FindTheDifferenceOfTwoArrays f = new FindTheDifferenceOfTwoArrays();
        f.findDifference(new int[]{1,2,3}, new int[]{2,4,6});
    }

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> n1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> temp = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> n2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        n1.removeAll(n2);
        n2.removeAll(temp);
        return List.of(List.copyOf(n1), List.copyOf(n2));
    }
    
}
