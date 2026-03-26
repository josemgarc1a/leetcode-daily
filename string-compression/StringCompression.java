import java.util.Arrays;

public class StringCompression {

    public static void main(String[] args) {
        StringCompression solver = new StringCompression();

        runCase(solver, new char[] {'a', 'a', 'b', 'b', 'c', 'c', 'c'}, 6);
        runCase(solver, new char[] {'a'}, 1);
        runCase(solver, new char[] {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'}, 4);

        runCase(solver, new char[] {'a', 'a'}, 2);
        runCase(solver, new char[] {'a', 'b', 'c'}, 3);
        runCase(solver, new char[] {'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'}, 3);
        runCase(solver, new char[] {'!', '!', '!', 'a', 'a', 'b'}, 5);
        runCase(solver, new char[] {'a', 'a', 'a', 'b', 'b', 'c', 'c', 'c', 'c'}, 6);
    }

    private static void runCase(StringCompression solver, char[] input, int expectedLen) {
        char[] copy = Arrays.copyOf(input, input.length);
        int actualLen = solver.compress(copy);
        System.out.println("chars=" + Arrays.toString(input) + " expectedLen=" + expectedLen + " actualLen=" + actualLen);
    }

    public int compress(char[] chars) {
        if (chars.length <= 1) {return chars.length;}
        
        int charCounter = 1;
        int writeIndex = 0;
        for (int i=0; i<chars.length; i++) {
            if (i+1 >= chars.length || chars[i] != chars[i+1]) {
                chars[writeIndex++] = chars[i];
                if (charCounter > 1) {
                    for (char digit : String.valueOf(charCounter).toCharArray()) {
                        chars[writeIndex++] = digit;
                    }
                    charCounter=1;
                }
            } else {
                charCounter++;
            }    
        }
        return writeIndex;
    }
    
}
