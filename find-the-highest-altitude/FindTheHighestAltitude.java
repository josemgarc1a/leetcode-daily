public class FindTheHighestAltitude {
    
    public static void main(String[] args) {
        FindTheHighestAltitude f = new FindTheHighestAltitude();
        int l = f.largestAltitude(new int[]{-5,1,5,0,-7});
        System.out.println("L: " + l);
        l = f.largestAltitude(new int[]{-4,-3,-2,-1,4,3,2});
        System.out.println("L2: " + l);

    }

    public int largestAltitude(int[] gain) {
        int l = 0;
        int max = l;
        int current = l;
        for (int i=0; i<gain.length; i++) {
            current = l + gain[i];
            max = Integer.max(current, max);
            l += gain[i];
        }
        return max;  
    }

}
