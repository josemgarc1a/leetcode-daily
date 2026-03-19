import java.util.Arrays;

public class CanPlaceFlowers {

    public static void main(String args[]){
        CanPlaceFlowers solver = new CanPlaceFlowers();

        int[] flowerbed1 = {1, 0, 0, 0, 1};
        int n1 = 1;
        boolean expected1 = true;
        boolean actual1 = solver.canPlaceFlowers(Arrays.copyOf(flowerbed1, flowerbed1.length), n1);
        System.out.println("flowerbed=" + Arrays.toString(flowerbed1) + ", n=" + n1 + ", expected=" + expected1 + ", actual=" + actual1);

        int[] flowerbed2 = {1, 0, 0, 0, 1};
        int n2 = 2;
        boolean expected2 = false;
        boolean actual2 = solver.canPlaceFlowers(Arrays.copyOf(flowerbed2, flowerbed2.length), n2);
        System.out.println("flowerbed=" + Arrays.toString(flowerbed2) + ", n=" + n2 + ", expected=" + expected2 + ", actual=" + actual2);

        int[] flowerbed3 = {0};
        int n3 = 1;
        boolean expected3 = true;
        boolean actual3 = solver.canPlaceFlowers(Arrays.copyOf(flowerbed3, flowerbed3.length), n3);
        System.out.println("flowerbed=" + Arrays.toString(flowerbed3) + ", n=" + n3 + ", expected=" + expected3 + ", actual=" + actual3);
    }
        
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        //iterate through the flower plots
        for(int i=0; i<flowerbed.length; i++) {
            if (n==0) return true;
            if (flowerbed[i]==0 &&
                    (i==0 || flowerbed[i-1]==0) &&
                    (i==flowerbed.length-1 || flowerbed[i+1]==0)) {
                flowerbed[i]=1;
                n--;
            }
        }
        return n<=0;
    }
}
