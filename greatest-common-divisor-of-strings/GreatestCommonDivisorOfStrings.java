
public class GreatestCommonDivisorOfStrings {

    public static void main(String args[]) {
        System.out.println("HOLA");
        String nominator = "LEET";
        String denominator = "CODE";
        String result = calculateGreatestCommonDivisorOfStrings(nominator, denominator);
        System.out.println(result);
    }

    private static String calculateGreatestCommonDivisorOfStrings(String t, String s) {
        //Check String pattern compatibility
        //If the strings are equal in both directions it means that 
        // they are formed out of the same patterns
        if (!(t+s).equals(s+t)) return "";

        //Compute the GDC out of the lenght of both Strings
        int tLength = t.length();
        int sLength = s.length();
        while (sLength>0) {
            int temp = sLength;
            sLength = tLength % sLength;
            tLength = temp;
        }

        //Return a slice of string of the size of the GDC
        return s.substring(0, tLength);
    }
    
}
