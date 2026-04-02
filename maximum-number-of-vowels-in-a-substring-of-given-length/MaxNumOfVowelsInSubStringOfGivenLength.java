public class MaxNumOfVowelsInSubStringOfGivenLength {

    public static void main(String[] args) {
        MaxNumOfVowelsInSubStringOfGivenLength m = new MaxNumOfVowelsInSubStringOfGivenLength();
        int m1 = m.maxVowels("abciiidef", 3);
        System.out.println("M1: "+m1);
        m1 = m.maxVowels("aeiou", 2);
        System.out.println("M2: "+m1);
        m1 = m.maxVowels("leetcode", 3);
        System.out.println("M3: "+m1);
        m1 = m.maxVowels("weallloveyou", 7);
        System.out.println("M3: "+m1);
    }
    
    public int maxVowels(String s, int k) {
        String vowels = "aeiou";
        int vowelCounter = 0;
        int max = 0;
        char[] chars = s.toCharArray();
        for (int i=0; i<chars.length; i++) {
            if (vowelCounter==k) {
                return vowelCounter;
            }

            max = max > vowelCounter ? max : vowelCounter;

            if(i<k) {
                if (vowels.indexOf(chars[i]) > -1) vowelCounter++;
                continue;
            }

            if(vowels.indexOf(chars[i])>-1) {
                vowelCounter++;
            } 
            if((vowels.indexOf(chars[i-k])>-1)) {
                vowelCounter--;
            }
        }
        return max > vowelCounter ? max : vowelCounter;
    }

}
