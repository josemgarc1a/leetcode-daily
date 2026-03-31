import java.util.HashMap;

public class MaxNumberOfKSumPairs {

    public static void main(String[] args) {
        MaxNumberOfKSumPairs m = new MaxNumberOfKSumPairs();
        // m.maxOperations(new int[]{1,2,3,4}, 5);
        m.maxOperations(new int[]{3,1,3,4,3}, 6);
        // m.maxOperations(new int[]{4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4}, 2);
    }

    public int maxOperations(int[] nums, int k) {
        int maxOperations = 0;
        HashMap<Integer, Integer> complements = new HashMap<>();
        for (int n : nums) {
            int complement = k - n;
            if( complements.containsKey(complement) && 
                complements.get(complement)>0) {
                maxOperations++;
                complements.put(complement, complements.get(complement)-1);
            } else {
                complements.put(n, complements.get(n)==null? 1 : complements.get(n)+1);
            }
        }
        System.out.println("MaxOperations: " + maxOperations);
        return maxOperations;
    }
    
}
