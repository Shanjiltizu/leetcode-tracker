// Last updated: 9/10/2026, 9:21:29 AM
class Solution {
    public int uniqueMorseRepresentations(String[] words) {
         String[] morse = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", 
                                     "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
                                     "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", 
                                     "-.--", "--.."};
        
        HashSet<String> uniqueTransformations = new HashSet<>();
        
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (char c : word.toCharArray()) {
                sb.append(morse[c - 'a']);
            }
            uniqueTransformations.add(sb.toString());
        }
        
        return uniqueTransformations.size();
        
    }
}