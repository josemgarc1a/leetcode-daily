import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumberOfCandies {

    public static void main(String args[]) {
        int[] candiesPerKid = {1,2,3,4,5,6};
        KidsWithGreatestNumberOfCandies.greatestNumberOfCandiesByKid(candiesPerKid, 3);
    }

    private static List<Boolean> greatestNumberOfCandiesByKid(int[] candiesPerKid, int extraCandy) {
        //calculate max
        int max = 0;
        for (int candies : candiesPerKid) {
            max = Math.max(candies, max);
        }

        //compare kids vs max
        List<Boolean> result = new ArrayList<>();
        for(int i=0; i<candiesPerKid.length; i++) {
            result.add(max <= candiesPerKid[i]+extraCandy);
        }
        System.out.println(result);
        return result;
    }
    
}
