public class ContainerWithMostWater {

    public static void main(String[] args) {
        ContainerWithMostWater c = new ContainerWithMostWater();
        c.maxArea(new int[]{1,8,6,2,5,4,8,3,7});
        c.maxArea(new int[]{1,1});

    }

    public int maxArea(int[] height) {
        //It is a two pointer kind of problem
        //Pointers start a 0 and length-1
        int i=0;
        int j=height.length-1;
        int minHeight = 0;
        int xGap = 0;
        int greatestArea = 0;
        //Find the area between the lines at these two points
        while (i < j) {
            minHeight = Math.min(height[i], height[j]);
            xGap = j - i;
            int area = minHeight * xGap;

            //Keep the value
            greatestArea =  area > greatestArea ? area : greatestArea;

            //Shift to the center the pointer with the smaller height (x if equal heights)
            if (height[i] >= height[j]) {
                j--;
            } else {
                i++;
            }
        }
        System.out.println(greatestArea);
        return greatestArea;
    }
    
}
