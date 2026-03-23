public class ReverseWordsInAString {

    public static void main(String[] args) {
        ReverseWordsInAString solver = new ReverseWordsInAString();

        runCase(solver, "the sky is blue", "blue is sky the");
        runCase(solver, "  hello world  ", "world hello");
        runCase(solver, "a good   example", "example good a");

        runCase(solver, "word", "word");
        runCase(solver, "   single   ", "single");
    }

    private static void runCase(ReverseWordsInAString solver, String input, String expected) {
        String actual;
        try {
            actual = solver.reverseWords(input);
        } catch (RuntimeException e) {
            actual = "<error: " + e.getClass().getSimpleName() + ">";
        }

        System.out.println("input=\"" + input + "\" expected=\"" + expected + "\" actual=\"" + actual + "\"");
    }
    
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        char[] c = s.trim().toCharArray();
        //iterate the string backwards
        int start = c.length-1;
        int end = c.length-1;
        while (start>=0) {
            if(c[end]==' '){ // Ignore the empty space
                end--;
                start--;
            } else if((start==0 || c[start]==' ') && c[end]!=' '){ //Full Word
                int wordStart = (c[start] == ' ') ? start + 1 : start;
                if (sb.length() > 0) {
                    sb.append(" ");
                }

                sb.append(new String(c, wordStart, end - wordStart + 1));
                start--;
                end=start;
            } else if(c[start]!=' ' && c[end]!=' ') { //Continue looking for next empty space
                start--;
            }
        }

        return sb.toString().trim();
    }
}
