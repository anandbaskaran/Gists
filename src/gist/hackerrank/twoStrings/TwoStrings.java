package gist.hackerrank.twoStrings;

public class TwoStrings {
    // Worst case execution time for this program is n^2. Can do better for sure

    public String twoStrings(String s1, String s2) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for(int i=0; i<alphabet.length() ; ++i){
            char chr = alphabet.charAt(i);
            if(s1.indexOf(chr) != -1 && s2.indexOf(chr) != -1){
                    return "YES";
            }
        }
        return "NO";
    }
}
