public class IsSubsequence {

    public static void main (String[] args) {
        boolean test1 = IsSubsequence.isSubsequence("abc", "ahbgdc");
        boolean test2 = IsSubsequence.isSubsequence("axc", "ahbgdc");

    }

    public static boolean isSubsequence(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();
        
        if (sLength > tLength) return false;
        if (sLength == 0) return true;


        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        int tIndex = 0;
        int sIndex = 0;
        while (tIndex < tLength && sIndex < sLength) {
            // System.out.println("T: " + tChars[tIndex]);
            if (sChars[sIndex] == tChars[tIndex]) {
                // System.out.println("S on " + sIndex + ", found at tIndex:" + tIndex);
                sIndex++;
                if (sIndex == sLength) return true;
            }
            
            tIndex++;
        }

        return false;
    }

}
