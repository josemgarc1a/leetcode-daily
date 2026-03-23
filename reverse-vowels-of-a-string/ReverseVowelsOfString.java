public class ReverseVowelsOfString {

    public static void main(String args[]) {
        ReverseVowelsOfString solver = new ReverseVowelsOfString();

        String input1 = "IceCreAm";
        String expected1 = "AceCreIm";
        System.out.println("input=\"" + input1 + "\" expected=\"" + expected1 + "\" actual=\"" + solver.reverseVowels(input1) + "\"");

        String input2 = "leetcode";
        String expected2 = "leotcede";
        System.out.println("input=\"" + input2 + "\" expected=\"" + expected2 + "\" actual=\"" + solver.reverseVowels(input2) + "\"");

        String input3 = "aA";
        String expected3 = "Aa";
        System.out.println("input=\"" + input3 + "\" expected=\"" + expected3 + "\" actual=\"" + solver.reverseVowels(input3) + "\"");

        String input4 = "bcdfg";
        String expected4 = "bcdfg";
        System.out.println("input=\"" + input4 + "\" expected=\"" + expected4 + "\" actual=\"" + solver.reverseVowels(input4) + "\"");
    }

    public String reverseVowels(String s) {
        char[] input = s.toCharArray();
        int leftPointer = 0;
        int rightPointer = input.length-1;
        while (leftPointer < rightPointer) {
            if (!isVowel(input[leftPointer])) { 
                leftPointer++;
                continue; 
            }
            
            if (!isVowel(input[rightPointer])) { 
                rightPointer--;
                continue; 
            } 
            
            char temp = input[leftPointer];
            input[leftPointer] = input[rightPointer];
            input[rightPointer] = temp;
            leftPointer++;
            rightPointer--;
        }
        
        return String.valueOf(input);
    }

    public boolean isVowel(char c) {
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || 
            c=='A' || c=='E' || c=='I' || c=='O' || c=='U';
    }
}
